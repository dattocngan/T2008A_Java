/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9.DieuKhienTiVi;



/**
 *
 * @author MyPC
 */
public class cTivi {
    private String[] channelList;
    private boolean isOn;
    private String currentChannel;

    public cTivi() {
        isOn = false;
        channelList = new String[3];
        channelList[0] = "VTV1";
        channelList[1] = "VTV2";
        channelList[2] = "VTV3";
        currentChannel = channelList[0];
    }

    public cTivi(String[] channelList) {
        this.channelList = channelList;
        this.isOn = false;
        this.currentChannel = channelList[0];
    }

    

    
    
    public String searchNextChannel(boolean isForward){
        if(isForward == true){
            for (int i = 0; i < channelList.length; i++) {
                if(channelList[i].equalsIgnoreCase(currentChannel)){
                    if( i != channelList.length - 1 ) return channelList[i+1];
                    else return channelList[0];
                }
            }
        }else{
            for (int i = 0; i < channelList.length; i++) {
                if(channelList[i].equalsIgnoreCase(currentChannel)){
                    if( i != 0 ) return channelList[i-1];
                    else return channelList[channelList.length-1];
                }
            }
        }
        return null;
    }
    
    public void On(){
        isOn = true;
        System.out.println("---Tivi ON---");
    }
    
    public void Off(){
        isOn = false;
        System.out.println("---Tivi OFF---");
    }
    
    public void Switch(){
        if(isOn == false){
            isOn = true;
            System.out.println("---Tivi ON---");
        }else{
            isOn = false;
            System.out.println("---Tivi OFF---");
        }
    }
    
    public void Switch(String channel){
        if(isOn == false){
            System.out.println("Tivi chua bat!!");
        }else{
            int check = 0;
            for (String string : channelList) {
                if(string.equalsIgnoreCase(channel)){
                    check++;
                    System.out.println("Da tim thay kenh!!");
                    currentChannel = string;
                    break;
                }
            }
            if(check == 0) System.out.println("Khong tim thay kenh!!");
        }
    }
    
    public void nextChannel(){
        if(isOn == true){
            for (int i = 0; i < channelList.length; i++) {
                if(channelList[i].equalsIgnoreCase(currentChannel)){
                    if( i != channelList.length - 1 )  currentChannel = channelList[i+1];
                    else currentChannel = channelList[0]; 
                    break;
                }
            }
            System.out.println(currentChannel);
        }else System.out.println("Tivi chua bat!!");
    }
    
    public void previousChannel(){
        if(isOn == true){
            for (int i = 0; i < channelList.length; i++) {
                if(channelList[i].equalsIgnoreCase(currentChannel)){
                    if( i != 0 )  currentChannel = channelList[i-1];
                    else currentChannel = channelList[channelList.length-1]; 
                    break;
                }
            }
            System.out.println(currentChannel);
        }else System.out.println("Tivi chua bat!!");
    }
    
    public void Show(){
        if(isOn == true){
            System.out.println("---Tivi is On at channel: " + currentChannel + "---");
        }else{
            System.out.println("---Tivi now OFF!---");
        }
    }
}
