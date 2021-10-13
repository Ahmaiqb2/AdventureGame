package AdventureGame;

public class Enemy {
    private final String enemyName;
    private final String enemyDescription;
    private int enemyHealth;
    private final Room currentRoom;
    private final Weapon enemyWeapon;

    public Enemy(String name, String description, int health, Room currentRoom, Weapon enemyWeapon) {
        this.enemyName = name;
        this.enemyDescription = description;
        this.enemyHealth = health;
        this.currentRoom = currentRoom;
        this.enemyWeapon = enemyWeapon;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void dealDamageToEnemy(int weaponDamage) {
        this.enemyHealth = enemyHealth - weaponDamage;

    }

    public Weapon getWeapon() {
        return enemyWeapon;
    }
}