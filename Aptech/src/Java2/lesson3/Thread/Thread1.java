/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson3.Thread;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MyPC
 */
public class Thread1 extends Thread{
    ArrayList<Integer> list1 = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list1.add(random.nextInt(101));
            //delay chay thread 1 giay
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("add to t1");
        }

    }
    
}
