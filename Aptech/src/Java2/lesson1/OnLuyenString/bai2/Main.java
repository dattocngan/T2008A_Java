/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson1.OnLuyenString.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap N:");
        int n = scan.nextInt();
        System.out.println("Nhap cac so:");
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            list.add(a);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
