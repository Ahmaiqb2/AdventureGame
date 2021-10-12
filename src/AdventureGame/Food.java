package AdventureGame;

public class Food extends Item {

    private int foodWeight;
    private int healing;

    public Food(String itemName, String itemDescription, int itemWeight, int healing) {
        super(itemName, itemDescription, itemWeight);
        this.healing = healing;
        this.foodWeight = foodWeight;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public int getFoodWeight() {
        return foodWeight;
    }


}