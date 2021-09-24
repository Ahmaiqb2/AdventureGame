package AdventureGame;

import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Room north = new Room("north");
        Room south = new Room("south");
        Room east = new Room("east");
        Room west = new Room("west");

        Room selectedDirection = null;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println(north);
            System.out.println(south);
            System.out.println(east);
            System.out.println(west);

            System.out.print("\n Hvilken vej vil du? ");
            String lampe = input.nextLine();


            if ( lampe == "go north"){
                selectedDirection = north;
            } else if (lampe == "go south"){
                selectedDirection = south;
            } else if (lampe == "go west"){
                selectedDirection = east;
            } else if (lampe == "go east"){
                selectedDirection = lampe4;
            }

            selectedDirection.direction();
        }
    }

    public void keyPressed(){


    }
}
