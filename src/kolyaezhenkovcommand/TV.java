/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class TV {
    String name;
    
    public TV(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(name + " Телефизор включен");
    }
    
    public void off() {
        System.out.println(name + " Телевизор выключен");
    }
}
