package org.example;

public class Testing {
    public static void main(String[] args) {
        HinhHoc h = new HinhHoc();
        h.tinhDienTich();

        h = new HinhVuong();
        h.tinhDienTich();

        h= new HinhChuNhat();
        h.tinhDienTich();
    }
}
