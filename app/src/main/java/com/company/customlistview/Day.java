package com.company.customlistview;

public class Day {


    // custom class
    // model
    // pojo  plain old java object

    private String day;
    private String number;
    private int imageId;


    public Day(String day, String number, int imageId) {
        this.day = day;
        this.number = number;
        this.imageId = imageId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
