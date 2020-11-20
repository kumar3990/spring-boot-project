package com.learning.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Kumar";
    }


    @GetMapping("/hello2")
    public String hello2(HttpServletRequest request)
    {

        return request.getServletContext().getAttribute("age") + " Kumar";
    }

}
