package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    //demo overloading
    public void tinhChuVi(int chieuDai, int chieuRong){
        System.out.println((chieuDai+chieuRong)*2);
    }
    public void tinhChuVi(int banKinh){
        System.out.println(2*Math.PI*banKinh);
    }

    public static void main( String[] args )
    {
        App a = new App();
        a.tinhChuVi(10);
        a.tinhChuVi(1,2);

    }
}
