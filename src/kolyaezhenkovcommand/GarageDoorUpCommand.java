/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kolyaezhenkovcommand;

/**
 *
 * @author Kolus
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    
    public void execute() {
        garageDoor.up();
    }
    
    public void undo() {
        garageDoor.down();
    }
}
