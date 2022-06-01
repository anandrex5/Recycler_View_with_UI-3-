package com.example.recyclerview3;

public class ModelClass {

//1- declare that items use in xml


    private int imageview1;
    private String textview1;


//3-Constructor

    public ModelClass(int imageview1, String textview1) {
        this.imageview1 = imageview1;
        this.textview1 = textview1;
    }

//2-getter and setter
    public int getImageview1() {
        return imageview1;
    }

    public void setImageview1(int imageview1) {
        this.imageview1 = imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public void setTextview1(String textview1) {
        this.textview1 = textview1;
    }
}
