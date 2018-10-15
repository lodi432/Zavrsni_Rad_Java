/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.postavke;

import glavacevic.view.FramePostavke;
import java.awt.Color;

/**
 *
 * @author MacaZekoMiš
 */
public class PostaviIzgled {
 
   
   
    
    public void PostaviIzgled(){
        Postavke p = new Postavke ();
        
        if(p.UcitajPostavke().equals("1"))
        {
              FramePostavke.MotherBoard.setkStartColor(new java.awt.Color(255,255,255));
         FramePostavke.MotherBoard.setkEndColor(new java.awt.Color(51,255,204));
            
        }
        else if(p.UcitajPostavke().equals("2"))
        {
               FramePostavke.MotherBoard.setkStartColor(new java.awt.Color(51,102,255));
                 FramePostavke.MotherBoard.setkEndColor(new java.awt.Color(0,204,255));
        }
          else if(p.UcitajPostavke().equals("3"))
        {
              FramePostavke.MotherBoard.setkStartColor(new java.awt.Color(0,0,0));   
              FramePostavke.MotherBoard.setkEndColor(new java.awt.Color(0,18,51));
        }
        
//           switch (p.UcitajPostavke()) {
//            case "1":
//                break;
//            case "2":
//                break;
//            case "3":
//                break;
//            default:
//                break;
//        }
        
        
         
    }
}
