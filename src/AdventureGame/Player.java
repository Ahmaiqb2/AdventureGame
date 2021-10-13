package AdventureGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    public Room currentRoom;
    private final ArrayList<Item> inventory = new ArrayList<>();
    private final ArrayList<Weapon> equippedWeapons = new ArrayList<>();
    public int health;
    private Weapon currentWeapon;
    Scanner input = new Scanner(System.in);


    public Player(int health, Room currentRoom) {
        this.health = health;
        this.currentRoom = currentRoom;
    }

    public void take() {
        System.out.println("Which item do you want to pick up?: ");
        String itemInput = input.nextLine();
        for (Item item : currentRoom.getItemsListe()) {
            if (itemInput.equalsIgnoreCase(item.getItemName())) {
                addToInventory(item);
                currentRoom.getItemsListe().remove(item);
                System.out.println(Color.blue + "You have selected this item " + item.getItemName() + Color.yellow);
                break;
            }
        }
    }

    public void drop() {
        System.out.println("Which item do you want to drop?: ");
        String removeInput = input.nextLine();
        for (Item item : getInventoryy()) {
            if (removeInput.equalsIgnoreCase(item.getItemName())) {
                removeFromInventory(item);
                currentRoom.addItem(item);
                System.out.println(Color.red + "You have dropped this item " + item.getItemName() + Color.yellow);
            }
            break;
        }
    }

    public void health() {
        String healthText = "Health: ";
        String lowHealthText = "You are in low health, eat something to gain health!";
        String mediumHealthText = "You are in good health, but avoid fighting right now!";
        String highHealthText = "You are in high health!";

        if (getHealth() <= 10) {
            System.out.println(Color.red + healthText + getHealth() + " - " + lowHealthText + Color.yellow);
        } else if (getHealth() < 40) {
            System.out.println(Color.blue + healthText + getHealth() + " - " + mediumHealthText + Color.yellow);
        } else {
            System.out.println(Color.green + getHealth() + " - " + highHealthText + Color.yellow);
        }
    }

    public void look() {
        System.out.println(Color.blue + "Description of room: " + currentRoom.getRoomDescription());
        System.out.println("\n Items in the room: ");
        for (Item item : currentRoom.getItemsListe()) {
            System.out.println(" -" + item.getItemName());
        }
        System.out.println("");
        for (Enemy enemy : currentRoom.getEnemyListe()) {
            System.out.println(Color.red + "Enemies in the room: ");
            System.out.println(" -" + enemy.getEnemyName() + Color.yellow);
        }
    }

    public ArrayList<Weapon> getEquippedWeapons() {
        return equippedWeapons;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void goNorth() {
        if (currentRoom.getNorth() == null) {
            System.out.println(Color.red + "You cannot go there!" + Color.yellow);
        } else {
            System.out.println(Color.green + "Going north" + Color.yellow);
            setCurrentRoom(currentRoom.getNorth());
            System.out.println(Color.green + currentRoom.getName() + "\n" + currentRoom.getRoomDescription() + Color.yellow);
        }
    }

    public void goSouth() {
        if (currentRoom.getSouth() == null) {
            System.out.println(Color.red + "You cannot go there!" + Color.yellow);
        } else {
            System.out.println(Color.green + "Going south" + Color.yellow);
            setCurrentRoom(currentRoom.getSouth());
            System.out.println(Color.green + currentRoom.getName() + "\n" + currentRoom.getRoomDescription() + Color.yellow);
        }
    }

    public void goEast() {
        if (currentRoom.getEast() == null) {
            System.out.println(Color.red + "You cannot go there!" + Color.yellow);
        } else {
            System.out.println(Color.green + "Going east" + Color.yellow);
            setCurrentRoom(currentRoom.getEast());
            System.out.println(Color.green + currentRoom.getName() + "\n" + currentRoom.getRoomDescription() + Color.yellow);
        }
    }

    public void goWest() {
        if (currentRoom.getWest() == null) {
            System.out.println(Color.red + "You cannot go there!" + Color.yellow);
        } else {
            System.out.println(Color.green + "Going west" + Color.yellow);
            setCurrentRoom(currentRoom.getWest());
            System.out.println(Color.green + currentRoom.getName() + "\n" + currentRoom.getRoomDescription() + Color.yellow);
        }
    }

    public int getHealth() {
        return health;
    }

    public void getInventory() {
        if (inventory.isEmpty()) {
            System.out.println(Color.red + "Items: N/A" + Color.yellow);
        } else {
            System.out.println(Color.blue + "Your backpack contains: ");
            for (Item item : inventory) {
                System.out.println(" " + item.getItemName());
            }
        }
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public ArrayList<Item> getInventoryy() {
        return inventory;
    }

    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

    public void eat(String foodName) {
        Food food = findFood(foodName);
        if (food == null) {
            System.out.println(Color.red + "you have nothing to eat" + Color.yellow);
        } else {
            health += food.getHealing();
            System.out.println(Color.green + "You have eaten: " + foodName + Color.yellow);
            System.out.println(Color.green + "And gained: " + food.getHealing() + " - health" + Color.yellow);

        }
    }

    public Food findFood(String foodName) {

        for (Item item : getInventoryy()) {
            if (item instanceof Food) {
                return (Food) item;
            }
        }
        return null;
    }

    private Weapon findWeapon(String equipment) {
        for (Item item : getInventoryy()) {
            {
                if (item instanceof Weapon) {
                    return (Weapon) item;
                }
            }
        }
        return null;

    }


    public void equip(String weaponName){
        Weapon requestedWeapon = findWeapon(weaponName);
        if (requestedWeapon == null){
            System.out.println(Color.red + "You dont have any weapons in your inventory!" + Color.yellow);
        } else {
            currentWeapon = requestedWeapon;
            System.out.println(Color.green + "You have equipped: " + requestedWeapon.getItemName() + Color.yellow);
        }
    }

    public void equiment() {
        if (currentWeapon == null) {
            System.out.println(Color.red + "You dont have anything on" + Color.yellow);
        } else {

            for (Item currentWeapon : getEquippedWeapons()) {
                System.out.println(Color.green + "Your equipments: " + currentWeapon.getItemName() + Color.yellow);
            }
        }
    }

    public void enemyAttack(int damage) {
        health = health - damage;
    }

    public void attack(String enemies) {
        Enemy enemy = findEnemy(enemies);
        if (enemy == null){
            System.out.println(Color.blue + "There is no enemies in the room" + Color.yellow);
        } else {
            if (currentWeapon == null){
                System.out.println(Color.blue + "You cannot attack without a weapon" + Color.yellow);
            } else if (currentWeapon instanceof ShootingWeapon){
                if (((ShootingWeapon) currentWeapon).getUsesLeft() > 0){
                    System.out.println("You fired a shot");
                    ((ShootingWeapon) currentWeapon).setUsesLeft(((ShootingWeapon)currentWeapon).getUsesLeft() -1);
                } else {
                    System.out.println(Color.red + "Out of ammo" + Color.yellow);
                }
            } else {
                System.out.println("You attack the enemy");
                enemy.damageToEnemy(getCurrentWeapon().getDamage());
                System.out.println("Enemy hp: " + enemy.getEnemyHealth());
                if (enemy.getEnemyHealth() <= 0){
                    System.out.println("The enemy is dead");
                    currentRoom.getEnemyListe().remove(enemy);
                } else {
                    System.out.println("The enemy attack you");
                    enemyAttack(enemy.getWeapon().getDamage());
                    System.out.println("Hp: " + health);
                    if (health <= 0){
                        System.out.println(Color.red + "You died!" + Color.yellow);
                    }
                }
            }
        }
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    private Enemy findEnemy(String enemies) {
        for (Enemy enemy : currentRoom.getEnemyListe()) {
            return enemy;
        }
        return null;
    }

}





