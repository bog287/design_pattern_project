package Factory;

public class DemoFactoryPattern {
    public static void main(String[] args) {
        //Create a weapon gun using the weapon factory
        Weapon weapon = new WeaponFactory().createWeapon("Crossbow");

        //Use the weapon
        weapon.use();
    }
}
