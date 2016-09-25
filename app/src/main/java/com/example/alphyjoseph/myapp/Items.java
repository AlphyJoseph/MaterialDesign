package com.example.alphyjoseph.myapp;

/**
 * Created by Alphy Joseph on 9/25/2016.
 */
public class Items {
    public Items(int image_id,String name)
    {
        this.setImage_id(image_id);
        this.setName(name);
    }

    private int image_id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
