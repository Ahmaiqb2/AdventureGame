package AdventureGame;

import java.util.Scanner;

public class Adventure {

    public static void adventure() {

        Room currentRoom = Map.createMap();
        Player player = new Player(50,currentRoom);

        System.out.println(Color.purple + """
        Welcome to The Haunted House!!
        
        Are you ready to make your way into the middle of the house?
        Do you even dare?
        Well Good luck!!!
        
        The controls for the game is by typing, 
            n/ go n / go north
            s/ go s / go south
            e/ go e / go east
            w/ go w / go west
            
        If there are need for help, type help!
        
        You start in room 1!
        LET THE GAME BEGIN!!!""");

        label:
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print(Color.yellow + "\nWhat do you want to do? " + "\n");
            String inputUser = input.nextLine().toLowerCase();


            switch (inputUser) {
                case "go n":
                case "go north":
                    player.goNorth();
                    break;

                case "go s":
                case "go south":
                    player.goSouth();
                    break;

                case "go w":
                case "go west":
                    player.goWest();
                    break;

                case "go e":
                case "go east":
                    player.goEast();
                    break;

                case "look":
                case "l":
                    player.look();
                    break;

                case "take":
                    player.take();
                    break;


                case "drop":
                    player.drop();
                    break;


                case "help":
                case "h":
                    Commands.help();
                    break;

                case "exit":
                    Commands.exit();
                    break;

                case "inventory":
                case "inv":
                case "i":
                    player.getInventory();
                    break;

                default:
                    System.out.println(Color.red + """
                            Dont know what that mean, please try again!
                            If u need help, enter: 'help/h'""" + Color.yellow);
                    break;

                case "health":
                    player.health();
                    break;

                case "eat":
                    System.out.println(Color.green + "What do you want to eat?: ");
                    String foodName = input.nextLine();
                    player.eat(foodName);

                    break;

                case "equipments":
                    player.equiment();
                    break;

                case "equip":
                    System.out.println("What do you want to equip?");
                    String equip = input.nextLine();
                    player.equip(equip);
                    break;

                case "attack":
                    System.out.println("Who do you want to attack");
                    String attack = input.nextLine();
                    player.attack(attack);
                    break;
            }
        }
    }
}