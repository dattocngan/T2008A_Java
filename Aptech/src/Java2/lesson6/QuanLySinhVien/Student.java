/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson6.QuanLySinhVien;

/**
 *
 * @author MyPC
 */
public class Student {
    String name, gender, rollNo, email, address;

    public Student() {
    }

    public Student(String name, String gender, String rollNo, String email, String address) {
        this.name = name;
        this.gender = gender;
        this.rollNo = rollNo;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getLine(){
        return name + "," + gender + "," + rollNo + "," + email + "," + address + "\n";
    }
}
