package AdventureGame;

import AdventureGame.Room;

public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int enemyHealth;
    private int enemyDamage;
    private Room currentRoom;
    private Weapon enemyWeapon;

    public Enemy(String name, String description, int health, int damage, Room currentRoom) {
        this.enemyName = name;
        this.enemyDescription = description;
        this.enemyHealth = health;
        this.enemyDamage = damage;
        this.currentRoom = currentRoom;
        this.enemyWeapon = enemyWeapon;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public String getEnemyDescription() {
        return enemyDescription;
    }

    public void dealDamageToEnemy(int weaponDamage) {
        this.enemyHealth = enemyHealth - weaponDamage;

    }

    public Weapon getWeapon() {
        return enemyWeapon;
    }
}