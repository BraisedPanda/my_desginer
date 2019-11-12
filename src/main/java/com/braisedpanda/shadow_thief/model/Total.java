package com.braisedpanda.shadow_thief.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-12 10:56
 **/
@Data
@Table(name = "total")
public class Total {
    @Id

    private Integer id;
    @Column(name = "visitors")
    private Integer visitors;
    @Column(name = "likes")
    private Integer likes;
    @Column(name = "product")
    private Integer product;
    @Column(name = "illustration")
    private Integer illustration;
    @Column(name = "design")
    private Integer design;
    @Column(name = "gif")
    private Integer gif;

}
