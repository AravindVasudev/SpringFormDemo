package com.example.SpringFormDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Duniya!";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
