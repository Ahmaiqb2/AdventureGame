package AdventureGame;

public class Room {
    private String name;
    private String[] items = {};
    private boolean currentRoom;
    private Room north;
    private Room south;
    private Room east;
    private Room west;


    public Room(String name, boolean currentRoom, String[] items){ // Constructor - En constructor er en cunstructor når den har det samme navn som en klasse
        this.name = name;
        /*this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;*/
        this.currentRoom = currentRoom;
        this.items = items;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(String[] items) {
        this.items = items;
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

    public String getName() {
        return name;
    }

    public String[] getItems() {
        return items;
    }

    public boolean isCurrentRoom() {
        return currentRoom;
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

    public void look(){
    System.out.println("You are currently in " + name);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

    }
    /*private boolean toggle;
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public Room() {
        this.toggle = false;
    }

    public void direction() {
        this.toggle = !toggle;
    }

    @Override
    public String toString() {
        if (toggle == true) {
            return name + " er tændt";
        } else {
            return name + " er slukket";
        }
    }*/
}
