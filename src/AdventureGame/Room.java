package AdventureGame;

public class Room {
    private boolean toggle;
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public Room() {
        this.toggle = false;
    }

    public void direction() {
        this.toggle = !toggle;
    }

    @Override
    public String toString() {
        if (toggle == true) {
            return name + " er tændt";
        } else {
            return name + " er slukket";
        }
    }
}
