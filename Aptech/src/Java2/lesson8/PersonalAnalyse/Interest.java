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
public class Interest {
    String sport, game;
    ArrayList<String> music = new ArrayList<>();

    public Interest() {
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public ArrayList<String> getMusic() {
        return music;
    }

    public void setMusic(String music1) {
        this.music.add(music1);
    }

    @Override
    public String toString() {
        return "sport=" + sport + ", game=" + game + ", music=" + music;
    }
    
}
