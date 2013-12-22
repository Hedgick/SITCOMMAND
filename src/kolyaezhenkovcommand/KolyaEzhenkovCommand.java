/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class KolyaEzhenkovCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
            Light light = new Light("Living room");
            TV tv = new TV("Living room");
            Stereo stereo = new Stereo("Living room");
            Hottub hottub = new Hottub();
            
            LightOnCommand lightOn = new LightOnCommand(light);
            StereoOnCommand stereoOn = new StereoOnCommand(stereo);
            TVOnCommand tvOn = new TVOnCommand(tv);
            HottubOnCommand hottubOn = new HottubOnCommand(hottub);
            
            LightOffCommand lightOff = new LightOffCommand(light);
            StereoOffCommand stereoOff = new StereoOffCommand(stereo);
            TVOffCommand tvOff = new TVOffCommand(tv);
            HottubOffCommand hottubOff = new HottubOffCommand(hottub);
            
            Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
            Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };
            
            MacroCommand partyOnMacro = new MacroCommand(partyOn);
            MacroCommand partyOffMacro = new MacroCommand(partyOff);
            
            remoteControl.setCommand(0,  partyOnMacro,  partyOffMacro);
            
            System.out.println(remoteControl);
            System.out.println("--- Вечеринка началась ---");
            remoteControl.onButtonWasPushed(0);
            System.out.println("--- Вечеринка закончилась ---");
            remoteControl.offButtonWasPushed(0);
    }
}
