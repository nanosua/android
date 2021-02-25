package com.example.th5_createappnew;

public class AmLich {
    private String[] can ={ "Canh ","Tân ","Nhâm","Quý","Giáp","Ất ","Bính","Đinh","Mậu","Kỷ"};
    private String[] chi ={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
    private int namDuongLich;

    public  AmLich (int nam)
    {
        this.namDuongLich =nam;
    }
    public String getNamAL(){
        String can = this.can[namDuongLich % 10];
        String chi = this.can[namDuongLich % 12];
        return can + ""+ chi    ;
    }
}
