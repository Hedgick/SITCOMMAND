/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Commander;

/**
 *
 * @author Admin
 */
 class championsBarcelona implements Command {

 private Winner winObj;

    public championsBarcelona(Winner winObj) {
        this.winObj = winObj;
    }
 
    @Override
    public void doIt() {
       winObj.Barcelona();
    }
}
