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
public class Controller {

    Labyrinth labyrinth = new Labyrinth();

    TUI tui = new TUI();
    Player player; // Kan ikke laves: Player player = new Player(playerInput.nameInput(),player.getHealth(),player.getExperience());

    //Kriterier for start af spillet
    public void start() throws InterruptedException {
        player = new Player(tui.nameInput(), 100, 20);
        labyrinth.createRooms();
        String roomName = tui.startRoomName();
        Room startroom = labyrinth.startRoom(roomName);
        if (startroom == null) {
            tui.noRoom();
        }
        player.setCurrentRoom(startroom);
        //playerInput.welcomeMessage();
        //playerInput.letsStart();
        tui.printDescription(player.getCurrentRoom().getDescription());
        if (player.getCurrentRoom().getItem() != null) {
            tui.printDescription(player.getCurrentRoom().getItem().getItemDescripton());
        }
        play(player);

    }

    //Fortæller spilleren hvilken mulige options der er til fx at gå, kigge i bagback os
    public void movementList(ArrayList<String> movements) {
        for (int i = 0; i < movements.size(); i++) {
            tui.printArray(movements.get(i));
        }
    }

    //Sammenligner den option spilleren vælger med de muligheder spilleren har. Dette bruges til at fortælle spilleren om det er muligt eller ej
    public int movementListEqualPlayerInput(ArrayList<String> movements, String movementOption) {
        for (int i = 0; i < movements.size(); i++) {
            if (movements.get(i).substring("Press ".length(), "Press ".length() + 1).equals(movementOption)) {
                int movementNumber = Integer.parseInt(movementOption);
                return movementNumber;
            }
        }
        return 0;
    }

    // Loop spillet
    public void play(Player player) throws InterruptedException {
        while (true) {
            ArrayList<String> movements = getMoveOptions(player);
            movementList(movements);
            tui.whereToGo();
            String movementOption = tui.playerInput();
            int movementNumber = movementListEqualPlayerInput(movements, movementOption);
            playerControl(movementNumber);
        }
    }

    // Arraylist med de mulige veje man kan bevæge sig i spillet i et givent rum
    public ArrayList<String> getMoveOptions(Player player) {
        ArrayList<String> movements = new ArrayList();
        if (player.getCurrentRoom().getNorth() != null) {
            movements.add("Press 1 to go North");
        }
        if (player.getCurrentRoom().getEast() != null) {
            movements.add("Press 2 to go East");
        }
        if (player.getCurrentRoom().getSouth() != null) {
            movements.add("Press 3 to go South");
        }
        if (player.getCurrentRoom().getWest() != null) {
            movements.add("Press 4 to go West");
        }
        if (player.getCurrentRoom().getItem() != null) {
            movements.add("Press 5 to pick up item");
        }
        if (player.getBackpack().size() > 0) {
            movements.add("Press 6 to to see backpack items");
        }
        if (player.getBackpack().size() > 0) {
            movements.add("Press 7 use item");
        }
        return movements;
    }

    void playerMadePickUp(String itemName) {
        switch (itemName) {
            case "Stone":
                tui.stone();
                break;
            case "Rope":
                tui.rope();
                break;
            case "Scroll":
                tui.scroll();
                break;
            case "Key":
                tui.key();
                break;
            case "Chest":
                tui.chest();
                break;
            case "Sword":
                tui.sword();
                break;
            case "Axe":
                tui.axe();
                break;
        }
    }

