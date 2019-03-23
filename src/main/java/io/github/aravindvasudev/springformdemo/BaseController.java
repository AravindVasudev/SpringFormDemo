package io.github.aravindvasudev.springformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/submit")
    public String submit(HttpServletRequest request, Model model) {
        System.out.printf("NAME: %s\nAGE: %s\nEMAIL: %s\n\n",
                request.getParameter("name"), request.getParameter("age"), request.getParameter("email"));

        return "submit";
    }
}
