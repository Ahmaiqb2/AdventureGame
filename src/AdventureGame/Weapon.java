package AdventureGame;

public class Weapon extends Item {

    private final int damage;

    public Weapon(String itemName, String itemDescription, int itemWeight, int damage) {
        super(itemName, itemDescription, itemWeight);
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }


}
