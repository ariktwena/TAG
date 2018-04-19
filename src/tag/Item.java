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
public class Item {
    
    String itemName;
    String itemDescripton;

    public Item(String itemName, String itemDescripton) {
        this.itemName = itemName;
        this.itemDescripton = itemDescripton;
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
    
    
    //Item skal evt ind i et arraylist (inventory)
    public void use(Player player){
        
    }
    
}
