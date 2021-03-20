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
public class SharedData {
    int num;
    int threadStatus = 1;
    boolean stop = false;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
