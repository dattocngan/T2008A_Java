/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2.QuanLyThongTinSinhVienBangFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    int n;
                    System.out.println("Lua chon so sinh vien muon nhap:");
                    n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.input();
                        studentList.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Id cua sinh vien muon edit:");
                    String idEdit = scan.nextLine();
                    int checkEdit =0;
                    for (Student student : studentList) {
                        if(student.id.equalsIgnoreCase(idEdit)){
                            System.out.println("Da tim thay!!");
                            student.input();
                            checkEdit++;
                            break;
                        }
                    }
                    if(checkEdit == 0) System.out.println("Khong tim thay sinh vien nao!!");
                    break;
                case 3:
                    System.out.println("Id cua sinh vien muon xoa:");
                    String idDelete = scan.nextLine();
                    int checkDel =0;
                    for (Student student : studentList) {
                        if(student.id.equalsIgnoreCase(idDelete)){
                            System.out.println("Da tim thay va xoa thanh cong!!");
                            studentList.remove(student);
                            checkDel++;
                            break;
                        }
                    }
                    if(checkDel == 0) System.out.println("Khong tim thay sinh vien nao!!");
                    break;
                case 4:
                    Collections.sort(studentList, (Student o1, Student o2) -> {
                        if(o1.gpa < o2.gpa) return 1;
                        return -1;
                    });
                    System.out.println("Da sort thanh cong!!");
                    break;
                case 5:
                    Collections.sort(studentList, (Student o1, Student o2) -> o1.name.compareToIgnoreCase(o2.name));
                    System.out.println("Da sort thanh cong!!");
                    break;
                case 6:
                    studentList.forEach((student) -> {
                        System.out.println(student);
                    });
                    break;
                case 7:
                    writeFile(studentList);
                    break;
                case 8:
                    readFile();
                    break;
                case 0:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        }while(choose != 0);
    }
    static void showMenu(){
        System.out.println("1.Add student");
        System.out.println("2.Edit student by id");
        System.out.println("3.Delete student by id");
        System.out.println("4.Sort student by gpa");
        System.out.println("5.Sort student by name");
        System.out.println("6.Show student");
        System.out.println("7.Save in student.txt");
        System.out.println("8.Read student.txt");
        System.out.println("0.Exit");
    }
    
    static void writeFile(ArrayList<Student> studentList){
        FileOutputStream fos = null;
        File file = new File("student.txt");
        try {
            fos = new FileOutputStream(file);
            for (Student student : studentList) {
                byte[] b = student.getLine().getBytes("utf8");
                fos.write(b);
            }
            
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Ghi vao file thanh cong!!");
        }
    }
    
    static void readFile(){
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bReader = null;
        File file = new File("student.txt");
        try {
            fis = new FileInputStream(file);
            reader = new InputStreamReader(fis,"utf8");
            bReader = new BufferedReader(reader);
            String s;
            while((s = bReader.readLine()) != null){
                System.out.println(s);
            }
            
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Read thanh cong!!");
        }
    }
}
