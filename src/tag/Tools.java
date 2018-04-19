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

    public Tools( String itemName, String itemDescripton, int experience) {
        super(itemName, itemDescripton);
        this.experience = experience;
    }
    
    // Forøger spiller erfaring 
    public void incExperience(Player player){
        player.setExperience(experience);
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

    // Hvad der sker når en spiller bruger et tool
    public void use(Player player){
        player.setExperience(experience);
    }
   
   
    
}
