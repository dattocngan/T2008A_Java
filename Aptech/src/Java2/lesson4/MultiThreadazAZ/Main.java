/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.MultiThreadazAZ;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);
        t1.start();
        t2.start();
    }
}
