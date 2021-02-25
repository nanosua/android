package com.example.th5_createappnew;

public class bmiclass {
    private double h,w;

    public bmiclass(double h, double w) {
        this.h = h;
        this.w = w;
    }
    public double getBMI(){
        double bmi = w /(h*h);
        return bmi;
    }
    public String getChanDoan(){
        double bmi =this.getBMI();
        String kq ="";
        if(bmi <18) {
            kq ="Gầy";
        }else if(bmi <= 24.9){
            kq ="Bình thường";
        }else if(bmi<= 29.9){
            kq ="Béo phì độ I";
        }
        else if(bmi<= 34.9){
            kq ="Béo phì độ II";
        }else{
            kq ="Béo phì độ III";
        }
        return kq;
    }
}
