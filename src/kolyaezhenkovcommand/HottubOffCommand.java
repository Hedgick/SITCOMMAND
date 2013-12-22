/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class HottubOffCommand implements Command {
    Hottub hottub;
    
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    public void execute() {
        hottub.off();
    }
    
    public void undo() {
        hottub.on();
    }
}
