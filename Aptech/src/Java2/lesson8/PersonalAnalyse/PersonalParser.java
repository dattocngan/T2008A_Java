/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson8.PersonalAnalyse;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author MyPC
 */
public class PersonalParser extends DefaultHandler{
    Personal person = null;
    Interest interest = new Interest();
    LearningEquipment equipment = new LearningEquipment();
    
    boolean isProfile = false;
    boolean isName = false;
    boolean isGender = false;
    boolean isBirthday = false;
    boolean isStatus = false;
    boolean isInterest = false;
    boolean isSport = false;
    boolean isGame = false;
    boolean isMusic = false;
    boolean isUSUK = false;
    boolean isVPOP = false;
    boolean isLanguage = false;
    boolean isEquipment = false;
    boolean isLaptop = false;
    boolean isName1 = false;
    boolean isBookList = false;
    boolean isBook = false;
    
    int check = 0;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("profile")){
            person = new Personal();
            isProfile = true;
        }
        if(isProfile){
            if(qName.equalsIgnoreCase("name") && check == 0){
                isName = true;
                check = 1;
            }else if(qName.equalsIgnoreCase("gender")){
                isGender = true;
            }else if(qName.equalsIgnoreCase("birthday")){
                isBirthday = true;
            }else if(qName.equalsIgnoreCase("status")){
                isStatus = true;
            }else if(qName.equalsIgnoreCase("interest")){
                isInterest = true;
            }else if(qName.equalsIgnoreCase("program-language")){
                isLanguage = true;
            }else if(qName.equalsIgnoreCase("learning-equipment")){
                isEquipment = true;
            }
            if(isInterest){
                if(qName.equalsIgnoreCase("sport")){
                    isSport = true;
                }else if(qName.equalsIgnoreCase("game")){
                    isGame = true;
                }else if(qName.equalsIgnoreCase("music")){
                    isMusic = true;
                }
            }
            if(isMusic){
                if(qName.equalsIgnoreCase("us-uk")){
                    isUSUK = true;
                }else if(qName.equalsIgnoreCase("v-pop")){
                    isVPOP = true;
                }
            }
            if(isEquipment){
                if(qName.equalsIgnoreCase("laptop")){
                    isLaptop = true;
                }else if(qName.equalsIgnoreCase("book-list")){
                    isBookList = true;
                }
            }
            if(isLaptop){
                if(qName.equalsIgnoreCase("name")){
                    isName1 = true;
                }
            }
            if(isBookList){
                if(qName.equalsIgnoreCase("book")){
                    isBook = true;
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase("profile")){
            isProfile = false;
            person.interestList.add(interest);
            person.equipmentList.add(equipment);
        }
        if(isProfile){
            if(qName.equalsIgnoreCase("name")){
                isName = false;
            }else if(qName.equalsIgnoreCase("gender")){
                isGender = false;
            }else if(qName.equalsIgnoreCase("birthday")){
                isBirthday = false;
            }else if(qName.equalsIgnoreCase("status")){
                isStatus = false;
            }else if(qName.equalsIgnoreCase("interest")){
                isInterest = false;
            }else if(qName.equalsIgnoreCase("program-language")){
                isLanguage = false;
            }else if(qName.equalsIgnoreCase("learning-equipment")){
                isEquipment = false;
            }
            if(isInterest){
                if(qName.equalsIgnoreCase("sport")){
                    isSport = false;
                }else if(qName.equalsIgnoreCase("game")){
                    isGame = false;
                }else if(qName.equalsIgnoreCase("music")){
                    isMusic = false;
                }
            }
            if(isMusic){
                if(qName.equalsIgnoreCase("us-uk")){
                    isUSUK = false;
                }else if(qName.equalsIgnoreCase("v-pop")){
                    isVPOP = false;
                }
            }
            if(isEquipment){
                if(qName.equalsIgnoreCase("laptop")){
                    isLaptop = false;
                }else if(qName.equalsIgnoreCase("book-list")){
                    isBookList = false;
                }
            }
            if(isLaptop){
                if(qName.equalsIgnoreCase("name")){
                    isName1 = false;
                }
            }
            if(isBookList){
                if(qName.equalsIgnoreCase("book")){
                    isBook = false;
                }
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = String.valueOf(ch, start, length);
        if(isProfile){
            if(isName){
                person.setName(str);
            }else if(isGender){
                person.setGender(str);
            }else if(isBirthday){
                person.setBirthday(str);
            }else if(isStatus){
                person.setStatus(str);
            }else if(isInterest){
                if(isSport){
                    interest.setSport(str);
                }else if(isGame){
                    interest.setGame(str);
                }else if(isMusic){
                    if(isUSUK){
                        interest.setMusic(str);
                    }else if(isVPOP){
                        interest.setMusic(str);
                    }
                }
                
            }else if(isLanguage){
                person.setProgramLanguage(str);
            }else if(isEquipment){
                if(isLaptop){
                    if(isName1){
                        equipment.setLaptop(str);
                    }
                }else if(isBookList){
                    if(isBook){
                        equipment.setBookList(str);
                    }
                }
                
            }
            
        }
    }
}
