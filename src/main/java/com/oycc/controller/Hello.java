package com.oycc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
