package com.example.bookfood_sms;

public class ItemsList {
    private String foodName, foodLink, foodLocation;
    private int foodImage;
    public ItemsList() {}
    public ItemsList(int foodImage, String foodLink, String foodName, String foodLocation)
    {         this.foodImage = foodImage;
        this.foodLink = foodLink;
        this.foodName = foodName;


        this.foodLocation = foodLocation;
    }    public String getFoodName()
    {
        return foodName;    	}
    public String getFoodLink()
    {        return foodLink;    	}
    public String getFoodLocation() {
        return foodLocation;	}
    public int getFoodImage() {
        return foodImage;    }
    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;    }
    public void setFoodLink(String foodLink) {
        this.foodLink = foodLink;    }
    public void setFoodLocation(String foodLocation) {
        this.foodLocation = foodLocation;    }
}
