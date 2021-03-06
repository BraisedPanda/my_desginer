package com.braisedpanda.shadow_thief.service.impl;

import com.braisedpanda.shadow_thief.mapper.DesignMapper;
import com.braisedpanda.shadow_thief.model.Design;
import com.braisedpanda.shadow_thief.model.dto.DesignDto;
import com.braisedpanda.shadow_thief.service.DesignService;
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
public class DesignServiceImpl implements DesignService {
    @Autowired
    DesignMapper designMapper;


    @Override
    public DesignDto list(int page) {
        PageHelper.startPage(page,6);
        List<Design> designList = designMapper.selectAll();
        PageInfo<Design> list = new PageInfo(designList);
        int totalpage = list.getPages();
        List<Design> resultList = list.getList();
        DesignDto dto= new DesignDto();
        dto.setDesignList(resultList);
        dto.setTotalPage(totalpage);
        return dto;
    }
}
