package QuanLyHocVien;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {
    static ArrayList<Student> lstStudent =  new ArrayList<Student>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            Student s = new Student();
            System.out.println("Vui long nhap ma Hoc Vien: ");
            s.maHV = sc.nextLine();

            System.out.println("Vui long nhap ten Hoc Vien: ");
            s.tenHocVien = sc.nextLine();

            lstStudent.add(s);
            System.out.println("Ban co muon nhap tiep tuc 1 hoc vien moi? nhap yes de tiep tuc va no de ket thuc");
            String result = sc.nextLine();
            if(result.equals("yes")){
                continue;
            }else {
                break;
            }
        }


    }

}
