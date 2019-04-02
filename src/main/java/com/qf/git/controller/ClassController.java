package com.qf.git.controller;

import com.qf.git.entity.SClass;
import com.qf.git.service.ISclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {


    @Autowired
    private ISclassService sclassService;

    @RequestMapping("/getlist")
    public String getlist(){
       List<SClass> list= sclassService.getlist();
        System.out.println(list+"88");
        return "index";


    }
}
