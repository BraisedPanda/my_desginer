package com.braisedpanda.shadow_thief.service;

import com.braisedpanda.shadow_thief.model.DesignDetail;
import org.springframework.stereotype.Component;


@Component
public interface DesignDetailService {
    DesignDetail getDesignDetailById(Integer id);
}
