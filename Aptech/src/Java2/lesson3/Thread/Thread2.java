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
public class Thread2 extends Thread {

    ArrayList<Character> list2 = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list2.add((char) (random.nextInt(26) + 97));
            //delay chay thread 2 giay
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         System.out.println("added to t2");
        }
    }

}
