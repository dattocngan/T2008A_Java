/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC
 */
public class DataController<E> {
    List<E> dataList;

    public DataController() {
        dataList = new ArrayList<>();
    }

    public DataController(List<E> dataList) {
        this.dataList = dataList;
    }
    public void display(){
        dataList.forEach((e) -> {
            System.out.println(e);
        });
    }
    
    public void add(E e){
        dataList.add(e);
    }

    @Override
    public String toString() {
        return "DataController{" + "dataList=" + dataList + '}';
    }
    
    
}
