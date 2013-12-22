/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;
    
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public void execute() {
        garageDoor.down();
    }
    
    public void undo() {
        garageDoor.up();
    }
}
