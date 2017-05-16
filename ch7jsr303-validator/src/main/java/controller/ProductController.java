package controller;

import domain.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by Hao HOU on 2017/5/8.
 */
@Controller
public class ProductController {
    private static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value = "/add-product")
    public String inputProduct(Model model) {
        model.addAttribute("product", new Product());
        return "ProductForm";
    }

    @RequestMapping(value = "/save-product")
    public String saveProduct(@Valid @ModelAttribute Product product, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            logger.debug("Code: " + fieldError.getCode() + ",object: " + fieldError.getObjectName() + ", field: "
                    + fieldError.getField());
            return "ProductForm";
        }

        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
