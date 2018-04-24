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
public class Enemy {
    
    protected String enemyName;
    protected int health;
    protected int damage;

    public Enemy(String enemyName, int health, int damage) {
        this.enemyName = enemyName;
        this.health = health;
        this.damage = damage;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return enemyName + ": " + damage + "/" + health;
    }
    
    
    
}
