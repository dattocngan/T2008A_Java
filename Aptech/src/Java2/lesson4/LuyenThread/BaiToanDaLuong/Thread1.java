/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.LuyenThread.BaiToanDaLuong;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Thread1 extends Thread{
    SharedData data;

    public Thread1(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bReader = null;
        try {
            fis = new FileInputStream("number.txt");
            reader = new InputStreamReader(fis);
            bReader = new BufferedReader(reader);
            String line;
            int check = 0;
            while((line = bReader.readLine()) != null){
                if(check == 0){
                    check++;
                    continue;
                }
                synchronized(data){
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    int n = Integer.parseInt(line);
                    if( n % 2 == 0) data.threadStatus = 2;
                    else data.threadStatus = 3;
                    System.out.println("Thread 1: " + n);
                    data.setNum(n);
                    data.notifyAll();
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            data.stop = true;
            synchronized(data){
                data.notifyAll();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
