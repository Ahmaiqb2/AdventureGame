package AdventureGame;

import java.util.Scanner;

public class Map {

    public Room room1, room2, room3, room4, room5, room6, room7, room8, room9;

    public static void createMap() {
    }
}
        /*Room room1 = new Room("Room 1", true, "There is a fridge and a table");
        Room room2 = new Room("Room 2", false, "There is a table with a pen and a safe");
        Room room3 = new Room("Room 3", false, "There is a laptop, and a TV-screen connected to a Playstation 3");
        Room room4 = new Room("Room 4", false, "There is a basketball, and some clothes");
        Room room5 = new Room("Room 5", false, "There is some keys");
        Room room6 = new Room("Room 6", false, "Theres is a table with some chips, and biscuits");
        Room room7 = new Room("Room 7", false, "There is a teddy bear and some toys");
        Room room8 = new Room("Room 8", false, "There is a table with a spreadsheet on it");
        Room room9 = new Room("Room 9", false, "There is xx");

        // Room1
        room1.setEast(room2);
        room1.setSouth(room4);

        // Room 2
        room2.setEast(room3);
        room2.setWest(room1);

        // Room 3
        room3.setWest(room2);
        room3.setSouth(room6);

        // Room 4
        room4.setNorth(room1);
        room4.setSouth(room7);

        // Room 5
        room5.setSouth(room8);

        // Room 6
        room6.setNorth(room3);
        room6.setSouth(room9);

        // Room 7
        room7.setNorth(room4);
        room7.setEast(room8);

        // Room 8
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);

        // Room 9
        room9.setNorth(room6);
        room9.setWest(room8);

    }

    public Room getStarterRoom() {
        return room1;
    }
}


        /*Room room1 = new Room("Room 1", "Velkommen til det første rum");
        Room room2 = new Room("Room 2", "isbane");
        Room room3 = new Room("Room 3", "ørkenrum");
        Room room4 = new Room("Room 4", "drømmeverden");
        Room room5 = new Room("Room 5", "helved");
        Room room6 = new Room("Room 6", "himlen");
        Room room7 = new Room("Room 7", "død");
        Room room8 = new Room("Room 8", "livet");
        Room room9 = new Room("Room 9", "yessir");
        // Room1
        room1.setEast(room2);
        room1.setSouth(room4);
        // Room 2
        room2.setEast(room3);
        room2.setWest(room1);
        // Room 3
        room3.setWest(room2);
        room3.setSouth(room6);
        // Room 4
        room4.setNorth(room1);
        room4.setSouth(room7);
        // Room 5
        room5.setSouth(room8);
        // Room 6
        room6.setNorth(room3);
        room6.setSouth(room9);
        // Room 7
        room7.setNorth(room4);
        room7.setEast(room8);
        // Room 8
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);
        // Room 9
        room9.setNorth(room6);
        room9.setWest(room8);
    }
    public void gameplay(){
        Player player = new Player();
        Commands commands = new Commands();
        player.playerLocation(currentRoom);
        Scanner inputUser = new Scanner(System.in);
        String input = inputUser.nextLine();
        while(true){
            if (input.equals(player.waysToGo(input))){
                createMap();
            } else if (input.equals("look")){
                Commands.look(currentRoom);
            } else if (input.equals("help")){
                commands.help();
            } else {
                commands.exit();
            }
        }
    }
}*/