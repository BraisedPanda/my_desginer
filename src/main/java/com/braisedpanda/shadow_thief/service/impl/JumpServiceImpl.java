package com.braisedpanda.shadow_thief.service.impl;

import com.braisedpanda.shadow_thief.mapper.TotalMapper;
import com.braisedpanda.shadow_thief.model.Total;
import com.braisedpanda.shadow_thief.service.JumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-12 14:04
 **/
@Service
public class JumpServiceImpl implements JumpService {
    @Autowired
    TotalMapper designMapper;

    @Override
    public Total getTotal() {

        return designMapper.selectByPrimaryKey(1);
    }

    @Override
    public void addVisitors(String ip) {
        Total total = designMapper.selectByPrimaryKey(1);
        total.setVisitors(total.getVisitors()+1);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        total.setTimestamps(date);
        total.setIpaddr(ip);
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
