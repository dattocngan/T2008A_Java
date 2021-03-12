/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2.QuanLyThongTinSinhVienBangFile;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Student {
    String name, address, id;
    int age;
    float gpa;

    public Student() {
    }

    public Student(String name, String address, String id, int age, float gpa) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ID:");
        id = scan.nextLine();
        System.out.println("Nhap ten:");
        name = scan.nextLine();
        System.out.println("Tuoi:");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("Dia chi:");
        address = scan.nextLine();
        System.out.println("GPA:");
        gpa = Float.parseFloat(scan.nextLine());
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", address=" + address + ", id=" + id + ", age=" + age + ", gpa=" + gpa + '}';
    }
    public String getLine(){
        return id + "," + name + "," + age + "," + address + "," + gpa + "\n";
    }
}
