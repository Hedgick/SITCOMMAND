/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class HottubOnCommand implements Command {
    Hottub hottub;
    
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }
    
    public void execute() {
        hottub.on();
    }
    
    public void undo() {
        hottub.off();
    }
}