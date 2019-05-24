package com.mybatis.entity;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer id;

    private String sheng;

    private String shi;

    private String qu;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu == null ? null : qu.trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                ", qu='" + qu + '\'' +
                '}';
    }
}