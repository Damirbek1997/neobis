package com.example.week10.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello world!";
    }
}
