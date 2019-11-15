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
 * @create: 2019-11-15 09:45
 **/
@Data
@Table(name="designdetail")
public class DesignDetail implements Serializable {
    private static final long serialVersionUID = -2180697622488622952L;
    @Id
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "introduction1")
    private String introduction1;
    @Column(name = "url1")
    private String url1;
    @Column(name = "url2")
    private String url2;
    @Column(name = "url3")
    private String url3;
    @Column(name = "url4")
    private String url4;
    @Column(name = "url5")
    private String url5;
    @Column(name = "introduction2")
    private String introduction2;
    @Column(name = "fuze1")
    private String fuze1;
    @Column(name = "fuze2")
    private String fuze2;
    @Column(name = "fuze3")
    private String fuze3;

    @Column(name = "surl1")
    private String surl1;
    @Column(name = "stitle1")
    private String stitle1;
    @Column(name = "sintroduction1")
    private String sintroduction1;
    @Column(name = "shref1")
    private String shref1;
    @Column(name = "surl2")
    private String surl2;
    @Column(name = "stitle2")
    private String stitle2;
    @Column(name = "sintroduction2")
    private String sintroduction2;
    @Column(name = "shref2")
    private String shref2;
    @Column(name = "surl3")

    private String surl3;
    @Column(name = "stitle3")
    private String stitle3;
    @Column(name = "sintroduction3")
    private String sintroduction3;
    @Column(name = "shref3")
    private String shref3;
    @Column(name = "surl4")

    private String surl4;
    @Column(name = "stitle4")
    private String stitle4;
    @Column(name = "sintroduction4")
    private String sintroduction4;
    @Column(name = "shref4")
    private String shref4;
    @Column(name = "surl5")

    private String surl5;
    @Column(name = "stitle5")
    private String stitle5;
    @Column(name = "sintroduction5")
    private String sintroduction5;
    @Column(name = "shref5")
    private String shref5;


}
