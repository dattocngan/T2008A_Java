/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson3;

/**
 *
 * @author MyPC
 */
public class ThreadTest {
    public static void main(String[] args) {
        //Main Thread -> luong chinh
        System.out.println("Step 1");
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Step 2 - " + i);
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Step 3 - " + i);
                t1.stop();
            }
        });
        t2.start(); //T2 -> chay => T2 & main
        t1.start(); //T1 -> chay => T1 & main & T2
        System.out.println("Finish");
    }
}
