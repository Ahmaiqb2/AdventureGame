package AdventureGame;

import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Room direction = new Room("Lampe 1");
        Room lampe2 = new Room("Lampe 2");
        Room lampe3 = new Room("Lampe 3");
        Room lampe4 = new Room("Lampe 4");
        Room lampe5 = new Room("Lampe 5");
        Room selectedDirection = null;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println(direction);
            System.out.println(lampe2);
            System.out.println(lampe3);
            System.out.println(lampe4);
            System.out.println(lampe5);

            System.out.print("\n Hvilken vej vil du? ");
            String lampe = input.nextLine();


            if ( lampe == "go north"){
                selectedDirection = direction;
            } else if (lampe == "go south"){
                selectedDirection = lampe2;
            } else if (lampe == "go west"){
                selectedDirection = lampe3;
            } else if (lampe == "go east"){
                selectedDirection = lampe4;
            }

            selectedDirection.direction();
        }
    }

    public void keyPressed(){


    }
}
