package Factory;

public class WeaponFactory {
    Weapon createWeapon(String weaponCode){
        if (weaponCode.equals("Gun")) {
            return new Gun();
        } else if (weaponCode.equals("Crossbow")) {
            return new Crossbow();
        }else {
            return null;
        }
    }
}
