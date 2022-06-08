package Factory;

public class Gun implements Weapon{
    @Override
    public void use() {
        System.out.println("Shooting using the gun.");
    }
}
