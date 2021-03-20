/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.LuyenThread.BaiToanDaLuong;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Java1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        while(true){
            if((n = random.nextInt(101)) >= 10) break;
        }
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("number.txt");
            String a = "\n";
            byte[] b = Integer.toString(n).getBytes();
            fos.write(b);
            b = a.getBytes();
            fos.write(b);
            for (int i = 0; i < n; i++) {
                int m = random.nextInt(501);
                b = Integer.toString(m).getBytes();
                fos.write(b);
                b = a.getBytes();
                fos.write(b);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Java1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Java1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Java1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
