package com.braisedpanda.shadow_thief.service.impl;

import com.braisedpanda.shadow_thief.mapper.DesignMapper;
import com.braisedpanda.shadow_thief.mapper.GifMapper;
import com.braisedpanda.shadow_thief.model.Design;
import com.braisedpanda.shadow_thief.model.Gif;
import com.braisedpanda.shadow_thief.model.dto.DesignDto;
import com.braisedpanda.shadow_thief.model.dto.GifDto;
import com.braisedpanda.shadow_thief.service.DesignService;
import com.braisedpanda.shadow_thief.service.GifService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-14 14:15
 **/
@Service
public class GifServiceImpl implements GifService {
    @Autowired
    GifMapper gifMapper;


    @Override
    public GifDto list(int page) {
        PageHelper.startPage(page,6);
        List<Gif> gifList = gifMapper.selectAll();
        PageInfo<Gif> list = new PageInfo(gifList);
        int totalpage = list.getPages();
        List<Gif> resultList = list.getList();
        GifDto dto= new GifDto();
        dto.setGifList(resultList);
        dto.setTotalPage(totalpage);
        return dto;
    }
}
