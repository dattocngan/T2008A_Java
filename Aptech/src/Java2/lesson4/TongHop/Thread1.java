/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.TongHop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Thread1 extends Thread{
   
    SharedData sharedData;


    public Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    
    
    
    
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bReader = null;
        try {
            fis = new FileInputStream("students.txt");
            reader = new InputStreamReader(fis);
            bReader = new BufferedReader(reader);
            String line;
            
            while((line = bReader.readLine()) != null){
                synchronized(sharedData){
                    if(line.length() < 10 || line.length() > 11){
                        sharedData.addUnvalid(line);
                        sharedData.notifyAll();
                        sharedData.check = 0;
                        sharedData.setStudRollNo(line);
                        sharedData.wait();
                        continue;
                    }
                    if(line.charAt(0) != 'C' && line.charAt(0) != 'T' && line.charAt(0) != 'N'){
                        sharedData.addUnvalid(line);
                        sharedData.notifyAll();
                        sharedData.check = 0;
                        sharedData.setStudRollNo(line);
                        sharedData.wait();
                        continue;
                    }
                    if(line.charAt(1) < 48 || line.charAt(1) > 57 || line.charAt(2) < 48 || line.charAt(2) > 57 || line.charAt(3) < 48 || line.charAt(3) > 57 || line.charAt(4) < 48 || line.charAt(4) > 57){
                        sharedData.addUnvalid(line);
                        sharedData.notifyAll();
                        sharedData.check = 0;
                        sharedData.setStudRollNo(line);
                        sharedData.wait();
                        continue;
                    }
                    if(line.charAt(5) != 'G' && line.charAt(5) != 'H' && line.charAt(5) != 'I' && line.charAt(5) != 'K' && line.charAt(5) != 'L' && line.charAt(5) != 'M'){
                        sharedData.addUnvalid(line);
                        sharedData.notifyAll();
                        sharedData.check = 0;
                        sharedData.setStudRollNo(line);
                        sharedData.wait();
                        continue;
                    }
                    if(line.charAt(6) == 'V'){
                        if(line.charAt(7) < 48 || line.charAt(7) > 57 || line.charAt(8) < 48 || line.charAt(8) > 57 || line.charAt(9) < 48 || line.charAt(9) > 57 || line.charAt(10) < 48 || line.charAt(10) > 57){
                            sharedData.addUnvalid(line);
                            sharedData.notifyAll();
                            sharedData.check = 0;
                            sharedData.setStudRollNo(line);
                            sharedData.wait();
                            continue;
                        }
                    }else{
                        if(line.charAt(6) < 48 || line.charAt(6) > 57 || line.charAt(7) < 48 || line.charAt(7) > 57 || line.charAt(8) < 48 || line.charAt(8) > 57 || line.charAt(9) < 48 || line.charAt(9) > 57){
                            sharedData.addUnvalid(line);
                            sharedData.notifyAll();
                            sharedData.check = 0;
                            sharedData.setStudRollNo(line);
                            sharedData.wait();
                            continue;
                        }
                    }
                    Student std = new Student(line);
                    sharedData.addValid(std);
                    sharedData.notifyAll();
                    sharedData.check = 1;
                    sharedData.setStudRollNo(line);
                    sharedData.wait();

                }
            }
            synchronized(sharedData){
                sharedData.notifyAll();
                sharedData.end = true;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
