package AdventureGame;

public class Item {

private final String itemName;
private final String itemDescription;
private final int itemWeight;


public Item(String itemName, String itemDescription, int itemWeight){
    this.itemName = itemName;
    this.itemDescription = itemDescription;
    this.itemWeight = itemWeight;
    }

    public String getItemName(){
        return itemName;
    }

    public String getitemDescription() {
        return itemDescription;
    }
    public int getItemWeight(){
    return itemWeight;
    }


}
