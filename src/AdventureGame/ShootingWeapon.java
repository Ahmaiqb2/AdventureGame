package AdventureGame;

public class ShootingWeapon extends Weapon{

public int usesLeft;

    public ShootingWeapon(String itemName, String itemDescription, int itemWeight, int damage, int usesLeft) {
        super(itemName, itemDescription, itemWeight, damage);
        this.usesLeft = usesLeft;

    }

    public void setUsesLeft(int usesLeft) {
        this.usesLeft = usesLeft;
    }

    public int getUsesLeft() {
        return usesLeft;
    }
}
