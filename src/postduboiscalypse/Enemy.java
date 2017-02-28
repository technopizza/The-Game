/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postduboiscalypse;

/**
 *
 * @author jconklin2391
 */
public class Enemy extends Entity {

    
    
    public Enemy(String name) {
        super(name);
    }
    public Enemy(String name, int hitPoints) {
        super(name, hitPoints);       
    }
    public Enemy(String name, int hitPoints, int damageToInflict) {
        super(name, hitPoints, damageToInflict);       
    }

      
    
}
