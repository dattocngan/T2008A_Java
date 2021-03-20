/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.LuyenThread.BaiToanDaLuong;

/**
 *
 * @author MyPC
 */
public class Java2 {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);
        Thread3 t3 = new Thread3(data);
        t1.start();
        t2.start();
        t3.start();
    }
}
