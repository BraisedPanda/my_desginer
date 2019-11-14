package com.braisedpanda.shadow_thief.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @program: my_designer
 * @description:
 * @author: chenzhen
 * @create: 2019-11-14 14:08
 **/
@Data
@Table(name = "design")
public class Design implements Serializable{
    private static final long serialVersionUID = 5579395894275227189L;
    @Id
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "describee")
    private String describe;
    @Column(name = "yearr")
    private String year;
    @Column(name = "monthh")
    private String month;
    @Column(name = "dayy")
    private String day;
    @Column(name = "url")
    private String url;
    @Column(name = "href")
    private String href;

}
