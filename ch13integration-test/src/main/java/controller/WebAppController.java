package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;

/**
 * Created by Hao HOU on 2017/5/17.
 */
@ContextConfiguration
public class WebAppController {
    @Autowired
    private ServletContext servletContext;

    @RequestMapping(value = "/getWebAppDir")
    public String getWebAppDirectory(Model model) {
        model.addAttribute("webAppDir", servletContext.getRealPath("/"));
        return "success";
    }
}
