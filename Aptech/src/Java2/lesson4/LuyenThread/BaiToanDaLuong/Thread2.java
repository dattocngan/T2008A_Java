/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.LuyenThread.BaiToanDaLuong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Thread2 extends Thread{
    SharedData data;

    public Thread2(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(data.stop == false){
            synchronized(data){
                data.notifyAll();
                while(data.threadStatus != 2 && data.stop == false){
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(data.stop == true) break;
                int n = data.getNum();
                System.out.print("Thread 2: " + n + " = ");
                for (int i = 1; i <= n; i++) {
                    if(i == 1){
                        System.out.print("1");
                        continue;
                    }
                    if(n % i == 0) System.out.print(", " + i);
                }
                System.out.println("");
                data.threadStatus = 1;
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    } 
}
