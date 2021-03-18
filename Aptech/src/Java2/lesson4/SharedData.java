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
public class SharedData {
    int count = 0;
    int rad;
    
    public synchronized void add(String threadName, int delta) {
        System.out.println(threadName + "->" + count);
        count += delta;
        System.out.println(threadName + "->" + "Count:" + count);
    }
    
    public synchronized void minus(String threadName, int delta) {
        System.out.println(threadName + "->" + count);
        count -= delta;
        System.out.println(threadName + "->" + "Count:" + count);
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
}
