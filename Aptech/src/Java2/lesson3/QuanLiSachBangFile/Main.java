/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson3.QuanLiSachBangFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        List<Book> bookList = new ArrayList<>();
        int choose;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    int n;
                    System.out.println("Nhap so luong quyen sach muon nhap:");
                    n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        Book book = new Book();
                        book.input();
                        bookList.add(book);
                    }
                    break;
                case 2:
                    bookList.forEach((book) -> {
                        book.display();
                    });
                    break;
                case 3:
                    Collections.sort(bookList, (Book o1, Book o2) -> o1.authorName.compareToIgnoreCase(o2.authorName));                         
                    break;
                case 4:
                    saveObj(bookList);
                    break;
                case 5:
                    saveTxt(bookList);
                    break;
                case 6:
                    break;
                case 7:
                    readObj();
                    break;
                case 8:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        }while(choose != 8);
    }
    
    static void showMenu(){
        System.out.println("1.Nhap thong tin N quyen sach");
        System.out.println("2.Hien thi thong tin N quyen sach");
        System.out.println("3.Sap xep theo ten tac gia");
        System.out.println("4.Luu thong tin vao file data.obj");
        System.out.println("5.Luu thong tin vao file data.txt");
        System.out.println("6.Nen file data.txt thanh file data.dfl");
        System.out.println("7.Doc du lieu tu file data.obj");
        System.out.println("8.Thoat");
    }

    private static void saveObj(List<Book> bookList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data.obj");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(bookList);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Save thanh cong!!");
        }
    }

    private static void saveTxt(List<Book> bookList) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("data.txt");
            for (Book book : bookList) {
                byte[] b = book.getLine().getBytes();
                fos.write(b);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Save thanh cong!!");
        }
    }

    private static void readObj() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Book>abcd = new ArrayList<>();
        try {
            fis = new FileInputStream("data.obj");
            ois = new ObjectInputStream(fis);
            abcd = (List<Book>) ois.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (Book book : abcd) {
            System.out.println(book);
        }
    }
}
