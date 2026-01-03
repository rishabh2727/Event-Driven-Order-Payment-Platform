package com.example.mystore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// we have to add annotations to classes so spring can identify which class is what.
//it a way to tell spring that this class will handle the web requests.

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index.html";

    }


}

