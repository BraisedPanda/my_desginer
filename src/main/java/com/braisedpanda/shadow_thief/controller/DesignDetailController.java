package com.braisedpanda.shadow_thief.controller;

import com.braisedpanda.shadow_thief.model.DesignDetail;
import com.braisedpanda.shadow_thief.service.DesignDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-15 10:12
 **/
@RestController
public class DesignDetailController {
    @Autowired
    DesignDetailService designDetailService;

    @RequestMapping("/designDetail/{id}")
    public ModelAndView yunzhangApp(ModelAndView modelAndView, @PathVariable("id") Integer id ){
        DesignDetail designDetail = designDetailService.getDesignDetailById(id);
        modelAndView.addObject("designDetail",designDetail);
        modelAndView.setViewName("design/yunzhangApp");
        return modelAndView;
    }


}
