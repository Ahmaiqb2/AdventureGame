package AdventureGame;

import java.util.Scanner;

public class Adventure {


    Room[] rooms = new Room[9];


    Room room1;
    Room room2;
    Room room3;
    Room room4;
    Room room5;
    Room room6;
    Room room7;
    Room room8;
    Room room9;



    public static void main(String[] args) {
        Room[] rooms = new Room[9];
        boolean running = true;
        int currentRoom = -1;

        System.out.println("Welcome to the Adventure Game");

        Room room1 = new Room("Room 1", true, "There is a fridge and a table");
        Room room2 = new Room("Room 2", false, "There is a table with a pen and a safe");
        Room room3 = new Room("Room 3", false, "There is a laptop, and a TV-screen connected to a Playstation 3");
        Room room4 = new Room("Room 4", false, "There is a basketball, and some clothes");
        Room room5 = new Room("Room 5", false, "There is some keys");
        Room room6 = new Room("Room 6", false, "Theres is a table with some chips, and biscuits");
        Room room7 = new Room("Room 7", false, "There is a teddy bear and some toys");
        Room room8 = new Room("Room 8", false, "There is a table with a spreadsheet on it");
        Room room9 = new Room("Room 9", false, "There is xx");


        room1.setDirections(null, room4, room2, null);
        room2.setDirections(null, null, room3, room1);
        room3.setDirections(null, room6, null, room2);
        room4.setDirections(room1, room7, null, null);
        room5.setDirections(null, room8, null, null);
        room6.setDirections(room3, room9, null, null);
        room7.setDirections(room4, null, room8, null);
        room8.setDirections(room5, null, room9, room7);
        room9.setDirections(room6, null, null, room8);

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
        rooms[5] = room6;
        rooms[6] = room7;
        rooms[7] = room8;
        rooms[8] = room9;

        while (running) {
            Scanner input = new Scanner(System.in);
            System.out.print("Where do you wanna go?: ");
            String inputUser = input.nextLine();



            if (inputUser.equals("go n") || inputUser.equals("go north")) {

                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].isCurrentRoom() == true) {
                        if (rooms[i].getNorth() == null) {
                            System.out.println("You can not go there");
                            break;
                        } else {
                            rooms[i].setCurrentRoom(false);
                            currentRoom = i;
                            rooms[i].getNorth().setCurrentRoom(true);
                            System.out.println("You are now in " + rooms[i].getNorth().getName());
                            break;

                        }
                    }

                }
            } else if (inputUser.equals("go s") || inputUser.equals("go south")) {
                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].isCurrentRoom() == true) {

                        if (rooms[i].getSouth() == null) {
                            System.out.println("You can not go there");
                            break;
                        } else {

                            rooms[i].setCurrentRoom(false);
                            currentRoom = i;
                            rooms[i].getSouth().setCurrentRoom(true);
                            System.out.println("You are now in " + rooms[i].getSouth().getName());
                            break;
                        }
                    }

                }
            } else if (inputUser.equals("go w") || inputUser.equals("go west")) {
                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].isCurrentRoom() == true) {

                        if (rooms[i].getWest() == null) {
                            System.out.println("You can not go there");

                        } else {
                            rooms[i].setCurrentRoom(false);
                            currentRoom = i;
                            rooms[i].getWest().setCurrentRoom(true);
                            System.out.println("You are now in " + rooms[i].getWest().getName());
                            break;
                        }
                    }

                }
            } else if (inputUser.equals("go e") || inputUser.equals("go east")) {
                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].isCurrentRoom() == true) {

                        if (rooms[i].getEast() == null) {
                            System.out.println("You can not go there");
                            break;
                        } else {
                            rooms[i].setCurrentRoom(false);
                            currentRoom = i;
                            rooms[i].getEast().setCurrentRoom(true);
                            System.out.println("You are now in " + rooms[i].getEast().getName());
                            break;
                        }
                    }

                }
            } if (inputUser.equals("look")){
                System.out.println("You are now in " + rooms[currentRoom].getEast().getName());
                System.out.println("Items: " + rooms[currentRoom].getEast().getItem());
            } else if
                (inputUser.equals("help")){
                System.out.println("Commands:");
                System.out.println("For controls type 'go east/go north/go south/go west'.");
                System.out.println("Type 'look' - to see what is inside a room.");
                System.out.println("Type 'exit' - to quit the qame.");
            }
            else if (inputUser.equals("exit")){
                break;
            }
        }

    }
}

