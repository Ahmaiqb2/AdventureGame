package AdventureGame;

public class Item {

private String itemName;
private String itemDescription;
private int itemWeight;


public Item(String itemName, String itemDescription, int itemWeight){
    this.itemName = itemName;
    this.itemDescription = itemDescription;
    this.itemWeight = itemWeight;
    }

    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getitemDescription() {
        return itemDescription;
    }
    public int getItemWeight(){
    return itemWeight;
    }


}
