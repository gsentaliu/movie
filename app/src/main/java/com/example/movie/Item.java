package com.example.movie;

public class Item {
    private String mImageUrl;
    private String mTitle;
    private String mDescription;

    public Item(String imageUrl, String title, String description){
        mImageUrl = imageUrl;
        mTitle = title;
        mDescription = description;
    }

    public String getImageUrl(){
        return "https://image.tmdb.org/t/p/w500" + mImageUrl;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getDescription(){
        return mDescription;
    }
}
