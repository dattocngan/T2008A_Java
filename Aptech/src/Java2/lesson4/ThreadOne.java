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
public class ThreadOne extends Thread{
    SharedData sharedData;

    public ThreadOne(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            sharedData.add(getName(), 1);
            synchronized(sharedData) {
                System.out.println(getName() + "->" + sharedData.count);
                sharedData.count += 1;
                System.out.println(getName() + "->" + "Count:" + sharedData.count);
            }
        }
    }
    
}
