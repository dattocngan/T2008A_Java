/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4;

/**
 *
 * @author MyPC
 */
public class Test {
     public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        
        Thread t1 = new ThreadTwo(sharedData);
        t1.setName("T1");
        Thread t2 = new ThreadOne(sharedData);
        t2.setName("T2");
        Thread t3 = new ThreadTwo(sharedData);
        t3.setName("T3");
        Thread t4 = new ThreadOne(sharedData);
        t4.setName("T4");
        Thread t5 = new ThreadTwo(sharedData);
        t5.setName("T5");
        
        t1.start();//Main + T1
//        try {
//            t1.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
        t2.start();//Main + T2 + T1
        t3.start();//Main + T3 + T2 + T1
//        System.out.println("Test ...");//Main + T3 + T2 + T1
        t4.start();//Main + T4 + T3 + T2 + T1
        t5.start();//Main + T5 + T4 + T3 + T2 + T1
    }
}
