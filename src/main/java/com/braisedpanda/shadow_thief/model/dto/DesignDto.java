package com.braisedpanda.shadow_thief.model.dto;

import com.braisedpanda.shadow_thief.model.Design;
import lombok.Data;

import java.util.List;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-14 15:56
 **/
@Data
public class DesignDto {
    private List<Design> designList;
    private Integer totalPage;
}
