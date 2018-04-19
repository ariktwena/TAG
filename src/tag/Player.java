/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

/**
 *
 * @author Tweny
 */
public class Player {
    private String name;
    private int health;
    private int experience; 
    private Room currentRoom;
    
    
    // Adgang til lukkede rum når de er true
    private boolean scroll = false;
    private boolean axe = false;

    public Player(String name, int health, int experience) {
        this.name = name;
        this.health = health;
        this.experience = experience;
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
    

}
