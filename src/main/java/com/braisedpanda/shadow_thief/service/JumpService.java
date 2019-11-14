package com.braisedpanda.shadow_thief.service;

import com.braisedpanda.shadow_thief.model.Total;
import org.springframework.stereotype.Component;

@Component
public interface JumpService {
    Total getTotal();

    void addVisitors();

    void love_illustration();

    void love_design();

    void love_gif();
}
