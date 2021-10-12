package AdventureGame;

public class meleeWeapon extends Weapon{
public int damage;

    public meleeWeapon(String itemName, String itemDescription, int itemWeight, int damage) {
        super(itemName, itemDescription, itemWeight);
        this.damage = damage;
    }
}
