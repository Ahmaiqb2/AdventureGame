package AdventureGame;

public class Food extends Item {

    private final int healing;

    public Food(String itemName, String itemDescription, int itemWeight, int healing) {
        super(itemName, itemDescription, itemWeight);
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }

}