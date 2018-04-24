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
public class Boss extends Enemy {
    
    private String description = "";
    
    public Boss(String enemyName, int health, int damage) {
        super(enemyName, health, damage);
    }

    public String getDescription() {
        return description;
    }
    
    
}
