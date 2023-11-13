package com.example.nesnetabanliprogramlama.collections.examples;

public class Ogrenci {

    private int okulNo;
    private String ogrenciAdı;

    public Ogrenci() {
    }

    public Ogrenci(int okulNo, String ogrenciAdı) {
        this.okulNo = okulNo;
        this.ogrenciAdı = ogrenciAdı;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getOgrenciAdı() {
        return ogrenciAdı;
    }

    public void setOgrenciAdı(String ogrenciAdı) {
        this.ogrenciAdı = ogrenciAdı;
    }
}
