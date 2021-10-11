package AdventureGame;

public class Food extends Item {

    private String foodName;
    private String foodDescription;
    private int foodWeight;

    public Food(String itemName, String itemDescription, int itemWeight) {
        super(itemName, itemDescription, itemWeight);
    }


    public String getFoodName() {
        return foodName;
    }

    public int getFoodWeight() {
        return foodWeight;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

}