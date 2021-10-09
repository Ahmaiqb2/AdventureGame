package AdventureGame;

public class ShootingWeapon extends Weapon{

public int usesLeft;

    public ShootingWeapon(String weaponName, int weaponWeight, int damage, int usesLeft) {
        super(weaponName, weaponWeight, damage);
        this.usesLeft = usesLeft;
    }

    @Override
    public int getUsesLeft() {
        return usesLeft;
    }
}
