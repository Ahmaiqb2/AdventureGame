package AdventureGame;

public class Weapon {

private String weaponName;
private String weaponDescription;
private int weaponWeight;
private int damage;
private int usesLeft;

public Weapon(String weaponName, int weaponWeight, int damage){
this.weaponName = weaponName;
this.weaponWeight = weaponWeight;
this.damage = damage;
}
public String getWeaponName(){
return weaponName;
}
public int getWeaponWeight(){
return weaponWeight;
}
public String getWeaponDescription(){
return weaponDescription;
}
public int getUsesLeft(){
return usesLeft;
}

}
