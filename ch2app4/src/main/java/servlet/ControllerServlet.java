package servlet;

import action.PDFAction;
import util.DependencyInjector;

import javax.servlet.ReadListener;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Hao HOU on 2017/5/2.
 */
@WebServlet(name = "ControllerServlet", urlPatterns = {
        "/form", "/pdf"
})
public class ControllerServlet extends HttpServlet{

    private static final long serialVersionUID = -6395821976983329589L;
    private DependencyInjector dependencyInjector;

    @Override
    public void init(){
        dependencyInjector = new DependencyInjector();
        dependencyInjector.start();
    }

    @Override
    public void destroy(){
        dependencyInjector.shutDown();
    }

    protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ReadListener r = null;
        String uri = request.getRequestURI();

        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);
        if ("form".equals(action)){
            String dispatchUrl = "/jsp/Form.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(dispatchUrl);
            rd.forward(request, response);
        } else if ("pdf".equals(action)){
            HttpSession session = request.getSession(true);
            String sessionId = session.getId();
            PDFAction pdfAction = (PDFAction) dependencyInjector.getObject(PDFAction.class);
            String text = request.getParameter("text");
            String path = request.getServletContext().getRealPath("/result") + sessionId + ".pdf";
            pdfAction.createPDF(path, text);

            StringBuilder redirect = new StringBuilder();
            redirect.append(request.getScheme() + "://");
            redirect.append(request.getLocalName());

            int port = request.getLocalPort();
            if (port != 80){
                redirect.append(":" + port);
            }

            String contextPath = request.getContextPath();
            if (!"/".equals(contextPath)){
                redirect.append(contextPath);
            }
            redirect.append("/result/" + sessionId + ".pdf");
            System.out.println(redirect.toString());
            response.sendRedirect(redirect.toString());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        process(request, response);
    }
}
