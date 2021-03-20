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
public class Thread3 extends Thread{
    SharedData data;

    public Thread3(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(data.stop == false){
            synchronized(data){
                data.notifyAll();
                while(data.threadStatus != 3 && data.stop == false){
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(data.stop == true) break;
                int n = data.getNum();
                System.out.println("Thread 3: " + n*n);
                data.threadStatus = 1;
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }
}
