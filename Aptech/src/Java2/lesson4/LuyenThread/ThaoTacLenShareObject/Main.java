/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.LuyenThread.ThaoTacLenShareObject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(data.total);
    }
}
