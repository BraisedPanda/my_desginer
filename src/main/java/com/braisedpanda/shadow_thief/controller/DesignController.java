package com.braisedpanda.shadow_thief.controller;


import com.braisedpanda.shadow_thief.model.Total;
import com.braisedpanda.shadow_thief.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-06 11:20
 **/
@RestController
public class DesignController {

    @Autowired
    DesignService designService;

    @RequestMapping("")
    public ModelAndView toIndex(ModelAndView modelAndView){
        designService.addVisitors();
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
    public ModelAndView index(ModelAndView modelAndView){
        designService.addVisitors();
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

    @RequestMapping("/about")
    public ModelAndView about(){
        return new ModelAndView("zuopingji/about");
    }
    @RequestMapping("/yunzhangApp")
    public ModelAndView yunzhangApp(){
        return new ModelAndView("design/yunzhangApp");
    }
    @RequestMapping("/my_design")
    public ModelAndView specialists(ModelAndView modelAndView){
        Total total  = designService.getTotal();
        int design = total.getDesign();
        modelAndView.setViewName("zuopingji/my_design");
        modelAndView.addObject("design",design);
        return modelAndView;

    }
    @RequestMapping("/my_gif")
    public ModelAndView my_gif(ModelAndView modelAndView){
        Total total  = designService.getTotal();
        int gif = total.getGif();
        modelAndView.setViewName("zuopingji/my_gif");
        modelAndView.addObject("gif",gif);
        return modelAndView;

    }
    @RequestMapping("/my_illustration")
    public ModelAndView pricing(ModelAndView modelAndView){
        Total total  = designService.getTotal();
        int illustration = total.getIllustration();
        modelAndView.setViewName("zuopingji/my_illustration");
        modelAndView.addObject("illustration",illustration);

        return modelAndView;

    }


    @RequestMapping("/contact")
    public ModelAndView contact(){
        return new ModelAndView("zuopingji/contact2");
    }
    @RequestMapping("/my_design2")
    public ModelAndView my_design2(){
        return new ModelAndView("zuopingji/my_design2");
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
