/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

import java.util.ArrayList;

/**
 *
 * @author Tweny
 */
public class Player {

    private String name;
    private int health;
    private int experience;
    private Room currentRoom;

    private ArrayList<Item> backpack = new ArrayList();

    // Adgang til lukkede rum når de er true
    private boolean scroll = false;
    private boolean axe = false;
    private boolean chest = false;
    private boolean key = false;
    private boolean sword = false;
    private boolean rope = false;
    private boolean stone = false;
    
    private Item [] hand = new Item[1]; //????

    public Player(String name, int health, int experience) {
        this.name = name;
        this.health = health;
        this.experience = experience;
    }

    public String getBackpackItems() {
             String backpackItems = "";
        if (backpack.size() > 0) {
            for (int i = 0; i < backpack.size(); i++) {
                backpackItems = backpackItems + backpack.get(i).itemName + "\n";
            }
        }
        else {
                backpackItems = backpackItems + "Backpack is empty! \n";
            }

        return backpackItems;
        
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }
    
    

    public void setBackpack(ArrayList<Item> backpack) {
        this.backpack = backpack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public boolean isScroll() {
        return scroll;
    }

    public void setScroll(boolean scroll) {
        this.scroll = scroll;
    }

    public boolean isAxe() {
        return axe;
    }

    public void setAxe(boolean axe) {
        this.axe = axe;
    }

    public boolean isChest() {
        return chest;
    }

    public void setChest(boolean chest) {
        this.chest = chest;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public boolean isSword() {
        return sword;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
    }

    public boolean isRope() {
        return rope;
    }

    public void setRope(boolean rope) {
        this.rope = rope;
    }

    public boolean isStone() {
        return stone;
    }

    public void setStone(boolean stone) {
        this.stone = stone;
    }

    public void addItemToBackback(Item item) {
        backpack.add(item);
    }

  

}
