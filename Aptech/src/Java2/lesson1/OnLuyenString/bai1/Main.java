/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson1.OnLuyenString.bai1;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap source:");
        String source = scan.nextLine();
        System.out.println("Nhap searching:");
        String searching = scan.nextLine();
        int count =0;
        for (int i = 0; i < source.length(); i++) {
            if( source.indexOf(searching, i) != -1 ){
                i = source.indexOf(searching, i);
                count++;
            }
        }
        System.out.println("Searching xuat hien trong Source " + count + " lan");
    }
}
