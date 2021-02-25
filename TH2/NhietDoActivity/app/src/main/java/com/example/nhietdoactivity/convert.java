package com.example.nhietdoactivity;

public class convert {
    private  double doF, doC;

    public convert() {
    }

    public double getDoF() {
        return doF;
    }

    public void setDoF(double doF) {
        this.doF = doF;
    }

    public double getDoC() {
        return doC;
    }

    public void setDoC(double doC) {
        this.doC = doC;
    }
    public void convertFtoC(){
        this.doC =  (this.doF - 32) *5/9;
    }
    public  void convertCtoF(){
        this.doF = (this.doC* 9/5) +32;
    }


}
