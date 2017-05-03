package app2.filter;

import app2.action.SaveProductAction;
import app2.form.ProductForm;
import app2.model.Product;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by Hao on 2017/4/28.
 */
@WebFilter(filterName = "DispatcherFilter", urlPatterns = {"/*"})
public class DispatcherFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
        //TODO
    }
    @Override
    public void destroy(){

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException{
        HttpServletRequest req = (HttpServletRequest) request;
        String uri =  req.getRequestURI();

        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);
        String dispatchUrl = null;
        if ("input-product".equals(action)){
            //do nothing
            dispatchUrl = "/jsp/ProductForm.jsp";
        } else if ("save-product".equals(action)){
            ProductForm productForm = new ProductForm();
            productForm.setName(request.getParameter("name"));
            productForm.setDescription(request.getParameter("description"));
            productForm.setPrice(request.getParameter("price"));

            Product product = new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            try {
                product.setPrice(new BigDecimal(productForm.getPrice()));
            } catch (NumberFormatException e){
                //TODO
            }

            SaveProductAction saveProductAction = new SaveProductAction();
            saveProductAction.save(product);

            request.setAttribute("product", product);
            dispatchUrl = "/jsp/ProductDetails.jsp";
        }

        if (dispatchUrl != null){
            RequestDispatcher rd = request.getRequestDispatcher(dispatchUrl);
            rd.forward(request, response);
        } else {
            filterChain.doFilter(request, response);
        }
    }
}
