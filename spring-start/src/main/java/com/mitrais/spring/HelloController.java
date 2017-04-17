package com.mitrais.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String message) {
        return message;
    }
    
    @RequestMapping(value="/hello", method=RequestMethod.POST)
    @ResponseBody
    public String hello1(@RequestBody String message) {
        return message;
    }
    
    @RequestMapping(value="/hello/{message}", method=RequestMethod.PUT)
    @ResponseBody
    public String hello2(@PathVariable String message) {
        return message;
    }
}