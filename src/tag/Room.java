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
public class Room {

    private String roomName;
    private String description;
    private Room north;
    private Room south;
    private Room west;
    private Room east;

// Adgang til lukkede rum når de er true
    public static boolean scroll = false;
    private boolean axe = false;
    private boolean chest = false;
    private boolean key = false;
    private boolean sword = false;
    private boolean rope = false;
    private boolean stone = false;
    
    //    //Fjender bekæmpet
    private boolean bossNotDefeted = true;
    private boolean miniBossNotDefeted = true;

    Item item;
    Enemy enemy;

    public Room(String roomName, String description) {
        this.roomName = roomName;
        this.description = description;
    }

    public String getRoomName() {
        return roomName;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public String getDescription() {
        return description;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void clearItem() {
        item = null;
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

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public boolean isBossNotDefeted() {
        return bossNotDefeted;
    }

    public void setBossNotDefeted(boolean bossNotDefeted) {
        this.bossNotDefeted = bossNotDefeted;
    }

    public boolean isMiniBossNotDefeted() {
        return miniBossNotDefeted;
    }

    public void setMiniBossNotDefeted(boolean miniBossNotDefeted) {
        this.miniBossNotDefeted = miniBossNotDefeted;
    }
    
    

    
}
