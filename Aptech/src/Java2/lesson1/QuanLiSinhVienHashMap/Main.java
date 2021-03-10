/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson1.QuanLiSinhVienHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Student> studentList = new HashMap<>();
        int choose;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    System.out.println("So luong sinh vien muon nhap:");
                    int select = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < select; i++) {
                        Student student = new Student();
                        student.input();
                        studentList.put(student.rollNo, student);
                    }
                    break;
                case 2:
                    studentList.entrySet().forEach((sinhVien) -> {
                        System.out.println(sinhVien);
                    });
                    break;
                case 3:
                    System.out.println("Nhap ma sinh vien can tim kiem:");
                    int check = 0;
                    String msv = scan.nextLine();
                    for (Map.Entry<String, Student> sinhVien : studentList.entrySet()) {
                        if(sinhVien.getKey().equalsIgnoreCase(msv)){
                            System.out.println("Da tim thay!!");
                            System.out.println(sinhVien);
                            check++;
                            break;
                        }
                    }
                    if(check == 0) System.out.println("Khong tim thay sinh vien!!");
                    break;
                case 4:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
            
        }while(choose != 4 );
    }
    
    static void showMenu(){
        System.out.println("1.Nhap N sinh vien");
        System.out.println("2.In thong tin sinh vien");
        System.out.println("3.Tim kiem sinh vien theo Rollno");
        System.out.println("4.Thoat");
    }
}
