package com.example.ext_server.po;

public class Ext {

    private Integer id;

    private String post;

    private String decr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDecr() {
        return decr;
    }

    public void setDecr(String decr) {
        this.decr = decr;
    }

    @Override
    public String toString() {
        return "Ext{" +
                "id=" + id +
                ", post='" + post + '\'' +
                ", decr='" + decr + '\'' +
                '}';
    }
}
