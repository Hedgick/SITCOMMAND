/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class CeilingFan {
    String name;
    int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    
    CeilingFan(String name) {
        this.name = name;
    }
    
    public void high() {
        System.out.println(name + " Скорость высокая");
        speed = HIGH;
    }
    
    public void medium() {
        System.out.println(name + " Скорость средняя");
        speed = MEDIUM;
    }
    
    public void low() {
        System.out.println(name + " Скорость низкая");
        speed = LOW;
    }
    
    
    public void on() {
        System.out.println(name + " Ветилятор включен");
    }

    public void off() {
        System.out.println(name + " Вентилятор выключен");
        speed = OFF;
    }
    
    public int getSpeed() {
        return speed;
    }
}