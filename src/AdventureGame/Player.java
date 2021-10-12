package AdventureGame;

import java.util.ArrayList;

public class Player {

    public Room currentRoom;
    private Room requestedRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Food> inventoryFood = new ArrayList<>();
    private ArrayList<Weapon> weaponInventory = new ArrayList<>();
    public int health;
    private String equip;


    public Player(int health) {
        this.health = health;
        this.currentRoom = currentRoom;
    }

    public Room playerLocation(Room currentLocation) {
        return this.currentRoom = currentLocation;
    }

    public int getHealth() {
        return health;
    }

    public String getEquip(){
        return equip;
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

    public void getInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Items: N/A");
        } else {
            System.out.println("Your backpack contains: ");
            for (Item item : inventory) {
                System.out.println(" " + item.getItemName());
            }
        }
    }

    public Item findItemInventory(String itemName) {
        for (int i = 0; i < inventory.size(); i++) {
            Item requestedItem = inventory.get(i);
            if (requestedItem.getItemName().equals(itemName)) {
                return requestedItem;
            }
        }
        return null;
    }

    public Item findItem(String itemName) {
        for (int i = 0; i < currentRoom.itemsListe.size(); i++) {
            Item requestedItem = currentRoom.itemsListe.get(i);
            if (requestedItem.getItemName().equals(itemName)) {
                return requestedItem;
            }
        }
        return null;
    }


    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public ArrayList<Item> getInventoryy() {
        return inventory;
    }

    public void addToInventory(Food food) {
        inventoryFood.add(food);
    }

    public void removefromInventory(Food food) {
        inventoryFood.remove(food);
    }

    public void addToInventory(Weapon weapon) {
        weaponInventory.add(weapon);
    }

    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

    public void removeFromInventory(Weapon weapon) {
        weaponInventory.remove(weapon);
    }

    public boolean changeRoom(String direction) {
        switch (direction) {
            case "N" -> requestedRoom = this.currentRoom.getNorth();
            case "E" -> requestedRoom = this.currentRoom.getEast();
            case "S" -> requestedRoom = this.currentRoom.getSouth();
            case "W" -> requestedRoom = this.currentRoom.getWest();
        }
        if (requestedRoom != null) {
            this.currentRoom = requestedRoom;
            return true;
        }
        return false;
    }

    public void eat(String foodName) {
        Food food = findFood(foodName);
        if (food == null) {
            System.out.println("you have nothing to eat");
        } else {
            health += ((Food) food).getHealing();

        }
    }

    public Food findFood(String foodName) {

        for (Item item : getInventoryy()) {
            if (item instanceof Food) {
                return (Food) item;
            }
        }
        return null;
    }

    public void equip(String equipment) {
        Weapon weapon = findWeapon(equipment);
        if (weapon == null) {
            System.out.println("You dont have a weapon in your inventory");
        } else {
            equip += ((Weapon) weapon).getWeaponName();
            System.out.println(equip);
        }
    }

    private Weapon findWeapon(String equipment) {
        for (Item item : getInventoryy()) {
            if (item instanceof Weapon) {
                return (Weapon) item;
            }
        }
        return null;

    }

    public void equiment(){
        if (equip == null){
            System.out.println("You dont have anything on");
        } else {
            System.out.println(getEquip());
        }
    }
}





