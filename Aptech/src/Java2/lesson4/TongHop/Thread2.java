/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.TongHop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Thread2 extends Thread{
//    Student student;
    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    

    @Override
    public void run() {
        while(sharedData.end == false){
            synchronized(sharedData){
                if(sharedData.check == 1){
                    if(sharedData.kiemtra == 0){
                        sharedData.kiemtra++;
                        sharedData.notifyAll();
                        try {
                            sharedData.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(sharedData.check == 1){
                        try {
                            sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("Welcome student has roll number is : " + sharedData.getStudRollNo());
                        System.out.println("Valid collection has length: " + sharedData.getValidSize());
                        writeFile(sharedData.getStudRollNo());
                        sharedData.notifyAll();
                        try {
                            sharedData.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        try {
                            sharedData.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                }else{
//                    student.notifyAll();
                    try {
                        sharedData.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    public void writeFile(String rollNo){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(rollNo + ".dat");
            byte[] b = rollNo.getBytes();
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
