/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class Stereo {
    String name;
    
    public Stereo(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(name + " Включено стерео");        
    }
    
    public void off() {
        System.out.println(name + " Выключено стерео");
    }
    
    public void setCd() {
        System.out.println(name + " Стерео CD");
    }
    
    public void setDvd() {
        System.out.println(name + " Стерео DVD ");
    }
    
    public void setRadio() {
        System.out.println(name + " Стерео Радио");
    }
    
    public void setVolume(int volume) {
        System.out.println(name + " Громкость стерео установить " + volume);
    }
}