/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2.QuanLyThongTinSinhVienBangFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
//        writeData();
        readData();
    }
    
    static void readData(){
        List<Student> abcd = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("student.dat");
            ois = new ObjectInputStream(fis);
            abcd = (List<Student>) ois.readObject();
            //Khi muon lam voi tung object
//            while(true){
//                Object obj = ois.readObject();
//                if(obj != null){
//                    studentList.add((Student) obj);
//                }else{
//                    break;
//                }
//            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        abcd.forEach((student) -> {
            System.out.println(student);
        });
    }
    
    static void writeData(){
        List<Student> studentList = new ArrayList<>();
        
        Student std1 = new Student();
        std1.input();
        studentList.add(std1);
        
        Student std2 = new Student();
        std2.input();
        studentList.add(std2);
        
        //Luu du lieu vao file.
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("student.dat");
            
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(studentList);
            
            //Thao tac voi tung object
//            for (Student student : studentList) {
//                oos.writeObject(student);
//            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
