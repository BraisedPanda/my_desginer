package com.braisedpanda.shadow_thief.controller;


import com.braisedpanda.shadow_thief.model.Total;
import com.braisedpanda.shadow_thief.service.JumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-06 11:20
 **/
@RestController
public class JumpController {

    @Autowired
    JumpService designService;

    @RequestMapping("")
    public ModelAndView toIndex(ModelAndView modelAndView,HttpServletRequest request){
        /**
         * @Description: 获取ip地址
         * @author: chenzhen
         * @Date: 2019/11/18 0018
         */
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        designService.addVisitors(ip);
        Total total  = designService.getTotal();
        int likes = total.getIllustration()+total.getGif()+total.getDesign();
        int visitors = total.getVisitors();
        int products = total.getProduct();
        modelAndView.setViewName("index");

        modelAndView.addObject("visitors",visitors);
        modelAndView.addObject("likes",likes);
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest request){
        /**
        * @Description: 获取ip地址
        * @author: chenzhen
        * @Date: 2019/11/18 0018
        */
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }


        designService.addVisitors(ip);
        Total total  = designService.getTotal();
        int visitors = total.getVisitors();
        int likes = total.getIllustration()+total.getGif()+total.getDesign();
        int products = total.getProduct();
        modelAndView.setViewName("index");
        modelAndView.addObject("visitors",visitors);
        modelAndView.addObject("likes",likes);
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @RequestMapping("/demo")
    public ModelAndView about(){
        return new ModelAndView("demo");
    }






    @RequestMapping("/contact")
    public ModelAndView contact(){
        return new ModelAndView("zuopingji/contact2");
    }


    @ResponseBody
    @RequestMapping("/love_illustration")
    public void love_illustration(){

        designService.love_illustration();
    }

    @ResponseBody
    @RequestMapping("/love_design")
    public void love_design(){
        designService.love_design();
    }

    @ResponseBody
    @RequestMapping("/love_gif")
    public void love_gif(){
        designService.love_gif();
    }

}
