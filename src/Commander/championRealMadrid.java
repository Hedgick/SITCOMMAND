/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commander;

/**
 *
 * @author Admin
 */
public class championRealMadrid implements Command {


    private Winner winObj;

    

    public championRealMadrid(Winner winObj) {
        this.winObj=winObj;
    }
    
    @Override
    public void doIt() {
       winObj.RealMadrid();
    }
}
