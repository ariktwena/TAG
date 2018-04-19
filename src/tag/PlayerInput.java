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

    // Igen startrum
    public String noRoom() {
        String noRoom = "There is no startroom";
        return noRoom;
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
                if (movements.get(i).substring("Press ".length(), "Press ".length() + 1).equals(movementOption)) {
                    int movementNumber = Integer.parseInt(movementOption);
                    return movementNumber;
                }
            }
            System.out.println("Please choose the right option");
        }
    }

    void playerMadePickUp(String itemName) {
        switch (itemName) {
            case "Stone":
                System.out.println("You have picked up a stone");
                break;
            case "Rope":
                System.out.println("You have picked up a rope");
                break;
            case "Scroll":
                System.out.println("You have picked up a scroll");
                break;
            case "Key":
                System.out.println("You have picked up a key");
                break;
            case "Chest":
                System.out.println("You have opend a chest");
                break;
            case "Sword":
                System.out.println("You have picked up a sword");
                break;
            case "Axe":
                System.out.println("You have picked up an Axe");
                break;
        }
    }

    void printBackpack(String backpacItems) {
        System.out.println(backpacItems);
    }
    
//    public int getPlayerInputItem(ArrayList<String> getEquipOptions) {
//
//        while (true) {
//            for (int i = 0; i < getEquipOptions.size(); i++) {
//                System.out.println(getEquipOptions.get(i));
//            }
//            System.out.println("What do you want to equip");
//
//            String equipOption = sc.next();
//
//            for (int i = 0; i < getEquipOptions.size(); i++) {
//                if (getEquipOptions.get(i).substring("Press ".length(), "Press ".length() + 1).equals(equipOption)) {
//                    int getEquipOptionsNumber = Integer.parseInt(equipOption);
//                    return getEquipOptionsNumber;
//                }
//            }
//            System.out.println("Please choose the right option");
//        }
//    }

}
