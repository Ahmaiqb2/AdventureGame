package AdventureGame;

public class Item {

private String itemName;
private String itemDescription;


public Item(String itemName, String itemDescription){

    this.itemName = itemName;
    this.itemDescription = itemDescription;
    }
    public String getitemDescription() {
        return itemDescription;
    }
    public String getItemName(){
    return itemName;
    }
}
