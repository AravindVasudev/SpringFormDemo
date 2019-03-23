package io.github.aravindvasudev.springformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class BaseController {
    private static final Logger LOGGER = Logger.getLogger(BaseController.class.getName());

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/submit")
    public String submit(HttpServletRequest request, Model model) {
        LOGGER.log(Level.INFO, String.format("NAME: %s | AGE: %s | EMAIL: %s",
                request.getParameter("name"), request.getParameter("age"), request.getParameter("email")));

        return "submit";
    }
}
