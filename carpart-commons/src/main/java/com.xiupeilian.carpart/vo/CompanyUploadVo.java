package com.xiupeilian.carpart.vo;


public class CompanyUploadVo {
    private Integer id;
    private String picture;
    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CompanyUploadVo{" +
                "id=" + id +
                ", picture='" + picture + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
