package com.braisedpanda.shadow_thief.controller;

import com.braisedpanda.shadow_thief.model.Design;
import com.braisedpanda.shadow_thief.model.Illustration;
import com.braisedpanda.shadow_thief.model.Total;
import com.braisedpanda.shadow_thief.model.dto.DesignDto;
import com.braisedpanda.shadow_thief.model.dto.IllustrationDto;
import com.braisedpanda.shadow_thief.service.DesignService;
import com.braisedpanda.shadow_thief.service.IllustrationService;
import com.braisedpanda.shadow_thief.service.JumpService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class IllustrationController {
    @Autowired
    IllustrationService illustrationService;
    @Autowired
    JumpService jupmService;


    @RequestMapping("my_illustration")
    public ModelAndView my_design2(ModelAndView modelAndView,Integer page){
        Total total  = jupmService.getTotal();
        int illustration = total.getIllustration();

        IllustrationDto dto = illustrationService.list(page);
        List<Illustration> illustrationList = dto.getIllustrationDtoList();

        modelAndView.addObject("illustrationList",illustrationList);
        modelAndView.addObject("illustration",illustration);
        modelAndView.addObject("totalPage",dto.getTotalPage());
        modelAndView.addObject("startPage",page);
        modelAndView.setViewName("zuopingji/my_illustration");
        return modelAndView;
    }


}
