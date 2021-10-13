package AdventureGame;

public class Map {


    public static Room createMap() {

        Room room1 = new Room("Room 1", true, "Cellar: The room is very tiny and has no light");
        Room room2 = new Room("Room 2", false, "Kitchen: Dusty and bankrupt room with a old white fridge and a small table with some musty food on it ");
        Room room3 = new Room("Room 3", false, "Bedroom: White walls with a TV-screen wired to a Playstation - A laptop laying on a desk  ");
        Room room4 = new Room("Room 4", false, "Boys' room: White walls with paintings of basketball-stars/Open wardrobe with clothes in it ");
        Room room5 = new Room("Room 5", false, "Mysterious room: Open cabinet with keys inside");
        Room room6 = new Room("Room 6", false, "Messy room with an unopened bag of chips and biscuits laying on the floor ");
        Room room7 = new Room("Room 7", false, "Kids room: Big teddybear in the corner and some toys laying next to it");
        Room room8 = new Room("Room 8", false, "xxx");
        Room room9 = new Room("Room 9", false, "xxx");

        room1.setDirections(null, room4, room2, null);
        room2.setDirections(null, null, room3, room1);
        room3.setDirections(null, room6, null, room2);
        room4.setDirections(room1, room7, null, null);
        room5.setDirections(null, room8, null, null);
        room6.setDirections(room3, room9, null, null);
        room7.setDirections(room4, null, room8, null);
        room8.setDirections(room5, null, room9, room7);
        room9.setDirections(room6, null, null, room8);

        Item fridge = new Item("Fridge", "White fridge", 7);
        Item table = new Item("Table", "Small table", 5);
        Item pen = new Item("Pen", "Black pen", 1);
        Item safe = new Item("Safe", "Grey safe made of steel", 3);
        Item laptop = new Item("Laptop", "Asus latop", 2);
        Item TV = new Item("TV", "Samsung TV", 3);
        Item ps3 = new Item("Playstation", "Playstation 3", 3);
        Item basketball = new Item("Basketball", "Dusty basketball", 2);
        Item clothes = new Item("Clothes", "old clothes", 2);
        Item keys = new Item("Keys", "some keys", 1);
        Item chips = new Item("Chips", "Lays sour-cream&onion chips", 1);
        Item biscuits = new Item("Biscuits", "biscuits", 1);
        Item teddybear = new Item("Teddy bear", "Big fat teddy-bear", 2);
        Item toys = new Item("Toys", "Kids toys", 1);
        Item spreadsheet = new Item("Spreadsheet", "blank spreadsheet", 1);

        Weapon razorblade = new meleeWeapon("Razor blade", "Tiny razor blade", 0, 10);
        Weapon fryingpan = new meleeWeapon("Frying pan", "Dark frying pan", 10, 5);
        Weapon baseballbat = new meleeWeapon("Baseball bat", "Beige baseball bat", 10, 10);
        Weapon knife = new meleeWeapon("Knife", "Sharp knife", 3, 20);
        Weapon knuckles = new meleeWeapon("Knuckles", "Silver knuckles", 2, 12);
        Weapon glassbottle = new ShootingWeapon("Glass bottle", "Broken glass bottle", 4, 10, 2);
        Weapon lugerpistol = new ShootingWeapon("Luger pistol", "Dusty luger pistol", 7, 40, 5);

        Weapon hammer = new meleeWeapon("hammer","stor hammer",2,5);

        Item banana = new Food("Banana", "Yellow banana", 2,5);
        Item cola = new Food("Cola", "Coke can", 3,2);

        Enemy DarthVarder = new Enemy("Darth Vardar", "StarWars",20,room1, hammer);

        room1.addItem(fridge);
        room1.addItem(table);
        room2.addItem(pen);
        room2.addItem(safe);
        room3.addItem(laptop);
        room3.addItem(TV);
        room3.addItem(ps3);
        room4.addItem(basketball);
        room4.addItem(clothes);
        room5.addItem(keys);
        room6.addItem(chips);
        room6.addItem(biscuits);
        room7.addItem(teddybear);
        room7.addItem(toys);
        room8.addItem(spreadsheet);

        room1.addItem(banana);
        room2.addItem(cola);

        room1.addItem(razorblade);
        room2.addItem(fryingpan);
        room3.addItem(glassbottle);
        room4.addItem(knuckles);
        room4.addItem(baseballbat);
        room8.addItem(lugerpistol);
        room8.addItem(knife);

        room1.addEnemy(DarthVarder);

        return room1;
    }
}