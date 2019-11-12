package com.braisedpanda.shadow_thief.service.impl;

import com.braisedpanda.shadow_thief.mapper.DesignMapper;
import com.braisedpanda.shadow_thief.model.Total;
import com.braisedpanda.shadow_thief.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-12 14:04
 **/
@Service
public class DesignServiceImpl implements DesignService{
    @Autowired
    DesignMapper designMapper;

    @Override
    public Total getTotal() {

        return designMapper.selectByPrimaryKey(1);
    }

    @Override
    public void addVisitors() {
        Total total = designMapper.selectByPrimaryKey(1);
        total.setVisitors(total.getVisitors()+1);
        designMapper.updateByPrimaryKey(total);

    }

    @Override
    public void love_illustration() {
        Total total = designMapper.selectByPrimaryKey(1);
        total.setIllustration(total.getIllustration()+1);

        designMapper.updateByPrimaryKey(total);

    }

    @Override
    public void love_design() {
        Total total = designMapper.selectByPrimaryKey(1);
        total.setDesign(total.getDesign()+1);
        designMapper.updateByPrimaryKey(total);
    }

    @Override
    public void love_gif() {
        Total total = designMapper.selectByPrimaryKey(1);
        total.setGif(total.getGif()+1);
        designMapper.updateByPrimaryKey(total);
    }
}
