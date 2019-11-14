package com.braisedpanda.shadow_thief.service;


import com.braisedpanda.shadow_thief.model.dto.IllustrationDto;
import org.springframework.stereotype.Component;


@Component
public interface IllustrationService {
    IllustrationDto list(int page);
}
