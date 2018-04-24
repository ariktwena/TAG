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
public class MiniBoss extends Enemy {
    
    private int experience = 100;
    private String description = "";
    
    public MiniBoss(String enemyName, int health, int damage) {
        super(enemyName, health, damage);
    }

    public int getExperience() {
        return experience;
    }

    public String getDescription() {
        return description;
    }
    
    
    
    
    
}
