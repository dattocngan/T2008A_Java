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
public class Thread3 extends Thread{
    
    SharedData sharedData;

    

    public Thread3(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    

    @Override
    public void run() {
        try {
            sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(sharedData.end == false){
            synchronized(sharedData){
                if(sharedData.check == 0){
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Unvalid roll number : " + sharedData.getStudRollNo());
                    writeFile(sharedData.getStudRollNo());
                    sharedData.notifyAll();
                    try {
                        sharedData.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
//                    student.notifyAll();
                    try {
                        sharedData.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private void writeFile(String studRollNo) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("unvalid.txt",true);
            byte[] b = studRollNo.getBytes();
            String a = "\n";
            byte[] c = a.getBytes();
            fos.write(b);
            fos.write(c);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Thread3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
