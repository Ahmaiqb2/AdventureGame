package AdventureGame;

public class Commands {

    private static Room[] rooms;

    public Commands(){
    }

    public static void look() {
        int currentRoom = 0;
        System.out.println("Description of room: " + rooms[currentRoom].getRoomDescription() + "\n");
        for (Item item : rooms[currentRoom].getItemsListe()) {
            System.out.println(item.getItemName() + "\n");
        }
    }

    public static void help() {

        System.out.println("""
               
                Commands:
                    For controls type 'go east/go north/go south/go west'.
                    Type 'look' - to get the room description.
                    Type 'take' - to pick up an item.
                    Type 'drop' - to drop up an item.
                    Type 'inventory - to see your inventory.
                    Type 'exit' - to quit the game.
                """);
    }

    public static void exit() {
        System.out.println("Qutting game");
        System.exit(0);
    }
}
