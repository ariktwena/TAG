/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tweny
 */
public class PlayerInput {
    
    Scanner sc = new Scanner(System.in);
    
    
    //Spiller kan skrive indput som fx navn
    public String playerInput() {
        System.out.print("> ");
        String input = sc.next();
        return input.toLowerCase();
    }

    // Spiller kan skrive sit navn
    public String nameInput() throws InterruptedException {
        System.out.print("\nWhat is your name? ");
        String name = sc.next();
        System.out.println("\nWelcome " + name + " to the text adventure of Arkham Asylum!");
        Thread.sleep(1000);
        return name;
    }
    
    // Walk forsinkelse
     public void transitText() throws InterruptedException {
        System.out.println("Walking....");
        Thread.sleep(1000);
        //System.out.println("You have entered a new room!");
    }
     

    
     // Spiller skrive det tal på den vej spilleren vil gå
    public int getPlayerInput(ArrayList<String> movements) {

        while (true) {
            for (int i = 0; i < movements.size(); i++) {
                System.out.println(movements.get(i));
            }
            System.out.println("Where do you want to go?");

            String movementOption = sc.next();
            
            for (int i = 0; i < movements.size(); i++) {
                if (movements.get(i).substring("Press ".length(), "Press ".length()+1).equals(movementOption)) {
                    int movementNumber = Integer.parseInt(movementOption);
                    return movementNumber;
                    
                } 
                
            }
            System.out.println("Please choose the right option");
        }
    }
     
     
     
     
     
    
//    public int getPlayerInput(ArrayList<String> a) {
//
//        while (true) {
//            for (int i = 0; i < a.size(); i++) {
//                System.out.println(a.get(i));
//            }
//            System.out.println("Where do you want to go?");
//
//            String x = sc.next();
//            
//            for (int i = 0; i < a.size(); i++) {
//                if (a.get(i).substring("Press ".length(), "Press ".length()+1).equals(x)) {
//                    int c = Integer.parseInt(x);
//                    return c;
//                    
//                } 
//                
//            }
//            System.out.println("Please choose the right option");
//        }
//    } 
     
}
