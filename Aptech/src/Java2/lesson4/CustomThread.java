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
public class CustomThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " -> CustomThread > Start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " -> CustomThread > " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println(getName() + " -> CustomThread > Stop");
    }
}
