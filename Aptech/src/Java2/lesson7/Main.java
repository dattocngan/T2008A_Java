/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson7;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Date abc = new Date();
        System.out.println(abc);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(abc);
        c1.add(Calendar.DATE, 7);
        Date compareDay = c1.getTime();
        System.out.println(compareDay);
        System.out.println(String.valueOf(compareDay));
        String s = "abc,cde,,efg";
        String[] s1 = s.split(",");
        if("".equals(s1[2])){
            System.out.println("hello");
        }
    }
}
