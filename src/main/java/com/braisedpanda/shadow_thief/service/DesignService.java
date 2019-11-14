package com.braisedpanda.shadow_thief.service;


import com.braisedpanda.shadow_thief.model.dto.DesignDto;
import org.springframework.stereotype.Component;



@Component
public interface DesignService {
    DesignDto list(int page);
}
