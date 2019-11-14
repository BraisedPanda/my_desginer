package com.braisedpanda.shadow_thief.service;


import com.braisedpanda.shadow_thief.model.dto.GifDto;
import org.springframework.stereotype.Component;


@Component
public interface GifService {
    GifDto list(int page);
}
