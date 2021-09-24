package AdventureGame;

import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Rooms direction = new Rooms("Lampe 1");
        Rooms lampe2 = new Rooms("Lampe 2");
        Rooms lampe3 = new Rooms("Lampe 3");
        Rooms lampe4 = new Rooms("Lampe 4");
        Rooms lampe5 = new Rooms("Lampe 5");
        Rooms selectedDirection = null;

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

