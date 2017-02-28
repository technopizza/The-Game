/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postduboiscalypse;

import java.util.ArrayList;
import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author jconklin2391
 */
public class Level1 extends BasicGameState {


    private static TiledMap tiledMap;

    private static AppGameContainer app;

    private static Camera camera;

    public static int counter = 0;

    Player player = new Player("Player");
    
    
    Input input;
    
    
    public Level1(int xSize, int ySize) {

    }

    public void init(GameContainer gc, StateBasedGame sbg)
            throws SlickException {


          
        gc.setTargetFrameRate(60);

        gc.setShowFPS(false);

        tiledMap = new TiledMap("res/untitled.tmx");

        

        camera = new Camera(gc, tiledMap);

       player.positionX = 60 ;
       player.positionY = 60 ;
       player.spriteSheet = new SpriteSheet();
      
       

        }
   


    public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
            throws SlickException {

        g.setColor(Color.red);
g.drawString("Hey" , 10,   20);
//        g.drawString("Score: " + duBois.getScore(), camera.cameraX + 20,
//                camera.cameraY + 20);
        
        
        //camera.centerOn((int) duBois.getPositionX(), (int) duBois.getPositionY());

       camera.drawMap();
//
      camera.translateGraphics();
//
//        
//        g.setColor(Color.red);
//        g.drawString("Health: " + duBois.getHealth(), camera.cameraX + 10,
//                camera.cameraY + 10);
//        g.drawString("Score: " + duBois.getScore(), camera.cameraX + 20,
//                camera.cameraY + 20);
//
//        drawenemies(g);

    

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta)
            throws SlickException {

      input = gc.getInput();

      if (input.isKeyDown(Input.KEY_DOWN)){
          
      }
      else if (input.isKeyDown(Input.KEY_UP)){
          
      }
      else if (input.isKeyDown(Input.KEY_LEFT)){
          
      }
      else if (input.isKeyDown(Input.KEY_RIGHT)){
          
      }
        
        //duBois.health -= counter / 1000;
//        if (duBois.getHealth()
//                <= 0) {
//            makevisible();
//            sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
//        }
//        if (duBois.getScore()
//                >= 100) {
//            makevisible();
//            duBois.setScore(0);
//            sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
//        }

    }

    public int getID() {

        return 1;

    }

   
//    private boolean isBlocked(float tx, float ty) {
//
//        int xBlock = (int) tx / tileSize;
//
//        int yBlock = (int) ty / tileSize;
//
//        return Blocked.blocked[xBlock][yBlock];
//
//        // this could make a better kludge
//    }



    }