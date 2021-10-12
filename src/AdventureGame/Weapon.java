package AdventureGame;

public class Weapon extends Item {

    private String weaponName;
    private String weaponDescription;
    private int weaponWeight;
    private int damage;
    private int usesLeft;

    public Weapon(String itemName, String itemDescription, int itemWeight, int damage) {
        super(itemName, itemDescription, itemWeight);
        this.damage = damage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getDamage(){
        return damage;
    }

    public int getWeaponWeight() {
        return weaponWeight;
    }

    public String getWeaponDescription() {
        return weaponDescription;
    }

    public int getUsesLeft() {
        return usesLeft;
    }

}
