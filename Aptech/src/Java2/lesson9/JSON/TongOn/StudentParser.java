/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson9.JSON.TongOn;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author MyPC
 */
public class StudentParser extends DefaultHandler{
    List<Student> studentList = new ArrayList<>();
    Student student = null;
    
    boolean isStudent = false;
    boolean isName = false;
    boolean isGender = false;
    boolean isRollno = false;
    boolean isEmail = false;
    boolean isAddress = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("student")){
            student = new Student();
            isStudent = true;
        }
        if(isStudent){
            if(qName.equalsIgnoreCase("name")){
                isName = true;
            }else if(qName.equalsIgnoreCase("gender")){
                isGender = true;
            }else if(qName.equalsIgnoreCase("rollno")){
                isRollno = true;
            }else if(qName.equalsIgnoreCase("email")){
                isEmail = true;
            }else if(qName.equalsIgnoreCase("address")){
                isAddress = true;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase("student")){
            isStudent = false;
            studentList.add(student);
            student = null;
        }
        if(isStudent){
            if(qName.equalsIgnoreCase("name")){
                isName = false;
            }else if(qName.equalsIgnoreCase("gender")){
                isGender = false;
            }else if(qName.equalsIgnoreCase("rollno")){
                isRollno = false;
            }else if(qName.equalsIgnoreCase("email")){
                isEmail = false;
            }else if(qName.equalsIgnoreCase("address")){
                isAddress = false;
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = String.valueOf(ch, start, length);
        if(isStudent){
            if(isName){
                student.setName(str);
            }else if(isGender){
                student.setGender(str);
            }else if(isRollno){
                student.setRollNo(str);
            }else if(isEmail){
                student.setEmail(str);
            }else if(isAddress){
                student.setAddress(str);
            }
        }
    }
    
    
    
    
}
