/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam1_QuanLyMayTinh;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Device[] list = new Device[5];
        Scanner scan = new Scanner(System.in);
        int choose;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    int index = 0;
                    while(index < 5){
                        System.out.println("Nhap Computer hay Monitor:");
                        System.out.println("1.Computer");
                        System.out.println("2.Monitor");
                        int select = Integer.parseInt(scan.nextLine());
                        if(select == 1){
                            Computer computer = new Computer();
                            computer.input();
                            list[index] = computer;
                        }else{
                            Monitor monitor = new Monitor();
                            monitor.input();
                            list[index] = monitor;
                        }
                        index++;
                        if(index == 5) System.out.println("Ket thuc nhap!!");
                    }
                    break;
                case 2:
                    for (Device object : list) {
                        object.display();
                    }
                    break;
                case 3:
                    int countComputer = 0;
                    for (Device object : list) {
                        if(object instanceof Computer){
                            countComputer++;
                        }
                    }
                    System.out.println("So luong Computer: " + countComputer);
                    break;
                case 4:
                    int countMonitor = 0;
                    for (Device object : list) {
                        if(object instanceof Monitor) {
                            countMonitor++;
                        }
                    }
                    System.out.println("So luong Monitor: " + countMonitor);
                    break;
                case 5:
                    System.out.println("Tam biet!!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        }while(choose != 5);
        
    }
    
    static void showMenu(){
        System.out.println("1.Nhap thong tin thiet bi");
        System.out.println("2.Hien thi thong tin thiet bi");
        System.out.println("3.Hien thi so Computer duoc nhap vao");
        System.out.println("4.Hien thi so Monitor duoc nhap vao");
        System.out.println("5.Thoat");
    }
}
