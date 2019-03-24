package io.github.aravindvasudev.springformdemo;

import io.github.aravindvasudev.springformdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class BaseController {
    private static final Logger LOGGER = Logger.getLogger(BaseController.class.getName());

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping("/submit")
    public String submit(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
        LOGGER.log(Level.INFO, user.toString());

        return bindingResult.hasErrors() ? "index" : "submit";
    }
}
