package AdventureGame;

import java.util.ArrayList;

public class Room {
    private String name;
    private String item;
    private boolean currentRoom;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    public ArrayList<Item> itemsListe = new ArrayList<>();

    public Room(String name, boolean currentRoom, String items, ArrayList<Item> itemListe) { // Constructor - En constructor er en cunstructor når den har det samme navn som en klasse
        this.name = name;
        this.currentRoom = currentRoom;
        this.item = items;
        this.itemsListe = itemListe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void addItem(Item item){
        itemsListe.add(item);
    }

    public void setCurrentRoom(boolean currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setDirections(Room north, Room south, Room east, Room west) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void findItem(){

    }

    public void addItem(){

    }

    public ArrayList<Item> getItemsListe() {

        return itemsListe;
    }

    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }

    public boolean isCurrentRoom() {
        return currentRoom;
    }

    public Room getNorth(){
        return north;
    }

    public Room getSouth(){
        return south;
    }

    public Room getEast(){
        return east;
    }

    public Room getWest(){
        return west;
    }

}


/*private String name;
private String currentRoom;
private Room north;
private Room south;
private Room east;
private Room west;
public Room(String name, String currentRoom) { // Constructor - En constructor er en cunstructor når den har det samme navn som en klasse
        this.name = name;
        this.currentRoom = currentRoom;
        }
public Room getNorth() {
        return north;
        }
public void setNorth(Room north) {
        this.north = north;
        }
public Room getSouth() {
        return south;
        }
public void setSouth(Room south) {
        this.south = south;
        }
    public Room getNorth() {
        return north;
    }
    public Room getSouth() {
        return south;
    }
    public Room getEast() {
        return east;
    }
    public Room getWest() {
        return west;
    }
    public void look() {
        System.out.println("You are currently in " + name);
        System.out.println(this.item);
    }
public Room getEast() {
        return east;
        }
public void setEast(Room east) {
        this.east = east;
        }
public Room getWest() {
        return west;
        }
public void setWest(Room west) {
        this.west = west;
        }
public String look() {
        String result = "You are currently in " + name + "\n";
        result += currentRoom;
        return result;
        }*/