/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java1.Exam1_QuanLyMayTinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Monitor extends Device{
    String size;

    public Monitor() {
    }

    public Monitor(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    
    @Override
    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ID:");
        id = Integer.parseInt(scan.nextLine());
        System.out.println("Ten thiet bi:");
        name = scan.nextLine();
        System.out.println("Ten hang:");
        manu = scan.nextLine();
        System.out.println("Ngay nhap:");
        try {
            importedDate = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(Computer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nhap kich co:");
        size = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Monitor{" + "size=" + size + '}';
    }
    
    

    @Override
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Ten thiet bi: " + name);
        System.out.println("Nha san xuat: " + manu);
        System.out.println("Ngay nhap: " + importedDate);
        System.out.println("Kich co: " + size);
    }

    private Date SimpleDateFormat(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
