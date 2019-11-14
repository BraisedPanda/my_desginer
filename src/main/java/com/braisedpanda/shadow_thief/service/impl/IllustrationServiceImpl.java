package com.braisedpanda.shadow_thief.service.impl;

import com.braisedpanda.shadow_thief.mapper.DesignMapper;
import com.braisedpanda.shadow_thief.mapper.IllustrationMapper;
import com.braisedpanda.shadow_thief.model.Design;
import com.braisedpanda.shadow_thief.model.Illustration;
import com.braisedpanda.shadow_thief.model.dto.DesignDto;
import com.braisedpanda.shadow_thief.model.dto.IllustrationDto;
import com.braisedpanda.shadow_thief.service.DesignService;
import com.braisedpanda.shadow_thief.service.IllustrationService;
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
public class IllustrationServiceImpl implements IllustrationService {
    @Autowired
    IllustrationMapper illustrationMapper;


    @Override
    public IllustrationDto list(int page) {
        PageHelper.startPage(page,6);
        List<Illustration> illustrationList = illustrationMapper.selectAll();
        PageInfo<Illustration> list = new PageInfo(illustrationList);
        int totalpage = list.getPages();
        List<Illustration> resultList = list.getList();
        IllustrationDto dto= new IllustrationDto();
        dto.setIllustrationDtoList(resultList);
        dto.setTotalPage(totalpage);
        return dto;
    }
}
