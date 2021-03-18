/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.MultiThreadazAZ;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Thread2 extends Thread{
    Data data;

    public Thread2(Data data) {
        this.data = data;
    }
    
    @Override
    public void run() {
        while (true) {            
            synchronized(data){
                try {
                    data.notifyAll();
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    sleep(1000);
                    data.count++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                char a = (char) (data.getRandomChar()-32);
                data.setRandomChar(a);
                System.out.println("Char Spec: " + a);
                if(data.count >= 20) System.exit(0);
            }
        }
    }
}
