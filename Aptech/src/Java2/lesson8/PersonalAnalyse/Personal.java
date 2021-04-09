/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson8.PersonalAnalyse;

import java.util.ArrayList;



/**
 *
 * @author MyPC
 */
public class Personal {
    String name, gender, birthday, status;
    ArrayList<Interest> interestList = new ArrayList<>();
    String programLanguage;
    ArrayList<LearningEquipment> equipmentList = new ArrayList<>();

    public Personal() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Interest> getInterestList() {
        return interestList;
    }

    public void setInterestList(ArrayList<Interest> interestList) {
        this.interestList = interestList;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public ArrayList<LearningEquipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(ArrayList<LearningEquipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    @Override
    public String toString() {
        return "Personal{" + "name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", status=" + status + ", interestList=" + interestList + ", programLanguage=" + programLanguage + ", equipmentList=" + equipmentList + '}';
    }
    
}
