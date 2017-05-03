package app1.controller;

import app1.action.SaveProductAction;
import app1.form.ProductForm;
import app1.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by Hao on 2017/4/28.
 */
@WebServlet(name = "ControllerServlet", urlPatterns = {
        "/input-product", "save-product"
})
public class ControllerServlet extends HttpServlet{

    private static final long serialVersionUID = 8756073319089682231L;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        process(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String uri = request.getRequestURI();
        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);

        String dipatchUrl = null;
        if ("input-product".equals(action)){
            dipatchUrl = "/jsp/ProductForm.jsp";
        } else if ("save-product".equals(action)){
            ProductForm productForm = new ProductForm();
            productForm.setName(request.getParameter("name"));
            productForm.setDescription(request.getParameter("description"));
            productForm.setPrice(request.getParameter("price"));

            Product product = new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            try{
                product.setPrice(new BigDecimal(productForm.getPrice()));
            } catch (NumberFormatException e){
                //TODO
            }

            SaveProductAction saveProductAction = new SaveProductAction();
            saveProductAction.save(product);

            request.setAttribute("product", product);
            dipatchUrl = "/jsp/ProductDetails.jsp";
        }

        if (dipatchUrl != null){
            RequestDispatcher rd = request.getRequestDispatcher(dipatchUrl);
            rd.forward(request, response);
        }
    }
}
