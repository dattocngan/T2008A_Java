/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.ExamAptech;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Student {
    String id, name, address, phone;
    List<Student> studentList = new ArrayList<>();
    public Student() {
        
    }

    public Student(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void add(){
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Input Student ID:");
        student.id = scan.nextLine();
        System.out.println("Input Student name:");
        student.name = scan.nextLine();
        System.out.println("Input Student address:");
        student.address = scan.nextLine();
        System.out.println("Input Student phone:");
        student.phone = scan.nextLine();
        studentList.add(student);
    }
    public void display(){
//        String stdId="Student ID", stdName="Student Name", stdAddress="Address", stdPhone="Phone";
        System.out.format("%2s%-20s%-20s%-20s%-20s"," ","Student ID","Student Name","Address","Phone");
        System.out.println("");
        studentList.forEach((student) -> {
            System.out.format("%-20s%-20s%-20s%-20s",student.getId(),student.getName(),student.getAddress(),student.getPhone());
            System.out.println("");
        });
    }
    public void save(){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("students.txt");
            for (Student student : studentList) {
                byte[] b = student.getLine().getBytes();
                fos.write(b);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public String getLine(){
        return id + "," + name + "," + address + "," + phone + "\n";
    }
}
