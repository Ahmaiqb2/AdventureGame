package AdventureGame;

public class Commands {

    public Commands(){
    }

    public static String look() {
        return look();
    }

    public static String help() {
        String help = "";

        help += "Commands: \n";
        help += " For controls type 'go east/go north/go south/go west'. \n";
        help += " Type 'look' - to get the room description. \n";
        help += " Type 'exit' - to quit the game. \n";

        return help;
    }

    public static void exit() {
        System.exit(0);
    }
}
