/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indi_assignments;

import L10.indi.assign.enums.yanceyFam;
import L10.indi.assign.interfaces.displayInfo;
import L11.indi.assign.exception.L11_yanceyFamException;
import java.util.Arrays;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rachelangilau
 */
public class L10_yanceyFamily  implements displayInfo {
    static String[][] family = {//string array of family members
        {"Z", "Zane"},
        {"R", "Rachel"},
        {"D", "Daniella"},
    };
  
    public static void display() throws L11_yanceyFamException{
        System.out.println(Arrays.deepToString(family));//displays string[][] family
            //making sure String[][]family carries its values
            try{
                if (family == null){
                    throw new L11_yanceyFamException();
                }       
            }
            //once caught will tell user and computer theres something wrong
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught: " + e );    
            }
        System.out.println("\n Choose a family member:");
        
    }
    
    @Override//interfaces
    public void citizenship(){
        System.out.print(" is from the United States. ");
    }
   
    //displays the String[][] family and gets user input and displays the values enumeration 
    public  void familytree(){
       
        String choice;
        Scanner input = new Scanner(System.in);
        do{
            try {
                display();
            } catch (L11_yanceyFamException ex) {
                Logger.getLogger(L10_yanceyFamily.class.getName()).log(Level.SEVERE, null, ex);
            }
    
   
            choice = input.nextLine();
            choice = choice.trim().toUpperCase();
   
            switch (choice) {
            
                case "Z":
                    System.out.print(yanceyFam.ONE);//calling enumeration values
                    citizenship();
                    System.out.println("\n He is the Head of the household.");
                    break;
                case "R":
                    System.out.print(yanceyFam.TWO);
                    citizenship();
                    System.out.println("\nShe is Matriarch of the household.");
                    break;
                case "D":
                    System.out.print(yanceyFam.THREE);
                    citizenship();
                    System.out.println("\n Daniella is an only child.");
                    break;
                default:
                    System.out.println("\n Invalid!");
               
              
                
            }
        }while(!choice.equals("D"));
   
    }   
}
  

