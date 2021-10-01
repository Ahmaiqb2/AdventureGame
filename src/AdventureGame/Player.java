package AdventureGame;

import java.util.ArrayList;

public class Player {

    public Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();

    public Player() {
        this.currentRoom = currentRoom;
    }

    public Room playerLocation(Room currentLocation) {
        return this.currentRoom= currentLocation;
    }

    public String waysToGo(String direction) {
        String result = direction;

        if (direction.equals("go north") || direction.equals("go n") || direction.equals("north")) {
            result = "n";
        } else if (direction.equals("go east") || direction.equals("go e") || direction.equals("east")) {
            result = "e";
        } else if (direction.equals("go south") || direction.equals("go s") || direction.equals("south")) {
            result = "s";
        } else if (direction.equals("go west") || direction.equals("go w") || direction.equals("west")) {
            result = "w";
        }
        return result;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public boolean take(String item){
        Item item1 = findItem(item);
        inventory.add(item1);
        return false;
    }

    public Item findItem(String itemName) {
        String requestedItem = "";
        for (int i = 0; i < currentRoom.itemsListe.size(); i++) {
            Item item = null;
            requestedItem = currentRoom.itemsListe.get(i).getItemName();
            if (requestedItem.equals(itemName)) {
                item = currentRoom.itemsListe.get(i);
            }
        }
        return null;
    }
}





