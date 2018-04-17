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
public class Tools extends Item {
    
    private int experience;

    public Tools(int experience, String itemName, String itemDescripton) {
        super(itemName, itemDescripton);
        this.experience = experience;
    }
    
    
    public void incExperience(Player p){
        p.setExperience(experience);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescripton() {
        return itemDescripton;
    }

    public void setItemDescripton(String itemDescripton) {
        this.itemDescripton = itemDescripton;
    }

    public void use(Player p){
        p.setExperience(experience);
    }
   
   
    
}
