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

        //Room room1;
        //Room room2;
        //Room room3;
        /*Room room4;
        Room room5;
        Room room6;
        Room room7;
        Room room8;
        Room room9;
        */
        /*null, room4, room2, null,
                null, null, room3, room1, false,
                null, room6, null, room2,
                room1, room7, null, null,
                null, room8, null, null,
                room3, room9, null, null,

                room4, null, room8, null

        room5, null, room9, room7
        room6, null, null, room8,*/


        Room room1 = new Room("Room 1", true, new String[]{"There is a fridge", "There is a table"});
        Room room2 = new Room("Room 2", false, new String[]{"There is a table with a pen and a safe"});
        Room room3 = new Room("Room 3", false, new String[]{"There is a laptop, and a TV-screen connected to a Playstation 3"});
        Room room4 = new Room("Room 4", false, new String[]{"There is a basketball, and some clothes"});
        Room room5 = new Room("Room 5", false, new String[]{"There is some keys"});
        Room room6 = new Room("Room 6", false, new String[]{"Theres is a table with some chips, and biscuits"});
        Room room7 = new Room("Room 7", false, new String[]{"There is a teddy bear and some toys"});
        Room room8 = new Room("Room 8", false, new String[]{"There is a table with a spreadsheet on it"});
        Room room9 = new Room("Room 9", false, new String[]{"There is xx"});


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

            System.out.println(inputUser);
            if (inputUser.equals("go n") || inputUser.equals("go north")) {
                System.out.println("Going north");


                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].isCurrentRoom() == true) {
                        if (rooms[i].getNorth() == null) {
                            System.out.println("You can not go there");
                            break;
                        } else {
                            System.out.println(rooms[i].getNorth());
                            rooms[i].setCurrentRoom(false);
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
                            rooms[i].getEast().setCurrentRoom(true);
                            System.out.println("You are now in " + rooms[i].getEast().getName());
                            break;
                        }
                    }

                }
            } else if (inputUser.equals("look")) {
                System.out.println();
            }
        }
        /*switch (inputUser) {
            case "look" -> room1.look();
            case "go north", "go n" -> System.out.println("Going north");
            case "go south", "go s" -> System.out.println("Going south");
            case "go east", "go e" -> System.out.println("Going east");
            case "go west", "go w" -> System.out.println("Going west");
        }*/


        /*Room north = new Room("north");
        Room south = new Room("south");
        Room east = new Room("east");
        Room west = new Room("west");

        Room currentRoom = null;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println(north);
            System.out.println(south);
            System.out.println(east);
            System.out.println(west);

            System.out.print("\n Hvilken vej vil du vælge at gå? ");
            String lampe = input.nextLine();


            if ( lampe == "go north"){
                currentRoom = north;
            } else if (lampe == "go south"){
                currentRoom = south;
            } else if (lampe == "go west"){
                currentRoom = east;
            } else if (lampe == "go east"){
                currentRoom = west;
            }

            currentRoom.direction();
        }*/
    }
}

