package AdventureGame;

import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {
        Room[] rooms = new Room[9];
        Player player = new Player();
        int currentRoom = 0;

        Item fridge = new Item("Fridge", "White fridge");
        Item table = new Item("Table", "Small table");
        Item pen = new Item("Pen", "Black pen");
        Item safe = new Item("Safe", "Grey safe made of steel");
        Item laptop = new Item("Laptop", "Asus latop");
        Item TV = new Item("TV", "Samsung TV");
        Item ps3 = new Item("Playstation", "Playstation 3");
        Item basketball = new Item("Basketball", "Dusty basketball");
        Item clothes = new Item("Clothes", "old clothes");
        Item keys = new Item("Keys", "some keys");
        Item chips = new Item("Chips", "Lays sour-cream&onion chips");
        Item biscuits = new Item("Biscuits", "biscuits");
        Item teddybear = new Item("Teddy bear", "Big fat teddy-bear");
        Item toys = new Item("Toys", "Kids toys");
        Item spreadsheet = new Item("Spreadsheet", "blank spreadsheet");
        /*
        room1Liste.add(fridge);
        room1Liste.add(table);
        room2Liste.add(pen);
        room2Liste.add(safe);
        room3Liste.add(laptop);
        room3Liste.add(TV);
        room3Liste.add(ps3);
        room4Liste.add(basketball);
        room4Liste.add(clothes);
        room5Liste.add(keys);
        room6Liste.add(chips);
        room6Liste.add(biscuits);
        room7Liste.add(teddybear);
        room7Liste.add(toys);
        room8Liste.add(spreadsheet);
     */


        System.out.println("Welcome to the Adventure Game");

        Room room1 = new Room("Room 1", true, "Cellar: The room is very tiny and has no light");
        Room room2 = new Room("Room 2", false, "Kitchen: Dusty and bankrupt room with a old white fridge and a small table with some musty food on it ");
        Room room3 = new Room("Room 3", false, "Bedroom: White walls with a TV-screen wired to a Playstation - A laptop laying on a desk  ");
        Room room4 = new Room("Room 4", false, "Boys' room: White walls with paintings of basketball-stars/Open wardrobe with clothes in it ");
        Room room5 = new Room("Room 5", false, "Mysterious room: Open cabinet with keys inside");
        Room room6 = new Room("Room 6", false, "Messy room with an unopened bag of chips and biscuits laying on the floor ");
        Room room7 = new Room("Room 7", false, "Kids room: Big teddybear in the corner and some toys laying next to it");
        Room room8 = new Room("Room 8", false, "xxx");
        Room room9 = new Room("Room 9", false, "xxx");

        room1.addItem(fridge);
        room1.addItem(table);
        room2.addItem(pen);
        room2.addItem(safe);
        room3.addItem(laptop);
        room3.addItem(TV);
        room3.addItem(ps3);
        room4.addItem(basketball);
        room4.addItem(clothes);
        room5.addItem(keys);
        room6.addItem(chips);
        room6.addItem(biscuits);
        room7.addItem(teddybear);
        room7.addItem(toys);
        room8.addItem(spreadsheet);


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

        label:
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("What do you want to do?: " + "\n");
            String inputUser = input.nextLine();


            switch (inputUser) {
                case "go n":
                case "go north":

                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {
                            if (rooms[i].getNorth() == null) {
                                System.out.println("You can not go there");
                            } else {
                                System.out.println("Going north");
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getNorth().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getNorth().getName() + "\n");

                            }
                            break;
                        }

                    }
                    break;
                case "go s":
                case "go south":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {

                            if (rooms[i].getSouth() == null) {
                                System.out.println("You can not go there");

                            } else {
                                System.out.println("Going south");
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getSouth().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getSouth().getName() + "\n");
                            }
                            break;
                        }

                    }
                    break;
                case "go w":
                case "go west":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {

                            if (rooms[i].getWest() == null) {
                                System.out.println("You can not go there");

                            } else {
                                System.out.println("Going west");
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getWest().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getWest().getName() + "\n");
                                break;
                            }
                        }

                    }
                    break;
                case "go e":
                case "go east":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {

                            if (rooms[i].getEast() == null) {
                                System.out.println("You can not go there");
                            } else {
                                System.out.println("Going east");
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getEast().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getEast().getName() + "\n");
                            }
                            break;
                        }

                    }
                    break;

                case "look":
                case "l":
                    System.out.println("Description of room: " + rooms[currentRoom].getRoomDescription() + "\n");
                    for (Item item : rooms[currentRoom].getItemsListe()) {
                        System.out.println(item.getItemName() + "\n");
                    }
                    break;

                case "take":
                    System.out.println("Which item do you want to pick up?: ");
                    String itemInput = input.nextLine();
                    for (Item item : rooms[currentRoom].getItemsListe()) {
                        if (itemInput.equalsIgnoreCase(item.getItemName())) {
                            player.addToInventory(item);
                            System.out.println("You have selected this item " + item.getItemName() + "\n");
                        }
                        break;
                    }
                    break;


                case "drop":
                    System.out.println("Which item do you want to drop?: ");
                    String itemRemoveInput = input.nextLine();
                    for (Item item : rooms[currentRoom].getItemsListe()) {
                        if (itemRemoveInput.equalsIgnoreCase(item.getItemName())) {
                            player.removeFromInventory(item);
                            System.out.println("You have dropped this item " + item.getItemName() + "\n");
                        }
                        break;
                    }
                    break;


                case "help":
                case "h":
                    Commands.help();
                    break;

                case "exit":
                    Commands.exit();
                    break;

                case "inventory":
                case "i":
                    player.getInventory();
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("""
                            Dont know what that mean, please try again!
                            If u need help, enter: help!
                            """);
                    break;
            }
        }
    }

}
/*
package AdventureGame;
        import java.util.Scanner;
public class Adventure {
    public static void main(String[] args) {
        Room[] rooms = new Room[9];
        int currentRoom = 0;
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
        label:
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Where do you wanna go?: ");
            String inputUser = input.nextLine();
            switch (inputUser) {
                case "go n":
                case "go north":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {
                            if (rooms[i].getNorth() == null) {
                                System.out.println("You can not go there");
                            } else {
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getNorth().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getNorth().getName());
                            }
                            break;
                        }
                    }
                    break;
                case "go s":
                case "go south":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {
                            if (rooms[i].getSouth() == null) {
                                System.out.println("You can not go there");
                            } else {
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getSouth().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getSouth().getName());
                            }
                            break;
                        }
                    }
                    break;
                case "go w":
                case "go west":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {
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
                    break;
                case "go e":
                case "go east":
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i].isCurrentRoom()) {
                            if (rooms[i].getEast() == null) {
                                System.out.println("You can not go there");
                            } else {
                                rooms[i].setCurrentRoom(false);
                                currentRoom = i;
                                rooms[i].getEast().setCurrentRoom(true);
                                System.out.println("You are now in " + rooms[i].getEast().getName());
                            }
                            break;
                        }
                    }
                    break;
            }
            switch (inputUser) {
                case "look":
                    System.out.println("You are now in " + rooms[currentRoom].getName());
                    System.out.println("Items: " + rooms[currentRoom].getItem());
                    break;
                case "help":
                    System.out.println("Commands:");
                    System.out.println("For controls type 'go east/go north/go south/go west'.");
                    System.out.println("Type 'look' - to see what is inside a room.");
                    System.out.println("Type 'exit' - to quit the game.");
                    break;
                case "exit":
                    break label;
            }
        }
    }
}*/