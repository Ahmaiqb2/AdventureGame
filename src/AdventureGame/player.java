package AdventureGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    public Room currentRoom;
    private Room requestedRoom;
    private Item item1;

    public Player() {
        this.currentRoom = currentRoom;

    }

    public Room playerLocation(Room currentLocation) {
        return this.currentRoom = currentLocation;
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


    public Item getItem() {
        return item1;

    }
    public void setItem(Item item){
        item1 = item;
    }
}









