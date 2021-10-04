package AdventureGame;

public class Commands {

    public Commands(){
    }

    public static String look() {
        return look();
    }

    public static String help() {
        String help = "";

        System.out.println("Commands: \n");
        System.out.println(" For controls type 'go east/go north/go south/go west'. \n");
        System.out.println(" Type 'look' - to get the room description. \n");
        System.out.println(" Type 'take' - to pick up an item. \n");
        System.out.println(" Type 'drop' - to drop up an item. \n");
        System.out.println(" Type 'inventory - to see your inventory. \n");
        System.out.println(" Type 'help - to see commands available. \n");
        System.out.println(" Type 'exit' - to quit the game. \n");

        return help;
    }

    public static void exit() {
        System.exit(0);
    }
}
