/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson4.TongHop;

import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class SharedData extends Student{
    ArrayList<Student> validRollNumber = new ArrayList<>();
    ArrayList<String> unvalidRollNumber = new ArrayList<>();
    int check = 1;
    boolean end = false;
    int validSize = 0;
    int kiemtra = 0;
    
    @Override
    public String getStudRollNo() {
        return studRollNo;
    }

    @Override
    public void setStudRollNo(String studRollNo) {
        this.studRollNo = studRollNo;
    }
    
    public void addValid(Student student){
        validRollNumber.add(student);
    }
    
    public void addUnvalid(String string){
        unvalidRollNumber.add(string);
    }
    
    public int getValidSize(){
        return validRollNumber.size();
    }
}
