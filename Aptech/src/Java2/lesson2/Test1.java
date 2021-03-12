/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Test1 {
    public static void main(String[] args) {
        File file = new File("dist");
        if(file.exists()){
            System.out.println("File exist");
        }else{
            System.out.println("Not found");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Ung dung kha nhieu: viet duoc 1 chuong trinh duyet toan file trong 1 folder
        //Viet 1 ung dung: Explorer
        String[] list = file.list();
        for (String string : list) {
            System.out.println(string);
        }
    }
}
