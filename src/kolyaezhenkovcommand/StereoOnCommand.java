/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class StereoOnCommand implements Command{
    Stereo stereo;
    
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    public void execute() {
        stereo.on();
    }
    
    public void undo() {
        stereo.off();
    }
}