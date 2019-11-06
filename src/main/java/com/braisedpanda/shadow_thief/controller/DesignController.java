package com.braisedpanda.shadow_thief.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-06 11:20
 **/
@Controller
public class DesignController {

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
    @RequestMapping("/about")
    public ModelAndView about(){
        return new ModelAndView("energen/about");
    }
    @RequestMapping("/treatments")
    public ModelAndView treatments(){
        return new ModelAndView("energen/treatments");
    }
    @RequestMapping("/specialists")
    public ModelAndView specialists(){
        return new ModelAndView("energen/specialists");
    }
    @RequestMapping("/pricing")
    public ModelAndView pricing(){
        return new ModelAndView("energen/pricing");
    }
    @RequestMapping("/blog")
    public ModelAndView blog(){
        return new ModelAndView("energen/blog");
    }
    @RequestMapping("/contact")
    public ModelAndView contact(){
        return new ModelAndView("energen/contact");
    }


}
