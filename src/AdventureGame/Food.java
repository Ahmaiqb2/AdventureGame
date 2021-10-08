package AdventureGame;

public class Food {

    private String foodName;
    private String foodDescription;
    private int foodWeight;

    public Food(String foodName, int foodWeight){
        this.foodName = foodName;
        this.foodWeight = foodWeight;
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