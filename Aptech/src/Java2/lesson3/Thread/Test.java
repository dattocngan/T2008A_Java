/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson3.Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start(); // vao ham run
        t2.start(); // vao ham run
        
        //tuong gio chan luong t1 lai -> thuc hien het luong t1 thi moi chay den code tiep theo
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        //tuong gio chan luong t2 lai -> thuc hien het luong t2 thi moi chay den code tiep theo
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("List 1 = " + t1.list1);
        System.out.println("List 2 = " + t2.list2);
    }
}
