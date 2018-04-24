/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tool | Templates
 * and open the template in the editor.
 */
package tag;

/**
 *
 * @author Tweny
 */
public class Tool extends Item {
    
    private int experience;

    public Tool( String itemName, String itemDescripton, int experience) {
        super(itemName, itemDescripton);
        this.experience = experience;
    }
    
//    // Forøger spiller erfaring 
//    public void incExperience(Player player){
//        player.setExperience(experience);
//    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String getItemDescripton() {
        return itemDescripton;
    }

    @Override
    public void setItemDescripton(String itemDescripton) {
        this.itemDescripton = itemDescripton;
    }

    // Forøger spiller erfaring 
    @Override
    public void use(Player player){
        player.setExperience(experience + player.getExperience());
    }
   
   
    
}
