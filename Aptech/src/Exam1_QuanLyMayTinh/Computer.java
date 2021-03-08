/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam1_QuanLyMayTinh;

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
public class Computer extends Device{
    String cpu;
    String ram;

    public Computer() {
    }

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
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
        System.out.println("Nhap CPU:");
        cpu = scan.nextLine();
        System.out.println("Nhap RAM:");
        ram = scan.nextLine();
    }

    @Override
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Ten thiet bi: " + name);
        System.out.println("Nha san xuat: " + manu);
        System.out.println("Ngay nhap: " + importedDate);
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
    }

    private Date SimpleDateFormat(String a) {
        return SimpleDateFormat(a);
    }
}
