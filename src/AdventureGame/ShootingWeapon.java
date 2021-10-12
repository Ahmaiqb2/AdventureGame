package AdventureGame;

public class ShootingWeapon extends Weapon{

public int usesLeft;
public int damage;

    public ShootingWeapon(String itemName, String itemDescription, int itemWeight, int damage, int usesLeft) {
        super(itemName, itemDescription, itemWeight);
        this.usesLeft = usesLeft;
        this.damage = damage;
    }

    @Override
    public int getUsesLeft() {
        return usesLeft;
    }
}
