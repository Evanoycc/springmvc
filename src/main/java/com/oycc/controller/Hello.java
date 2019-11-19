package com.oycc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Description:
 * User: oycc
 * Date: 2019-11-18
 */
@Controller
public class Hello {
    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        return "success";
    }

    @RequestMapping(path = "/postParam",method = RequestMethod.POST)
//    @ResponseBody
    public String postParam(String name, Date date){
        System.out.println(name+":"+date);
        return "success";
    }
    @RequestMapping(path = "/testAnno",method = RequestMethod.GET)
//    @ResponseBody
    public String testAnno(@RequestParam("username") String name){
        System.out.println(name);
        return "success";
    }

}
