/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.MultiThreadazAZ;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Thread1 extends Thread{
    Data data;

    public Thread1(Data data) {
        this.data = data;
    }
    
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Random random = new Random();
        while (true) {            
            synchronized(data){
                try {
                    sleep(2000);
                    data.count+=2;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int rand = random.nextInt(26);
                data.setRandomChar((char)(rand+97));
                System.out.println("Char random: " + (char)(rand+97));
                
                data.notifyAll();
                
                try {
                    data.wait();
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(data.count >= 20){
                    System.exit(0);
                }
            }
        }
    }
    
}
