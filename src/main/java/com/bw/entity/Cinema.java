package com.bw.entity;

public class Cinema {
    private  Integer id;
    private  String name;
    private  String author;
    private  String price;
    private  String startDate;
    private  String type;
    private Boolean status;
    private  String picture;

    public Cinema(Integer id, String name, String author, String price, String startDate, String type, Boolean status, String picture) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.startDate = startDate;
        this.type = type;
        this.status = status;
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Cinema() {
    }

    public Cinema(Integer id, String name, String author, String price, String startDate, String type, Boolean status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.startDate = startDate;
        this.type = type;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", startDate='" + startDate + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
