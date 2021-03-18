/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java1.lesson1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class BaiTap {
    private static boolean IntCheck(int n){
        if( n <= 1 ) return false;
        for( int i = 2 ; i <= sqrt(n) ; i++ ){
            if( n % i == 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a ="56a";
        System.out.println(Integer.parseInt((String)a));
    }
}
