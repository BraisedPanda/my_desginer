package com.braisedpanda.shadow_thief.controller;

import com.braisedpanda.shadow_thief.model.Design;
import com.braisedpanda.shadow_thief.model.Total;
import com.braisedpanda.shadow_thief.model.dto.DesignDto;
import com.braisedpanda.shadow_thief.service.JumpService;
import com.braisedpanda.shadow_thief.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-14 14:17
 **/
@RestController
public class DesignController {
    @Autowired
    DesignService designService;
    @Autowired
    JumpService jumpService;


    @RequestMapping("design/{page}")
    public ModelAndView my_design2(ModelAndView modelAndView,@PathVariable("page") Integer page){
        Total total  = jumpService.getTotal();
        int design = total.getDesign();

        DesignDto dto = designService.list(page);
        List<Design> designList = dto.getDesignList();

        modelAndView.addObject("designList",designList);
        modelAndView.addObject("design",design);
        modelAndView.addObject("totalPage",dto.getTotalPage());
        modelAndView.addObject("startPage",page);
        modelAndView.setViewName("zuopingji/my_design2");
        return modelAndView;
    }


}
