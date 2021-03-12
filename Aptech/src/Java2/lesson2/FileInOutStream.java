/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class FileInOutStream {
    public static void main(String[] args) {
//        readFile();
//        writeFile();
//        writeFileStudent();
        readFileStudent();
    }
    
    static void readFileStudent(){
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bReader = null;
        try {
            File file = new File("student.txt");
            fis = new FileInputStream(file);
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);//chuyển về hỗ trợ cho kí tự chữ cái
            bReader = new BufferedReader(reader);//giúp cho việc tải nhanh hơn
//            int code;
//            while((code = fis.read()) != -1){
//                //Convert code -> char
//                char c = (char) code;
//                System.out.print(c);
//            }
            String s;
            ArrayList<People> peopleList = new ArrayList<>();
            int count = 0;
            while((s = bReader.readLine()) != null){
                String[] string = s.split(",");
                People people = new People();
                people.name = string[0];
                people.age = Integer.parseInt(string[1]);
                peopleList.add(people);
            }
            for (People people : peopleList) {
                System.out.println(people);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    static void writeFileStudent(){
        FileOutputStream fos = null;
        File file = new File("student.txt");
        try {
            fos = new FileOutputStream(file);
            People p1 = new People("Nguyễn Tiến Đạt", 19);
            byte[] b1 = p1.getLine().getBytes("utf8");
            fos.write(b1);
            People p2 = new People("Lan Hương", 20);
            byte[] b2 = p2.getLine().getBytes("utf8");
            fos.write(b2);
            People p3 = new People("Tiền", 2);
            byte[] b3 = p3.getLine().getBytes("utf8");
            fos.write(b3);
            People p4 = new People("Đất", 0);
            byte[] b4 = p4.getLine().getBytes("utf8");
            fos.write(b4);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    static void writeFile(){
        FileOutputStream fos = null;
        File file = new File("vidu.txt");
        try {
            fos = new FileOutputStream(file, true);
            String s = "\nSinh viên Aptech";
            byte[] b = s.getBytes("utf8");
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    static void readFile(){
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bReader = null;
        try {
            File file = new File("vidu.txt");
            fis = new FileInputStream(file);
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);//chuyển về hỗ trợ cho kí tự chữ cái
            bReader = new BufferedReader(reader);//giúp cho việc tải nhanh hơn
//            int code;
//            while((code = fis.read()) != -1){
//                //Convert code -> char
//                char c = (char) code;
//                System.out.print(c);
//            }
            String s;
            while((s = bReader.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileInOutStream.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
