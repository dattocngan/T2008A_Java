/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2;

/**
 *
 * @author MyPC
 */
public class Student extends People{
    int rollNo;

    public Student() {
    }

    public Student(int rollNo, String name, int age) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", age=" + age + '}';
    }

    
    
}
