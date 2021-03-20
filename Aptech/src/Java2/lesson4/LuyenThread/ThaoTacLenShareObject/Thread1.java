/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.LuyenThread.ThaoTacLenShareObject;

import java.util.Random;

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
        Random random = new Random();
        while(data.total > -100 && data.total < 100){
            int t = random.nextInt(101);
            data.add(t);
        }
    }
}
