/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class GarageDoor {
    String name;
    
    GarageDoor(String name) {
        this.name = name;
    }
    
    public void up() {
        System.out.println(name + " Дверь открыта");
    }
    
    public void down() {
        System.out.println(name + " Дверь закрыта");
    }
    
    public void stop() {
        System.out.println(name + " Дверь остановлена");
    }
    
    public void lightOn() {
        System.out.println(name + " Свет включен");
    }
    
    public void lightOff() {
        System.out.println(name + " Свет выелючен");
    }
}
