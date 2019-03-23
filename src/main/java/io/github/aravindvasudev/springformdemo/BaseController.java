package io.github.aravindvasudev.springformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/submit")
    public String submit() {
        return "submit";
    }
}
