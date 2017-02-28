/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postduboiscalypse;

import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author jconklin2391
 */
public abstract class Entity {
    
    String name;
    
    int positionX;
    int positionY;
    float angle;
    int speed;
    
    //Shape hitBox = new Rectangle(hitBoxPositionX, hitBoxPositionY, 64, 64);
    
    SpriteSheet spriteSheet;
    
    int hitPoints;
    int damageToInflict;

    public Entity(String name) {
        this.name = name;
        this.hitPoints = 1;
        this.damageToInflict = 0;
        //this.vector = new Vector();        
    }
    
    public Entity(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damageToInflict = 0;
        //this.vector = new Vector();        
    }

    public Entity(String name, int hitPoints, int damageToInflict) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damageToInflict = damageToInflict;
        //this.vector = new Vector();
    }
 
}
