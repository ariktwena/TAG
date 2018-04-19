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

    private ArrayList<Room> rooms = new ArrayList();

    PlayerInput playerInput = new PlayerInput();
    Player player; // Kan ikke laves: Player player = new Player(playerInput.nameInput(),player.getHealth(),player.getExperience());
    Item item;

    // Items i spillet
    Item Scroll = new Item("Scroll", "Magic scroll"); //Skal uddybes
    Item Axe = new Item("Axe", "Hard Axe");
    Item Chest = new Item("Chest", "Big chest");
    Item Stone = new Item("Stone", "Big Stone");
    Item Rope = new Item("Rope", "Long rope");
    Item Sword = new Item("Sword", "Long sword");
    Item Key = new Item("Key", "Small key");

    // Vi optter vores rum og de veje man kan gå, samt indsætter dem i et array
    public void createRooms() {

        Room A2 = new Room("A2 - rope room", "You walk into a `seemingly´ empty room.");
        Room A3 = new Room("A3 - Stone room", "You enter a small room that is only lit up by a still burning torch that lies on the ground. Next to it is a small rock that is a throwable size.");
        Room A4 = new Room("A4 - Startroom", "There is a small hole at the top of the cave. It lightens up the room which shows you 3 paths.");
        Room A5 = new Room("A5 - The Ugly Room", "You’re looking around…. Hmmm it’s like you have been here before. Cold with ugly walls… Wait, ahhh I’m thinking about my apartment back home! ");

        Room B3 = new Room("B3", "There is a small hole at the top of the cave. It lightens up the room which shows you 3 paths.");
        Room B4 = new Room("B4", "A large pit of a weird liquid substance has filled the middle of this room. Passageways makes it possible to go around, You figure that it is better to steer around this substance.");
        Room B5 = new Room("B5 - ScrollRoom", "There is slightly light piping in from the holes in the walls. There is an item in the middle of the room.  I’ll better inspect it. What is that sound that I hear??");
        Room B6 = new Room("B6 - The Kitchen", "WTF… This room is full of dead rats… Is that human bite-marks? I guess this is the kitchen!!  ");

        Room C2 = new Room("C2 - GateKeeper", "You walk into a bigass room lit with fire.\n In the middle of the the room is a HUUUGE Dragon with hair like Donald Trump.\n It quickly feels your presence, and sends his minion politicians after you.");
        Room C3 = new Room("C3 - Pickaxe room", "A skeleton lies in the room. His demise must come from the pickaxe that has been firmly attached to his skull.");
        Room C4 = new Room("C4 - Crazy compas room", "Before you is a granite pedestal with a compass on it. The compass needle is spinning wildly. What does it mean?");
        Room C5 = new Room("C5 - The bug", "The sound is coming closer… I feel I’m on the right path. But they people at built these rooms really need a good designer!! It looks like shit. Ohhh a bug… ummmm foooood…");
        Room C6 = new Room("C6 - The Wall", "What the hell… There are strange lights coming from the south wall. I better check it out. I get the strange feeling that this could be the right way. The south wall also doesn’t look so solid.");

        Room D2 = new Room("D2 - WellRoom", "In the middle of this new room there is a well. It looks hundreds of years old.");
        Room D3 = new Room("D3", "This room is split by what seems like an endless ravine. There is crude rope bridge that you can use to cross.");
        Room D4 = new Room("D4", "A small campfire lights the room, which reveals large drawings of different animals.");
        Room D5 = new Room("D5 - The Dark Room", "What is that sound and why is this room so dark??!! Well fuck it… Let me feel around. I wish I had a flashlight… Actually I wish I had a million dollars. Oh tiny fairy… WHERE ARE YOU??!!  ");
        Room D6 = new Room("D6 - The WHY Room", "YEEESSSS finally I get a little success. I knew there was something fishy about that wall. Good thing I was listening to my instincts. But why am I still in this shit hole….");

        Room E1 = new Room("E1 - BigBoss Donald Trump", "You have finally reached the BigBoss Donald Trump Dragon! Good Job! The dragon breathes out flames, telling you to come at him.\nHope you are ready for this. FIGHT.");
        Room E2 = new Room("E2", "This room has an eerie feeling to it.");
        Room E3 = new Room("E3", "You only see a small passage which can narrowly pass through.");
        Room E4 = new Room("E4", "Lit candles are everywhere. It lights up a pathway to an huge altar. After further study you see a the altar is marked with paintings of a huge winged beast.");
        Room E6 = new Room("E6 - The Secret", "Hmmmm… Wait a second… A dead end??!! WTF!!!!! This can’t be right??? There has to bee something I missed along the way. Why would that wall be closed up, if not to hide something? I better explore some more..");

        A2.setItem(Rope);
        A2.setEast(A3);
        A2.setNorth(null);
        A2.setWest(null);
        A2.setSouth(null);

        A3.setItem(Stone);
        A3.setNorth(null);
        A3.setWest(A2);
        A3.setSouth(B3);
        A3.setEast(A4);

        A4.setNorth(null);
        A4.setWest(A3);
        A4.setSouth(B4);
        A4.setEast(A5);

        A5.setNorth(null);
        A5.setEast(null);
        A5.setWest(A4);
        A5.setSouth(B5);

        B3.setWest(null);
        B3.setSouth(null);
        B3.setNorth(A3);
        B3.setEast(B4);

        B4.setNorth(A4);
        B4.setWest(B3);
        B4.setSouth(C4);
        B4.setEast(B5);

        B5.setItem(Chest);
        B5.setItem(Scroll);
        B5.setEast(null);
        B5.setNorth(A5);
        B5.setWest(B4);
        B5.setSouth(C5);

        B6.setEast(null);
        B6.setNorth(null);
        B6.setWest(null);
        B6.setSouth(C6);

        C2.setNorth(null);
        C2.setWest(null);
        C2.setSouth(null);
        C2.setEast(C3);

        C3.setItem(Axe);
        C3.setSouth(null);
        C3.setNorth(null);
        C3.setWest(C2);
        C3.setEast(C4);

        C4.setNorth(B4);
        C4.setWest(C3);
        // Spiller kan kun komme igennem hvis de har en Scroll
        if (player.isScroll() == true) {
            C4.setSouth(D4);
        }
        C4.setEast(C5);

        C5.setNorth(B5);
        C5.setWest(C4);
        C5.setSouth(D5);
        C5.setEast(C6);

        C6.setEast(null);
        C6.setNorth(B6);
        C6.setWest(C5);
        //Spiller kan kun komme igennem hvis de har en Axe
        if (player.isAxe() == true) {
            C6.setSouth(D6);
        }

        D2.setItem(Sword);
        D2.setNorth(null);
        D2.setWest(null);
        D2.setSouth(E2);
        D2.setEast(D3);

        D3.setSouth(null);
        D3.setNorth(null);
        D3.setWest(D2);
        D3.setEast(D4);

        D4.setEast(null);
        D4.setSouth(null);
        D4.setNorth(C4);
        D4.setWest(D3);

        D5.setItem(Key);
        D5.setEast(null);
        D5.setSouth(null);
        D5.setWest(null);
        D5.setNorth(C5);

        D6.setEast(null);
        D6.setWest(null);
        D6.setNorth(C6);
        D6.setSouth(E6);

        E1.setWest(null);
        E1.setNorth(null);
        E1.setSouth(null);
        E1.setEast(E2);

        E2.setSouth(null);
        E2.setNorth(D2);
        E2.setWest(E1);
        E2.setEast(E3);

        E3.setSouth(null);
        E3.setNorth(null);
        E3.setWest(E2);
        E3.setEast(E4);

        E4.setEast(null);
        E4.setSouth(null);
        E4.setNorth(D4);
        E4.setWest(E3);

        E6.setWest(null);
        E6.setEast(null);
        E6.setSouth(null);
        E6.setNorth(D6);

        //Add room to array
        rooms.add(A2);
        rooms.add(A3);
        rooms.add(A4);
        rooms.add(A5);
        rooms.add(B3);
        rooms.add(B4);
        rooms.add(B5);
        rooms.add(B6);
        rooms.add(C2);
        rooms.add(C3);
        rooms.add(C4);
        rooms.add(C5);
        rooms.add(C6);
        rooms.add(D2);
        rooms.add(D3);
        rooms.add(D4);
        rooms.add(D5);
        rooms.add(D6);
        rooms.add(E1);
        rooms.add(E2);
        rooms.add(E3);
        rooms.add(E4);
        rooms.add(E6);

    }

    // Opretter et startrum
    public Room startRoom() {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomName().contains("A4")) {
                Room startroom = rooms.get(i);
                return startroom;
            }
        }
        return null;
    }

    //Kriterier for start af spillet
    public void start() throws InterruptedException {
        player = new Player(playerInput.nameInput(), 100, 20);
        createRooms();
        Room startroom = startRoom();
        if (startroom == null) {
            System.out.println(playerInput.noRoom());
        }
        player.setCurrentRoom(startroom);
        //playerInput.welcomeMessage();
        //playerInput.letsStart();
        System.out.println(player.getCurrentRoom().getDescription());
        if (player.getCurrentRoom().getItem() != null) {
            System.out.println(player.getCurrentRoom().getItem().getItemDescripton());
        }
        play(player);

    }

    // Loop til at kre spillet med de veje man kan gå osv
    public void play(Player player) throws InterruptedException {
        while (true) {
            ArrayList<String> movements = getMoveOptions(player);
            int movementNumber = playerInput.getPlayerInput(movements);
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

        movements.add("Press 6 to to see backpack items");

//        if (player.getBackpack().size() > 0) {
//            movements.add("Press 7 equip item");
//        }
        return movements;
    }

    // Når en spiller vælger en vej kan de bevære sig ind i det næste rum
    public void playerControl(int movementNumber) throws InterruptedException {

        switch (movementNumber) {
            case 1:
                player.setCurrentRoom(player.getCurrentRoom().getNorth());
                playerInput.transitText();
                System.out.println(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    System.out.println(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 3:
                player.setCurrentRoom(player.getCurrentRoom().getSouth());
                playerInput.transitText();
                System.out.println(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    System.out.println(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 2:
                player.setCurrentRoom(player.getCurrentRoom().getEast());
                playerInput.transitText();
                System.out.println(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    System.out.println(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 4:
                player.setCurrentRoom(player.getCurrentRoom().getWest());
                playerInput.transitText();

                System.out.println(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().getItem() != null) {
                    System.out.println(player.getCurrentRoom().getItem().getItemDescripton());
                }
                break;
            case 5:
                player.addItemToBackback(player.getCurrentRoom().getItem());
                playerInput.playerMadePickUp(player.getCurrentRoom().getItem().getItemName());
                player.getCurrentRoom().clearItem();
                break;
            case 6:
                String backpacItems = player.getBackpackItems();
                playerInput.printBackpack(backpacItems);
                break;
//            case 7:
//                
//                break;
        }
    }
        
//        public ArrayList<String> getEquipOptions(Player player) {
//        ArrayList<String> getEquipOptions = new ArrayList();
//        int x = 1;
//            for (int i = 0; i < player.getBackpack().size(); i++) {
//                getEquipOptions.add("Press " + x + " equipe " + player.getBackpack().get(i).getItemName()); 
//                x++;
//            }
//        return getEquipOptions;
//    }

    }

