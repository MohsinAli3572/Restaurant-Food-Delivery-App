package com.example.restaurantfooddelivery.model;

public class NearBy {

    String name;
    Integer imageUrl;
    String Time;

    public NearBy(String name, Integer imageUrl, String time) {
        this.name = name;
        this.imageUrl = imageUrl;
        Time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
