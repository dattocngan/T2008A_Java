/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson1.QuanLiSinhVienHashMap;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Student {
    String rollNo, name, sex, email, address;
    int age;

    public Student() {
        
    }

    public Student(String rollNo, String name, String sex, String email, String address, int age) {
        
        this.rollNo = rollNo;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.address = address;
        this.age = age;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ma sinh vien:");
        rollNo = scan.nextLine();
        System.out.println("Ten:");
        name = scan.nextLine();
        System.out.println("Gioi tinh:");
        sex = scan.nextLine();
        System.out.println("Tuoi:");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("Email:");
        email = scan.nextLine();
        System.out.println("Dia chi:");
        address = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", sex=" + sex + ", email=" + email + ", address=" + address + ", age=" + age + '}';
    }
    
    
}
