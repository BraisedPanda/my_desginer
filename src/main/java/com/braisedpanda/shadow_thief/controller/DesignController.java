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
        return new ModelAndView("zuopingji/about");
    }
    @RequestMapping("/treatments")
    public ModelAndView treatments(){
        return new ModelAndView("zuopingji/treatments");
    }
    @RequestMapping("/my_design")
    public ModelAndView specialists(){
        return new ModelAndView("zuopingji/my_design");
    }
    @RequestMapping("/my_illustration")
    public ModelAndView pricing(){
        return new ModelAndView("zuopingji/my_illustration");
    }
    @RequestMapping("/my_gif")
    public ModelAndView blog(){
        return new ModelAndView("zuopingji/my_gif");
    }
    @RequestMapping("/contact")
    public ModelAndView contact(){
        return new ModelAndView("zuopingji/contact");
    }


}
