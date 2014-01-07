/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commander;

/**
 *
 * @author Admin
 */
public class CommandGoncharov {
    
        public static void main(String[] args) {
        Winner winObj=new Winner();
        Command Barcelona=new championsBarcelona(winObj);
        Command RealMadrid=new championsRealMadrid(winObj);
        
        SwitchChampions s=new SwitchChampions(Barcelona,RealMadrid);
        
        s.win1();
        s.win2();
    }
}
