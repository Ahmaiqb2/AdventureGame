package AdventureGame;

public class ShootingWeapon extends Weapon{

public int usesLeft;
public int ammo;

    public ShootingWeapon(String itemName, String itemDescription, int itemWeight, int damage, int usesLeft, int ammo) {
        super(itemName, itemDescription, itemWeight, damage);
        this.usesLeft = usesLeft;
        this.ammo = ammo;

    }

    @Override
    public int getUsesLeft() {
        return usesLeft;
    }
}
