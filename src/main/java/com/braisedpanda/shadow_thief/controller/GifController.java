package com.braisedpanda.shadow_thief.controller;

import com.braisedpanda.shadow_thief.model.Design;
import com.braisedpanda.shadow_thief.model.Gif;
import com.braisedpanda.shadow_thief.model.Total;
import com.braisedpanda.shadow_thief.model.dto.DesignDto;
import com.braisedpanda.shadow_thief.model.dto.GifDto;
import com.braisedpanda.shadow_thief.service.DesignService;
import com.braisedpanda.shadow_thief.service.GifService;
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
public class GifController {
    @Autowired
    GifService gifService;
    @Autowired
    JumpService jumpService;


    @RequestMapping("my_gif")
    public ModelAndView my_design2(ModelAndView modelAndView,Integer page){
        Total total  = jumpService.getTotal();
        int gif = total.getGif();

        GifDto dto = gifService.list(page);
        List<Gif> gifList = dto.getGifList();

        modelAndView.addObject("gifList",gifList);
        modelAndView.addObject("gif",gif);
        modelAndView.addObject("totalPage",dto.getTotalPage());
        modelAndView.addObject("startPage",page);
        modelAndView.setViewName("zuopingji/my_gif");
        return modelAndView;
    }


}
