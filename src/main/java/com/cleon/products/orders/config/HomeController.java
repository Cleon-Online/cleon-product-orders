package com.cleon.products.orders.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: HomeController
 * Inside the package - com.cleon.products.orders.config
 * Created Date: 4/11/2020
 * Created Time: 5:05 PM
 **/
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
