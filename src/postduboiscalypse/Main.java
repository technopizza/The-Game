/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postduboiscalypse;
import org.newdawn.slick.*;

import org.newdawn.slick.state.*;



public class Main extends StateBasedGame{

   

   public static final String gamename = "Test 1";

   public static final int play = 1;

   public static final int xSize = 700;

   public static final int ySize = 700;

   

   public Main(String gamename){

      super(gamename);

//      this.addState(new Menu(xSize, ySize));
//
    this.addState(new Level1(xSize, ySize));
//      
//      this.addState(new lose(xSize, ySize));
//      
//      this.addState(new win(xSize, ySize));

   }

   

   public void initStatesList(GameContainer gc) throws SlickException{

      this.getState(play).init(gc, this);

      this.enterState(play);

   }

   

   public static void main(String[] args) {

      AppGameContainer appgc;

      try{

         appgc = new AppGameContainer(new Main(gamename));

         appgc.setDisplayMode(xSize, ySize, false);
         
         int maxFPS = 60;
        
         appgc.setTargetFrameRate(maxFPS);

         appgc.setTargetFrameRate(60);

         appgc.start();

      }catch(SlickException e){
          System.out.println(""
                  + "aaaaaaaaaaaaaaaaaaaaaaaaaa");
         e.printStackTrace();

      }

   }

}