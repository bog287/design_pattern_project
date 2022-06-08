package Factory;

public class Crossbow implements Weapon{
    @Override
    public void use() {
        System.out.println("Firing arrows using the crossbow.");
    }
}
