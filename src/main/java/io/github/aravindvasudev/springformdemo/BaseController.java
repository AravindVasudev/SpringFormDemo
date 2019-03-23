package io.github.aravindvasudev.springformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "This works! :)";
    }
}
