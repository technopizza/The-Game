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
public class Grid {
    
    private Entity[][] entityArray;

      
    public Grid(int tilesX, int tilesY) {
        this.entityArray = new Entity[tilesX][tilesY];
    }
    
    
    
}
