package com.example.homeworklesson5;

public class LanguegeModel {


        private String title, description;
        private int image;

    public LanguegeModel(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
