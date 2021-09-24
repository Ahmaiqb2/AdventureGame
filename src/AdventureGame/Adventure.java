package AdventureGame;

import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Where do you wanna go?: ");
        String inputUser = input.nextLine();
        switch (inputUser) {
            case "go north", "go n" -> System.out.println("go north");
            case "go south", "go s" -> System.out.println("go south");
            case "go east", "go e" -> System.out.println("go east");
            case "go west", "go w" -> System.out.println("go west");

        }



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
