/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class Light {
    String name;
    
    public Light(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(name + " Свет включен");
    }
    
    public void off() {
        System.out.println(name + " Свет выключен");
    }
}
