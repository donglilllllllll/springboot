package com.itheima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private Environment env;
    @GetMapping("/getid")
    public String getbyid(){
        System.out.println("spring boot -------------running");
        System.out.println(env.getProperty("datasource.driver"));
        System.out.println(env.getProperty("tempDir2"));
        System.out.println(env.getProperty("tempDir"));
        System.out.println(env.getProperty("enterprise.subject[0]"));
      return "springboot is running";
    }
}
