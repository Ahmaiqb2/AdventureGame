package AdventureGame;

import java.util.ArrayList;

public class Room {
    private String roomDescription;
    private String name;
    private String item;
    private boolean currentRoom;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    public ArrayList<Item> itemsListe = new ArrayList<>();
    public ArrayList<Enemy> enemyListe = new ArrayList<>();



    public Room(String name, boolean currentRoom, String roomDescription) { // Constructor - En constructor er en cunstructor når den har det samme navn som en klasse
        this.name = name;
        this.currentRoom = currentRoom;
        this.roomDescription = roomDescription;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public ArrayList<Item> getItemsListe() {
        return itemsListe;
    }
    public void addItem(Item item){
        itemsListe.add(item);
    }

    public ArrayList<Enemy> getEnemyListe() {
        return enemyListe;
    }
    public void addEnemy(Enemy enemy){
        enemyListe.add(enemy);
    }
    public void dropItem(Item item){
        itemsListe.remove(item);
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

    public String getName() {
        return name;
    }

    public String getRoomDescription() {
        return roomDescription;
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
}