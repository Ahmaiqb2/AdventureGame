package AdventureGame;

import java.util.ArrayList;

public class Room {
    private final String roomDescription;
    private final String name;
    private final boolean currentRoom;
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

}