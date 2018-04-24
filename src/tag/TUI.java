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
public class TUI {

    Scanner scanner = new Scanner(System.in);

    //Spiller kan skrive indput som fx navn
    public String playerInput() {
        System.out.print("> ");
        String input = scanner.next();
        return input;
    }

    // Spiller kan skrive sit navn
    public String nameInput() throws InterruptedException {
        System.out.print("\nWhat is your name? ");
        String name = scanner.next();
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

    // Igen startrum
    public void noRoom() {
        String noRoom = "There is no startroom";
        System.out.println(noRoom);
    }

     void whereToGo() {
        System.out.println("Where do you want to go?");
    }
    void chooseOtherOption() {
        System.out.println("Please choose the right option");
    }

    
    void printBackpack(String backpacItems) {
        System.out.println(backpacItems);
    }
    
    void stone() {
        System.out.println("You have picked up a stone");
    }
    void rope() {
        System.out.println("You have picked up a rope");
    }
    void scroll() {
        System.out.println("You have picked up a scroll");
    }
    void key() {
        System.out.println("You have picked up a rope");
    }
    void chest() {
        System.out.println("You have opend a chest");
    }
    void sword() {
        System.out.println("You have picked up a sword");
    }
    void axe() {
        System.out.println("You have picked up an Axe");
    }
    
    void printName(String name) {
        System.out.print(name);
    }
    
     void printDescription(String description) {
        System.out.print(description);
    }
     
     public String startRoomName(){ // Den skal normalt have en variable (String startRoomName){
         String startRoomName = "A4";
         return startRoomName;
     }
    
   
    

}
