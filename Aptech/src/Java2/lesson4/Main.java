/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        //Bat dau chuong trinh: Main Thread
        System.out.println("Main Thread -> Start");
        
        //Cach 1:
        //Khoi tao 1 thread len
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("T1 > " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t1.setName("ABC");
        CustomThread t2 = new CustomThread();
        t2.setName("BBB");
        
        //Thuc hien chay Thread
        t1.start();//Main Thread & T1
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Xin chao");//
        
        t2.start();//Main Thread & T2
        
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Hello ...");
        
        t2.stop();//T2 -> stop -> goi tiep ham stop() -> ko tac dung.
        //Note: Khi thread -> stop -> khoi tao doi tuong Thread len -> start().
        t2 = new CustomThread();
        t2.setName("KKK");
        t2.start();
        
        System.out.println("Main Thread -> Stop");
    }
}
