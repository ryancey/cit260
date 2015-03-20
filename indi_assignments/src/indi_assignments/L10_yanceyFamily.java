/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indi_assignments;

import L10.indi.assign.enums.yanceyFam;
import L10.indi.assign.interfaces.displayInfo;
import java.util.Scanner;
/**
 *
 * @author rachelangilau
 */
public class L10_yanceyFamily  implements displayInfo{

    @Override
    public void citizenship(){
        System.out.print(" From the United States ");
    }
   
     public L10_yanceyFamily(){
     }
     public void familytree(){
         yanceyFam yancey;
   
     yancey = yanceyFam.Daniella;
        switch (yancey) {
            case Zane:
                citizenship();
                System.out.println("Zane is Head of the household");
                break;
            case Rachel:
                citizenship();
                System.out.println("Rachel is Matriarch of the household");
                break;
            case Daniella:
                citizenship();
                System.out.println("\n Daniella is an only child");
                break;
            default:
                System.out.println("Invalid");
               
              
                
        }
    }
   
}
  

