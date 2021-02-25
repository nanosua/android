package com.example.th2_bai_2;

public class thongtinClass {
    private  String hoten,cmnd,sothich,trinhdo;

    public thongtinClass(String hoten, String cmnd, String sothich, String trinhdo) {
        this.hoten = hoten;
        this.cmnd = cmnd;
        this.sothich = sothich;
        this.trinhdo = trinhdo;
    }
    public String toString(){
        String s ="";
            s+= "Xin chào: " + hoten+" CMND: "+cmnd +" Trình độ: " + trinhdo + " Sở thích: " + sothich;
        return s;
    }
}
