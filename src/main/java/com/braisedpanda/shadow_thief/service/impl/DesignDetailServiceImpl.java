package com.braisedpanda.shadow_thief.service.impl;

import com.braisedpanda.shadow_thief.mapper.DesignDetailMapper;
import com.braisedpanda.shadow_thief.model.DesignDetail;
import com.braisedpanda.shadow_thief.service.DesignDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-15 10:10
 **/
@Service
public class DesignDetailServiceImpl implements DesignDetailService{
    @Autowired
    DesignDetailMapper designDetailMapper;

    @Override
    public DesignDetail getDesignDetailById(Integer id) {
        DesignDetail designDetail = designDetailMapper.selectByPrimaryKey(id);

        return designDetail;
    }
}
