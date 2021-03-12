/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson1.OnLuyenString.bai3;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder source = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap N chuoi:");
        for (int i = 0; i < n; i++) {
            String string = scan.nextLine();
            source.append(string);
        }
        System.out.println("Nhap chu muon tim kiem:");
        String search = scan.nextLine();
        for (int i = 0; i < source.length(); i++) {
            if(source.indexOf(search, i) != -1){
                System.out.println("String: " + source.substring(source.indexOf(search, i)));
                i = source.indexOf(search, i);
            }
        }
    }
}