    // Når en spiller vælger en vej kan de bevære sig ind i det næste rum
    public void playerControl(int movementNumber) throws InterruptedException {

        switch (movementNumber) {
            case 0:
                tui.chooseOtherOption();
                break;
            case 1:
                player.setCurrentRoom(player.getCurrentRoom().getNorth());
                tui.transitText();
                tui.printDescription(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    tui.printDescription(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 2:
                player.setCurrentRoom(player.getCurrentRoom().getEast());
                tui.transitText();
                tui.printDescription(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    tui.printDescription(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 3:
                player.setCurrentRoom(player.getCurrentRoom().getSouth());
                tui.transitText();
                tui.printDescription(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    tui.printDescription(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 4:
                player.setCurrentRoom(player.getCurrentRoom().getWest());
                tui.transitText();
                tui.printDescription(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    tui.printDescription(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 5:
                player.addItemToBackback(player.getCurrentRoom().getItem());
                playerMadePickUp(player.getCurrentRoom().getItem().getItemName());
                player.getCurrentRoom().clearItem();
                break;
            case 6:
                String backpacItems = player.getBackpackItems();
                tui.printBackpack(backpacItems);
                break;
            case 7:
                ArrayList<String> itemsInBackPack = getBackPackItems(player.getBackpack());
                tui.printBackpackUseOptions(itemsInBackPack);
                tui.whatToUse();
                String itemOption = tui.playerInput();
                String itemName = itemListEqualPlayerInput(itemsInBackPack, itemOption);
                itemControl(itemName);
                break;
        }
    }

    // Arraylist med de mulige veje man kan bevæge sig i spillet i et givent rum
    public ArrayList<String> getBackPackItems(ArrayList Backpack) {
        ArrayList<String> itemsInBackPack = new ArrayList();
        int x = 1;
        for (int i = 0; i < player.getBackpack().size(); i++) {
            itemsInBackPack.add("Press " + x + " to use " + player.getBackpack().get(i).getItemName());
            x++;
        }
        itemsInBackPack.add("Press 9" + " to return.");
        return itemsInBackPack;
    }

    //Sammenligner den option spilleren vælger med de muligheder spilleren har mht items
    public String itemListEqualPlayerInput(ArrayList<String> itemsInBackPack, String itemOption) {
        String itemName = "";
        for (int i = 0; i < itemsInBackPack.size(); i++) {
            if (itemOption.equals("9")) {
                return itemName = "Exit";
            } else if (itemsInBackPack.get(i).substring("Press ".length(), "Press ".length() + 1).equals(itemOption)) {
                itemName = player.getBackpack().get(i).getItemName();
                return itemName;
            }
        }
        return itemName = "Exit";
    }

    // Hvad sker der når en spiller vælger et item
    public void itemControl(String itemName) throws InterruptedException {
        switch (itemName) {
            case "Scroll":
                if(player.getCurrentRoom() == labyrinth.roomList().get(10)){
                //Spiller kan kun komme igennem hvis de har en Scroll
                labyrinth.setRoomRelationScroll();
                tui.printScroolUsage();   
                }
                else{
                tui.printErrorMassage();
                }

                break;
            case "Axe":
                if(player.getCurrentRoom() == labyrinth.roomList().get(12)){
                labyrinth.setRoomRelationAxe();
                }
                else{
                tui.printErrorMassage();
                }
                break;
            case "Stone":
                if(player.getCurrentRoom() == labyrinth.roomList().get(16)){
                tui.printKeyUsage();
                labyrinth.setRoomRelationKey();
                }
                else{
                tui.printErrorMassage();
                }
                break;
            case "Rope":
                if(player.getCurrentRoom() == labyrinth.roomList().get(16)){
                tui.printSwordUsage();
                labyrinth.setRoomRelationSword();
                }
                else{
                tui.printErrorMassage();
                }
                break;
            case "Sword":
                if(player.getCurrentRoom() == labyrinth.roomList().get(8) || player.getCurrentRoom() == labyrinth.roomList().get(18)){
               
                }
                else{
                tui.printErrorMassage();
                }

                break;
            case "Key":
                if(player.getCurrentRoom() == labyrinth.roomList().get(15)){
                
                }
                else{
                tui.printErrorMassage();
                }
                

                break;
            case "Exit":
                break;

        }
    }
}
