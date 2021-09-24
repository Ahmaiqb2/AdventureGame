package AdventureGame;

public class Rooms {
    private boolean toggle;
    private String name;

    public Rooms(String name) {
        this.name = name;
    }

    public Rooms() {
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
