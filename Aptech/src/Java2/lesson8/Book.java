/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson8;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Book {
    String title, nickname, nxb, description;

    public Book() {
    }

    public Book(String title, String nickname, String nxb, String description) {
        this.title = title;
        this.nickname = nickname;
        this.nxb = nxb;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter title:");
        title = scan.nextLine();
        System.out.println("Enter nickname:");
        nickname = scan.nextLine();
        System.out.println("Enter nxb:");
        nxb = scan.nextLine();
        System.out.println("Enter description:");
        description = scan.nextLine();
    }
    
    public String toXML(){
        return "        <book>\n" +
"			<title><![CDATA["+title+"]]></title>\n" +
"			<nickname>"+nickname+"</nickname>\n" +
"			<nxb>"+nxb+"</nxb>\n" +
"			<description>"+description+"</description>\n" +
"		</book>\n";
    }
   
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", nickname=" + nickname + ", nxb=" + nxb + ", description=" + description + '}';
    }
    
}
