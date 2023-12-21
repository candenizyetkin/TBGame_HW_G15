package BusinessLayer;

import java.util.Random;

public abstract class Weapon {
    private int WeaponAttack;

    public void Weapon() {
        Random random = new Random();
        WeaponAttack = random.nextInt(11)+10;
    }

    public int getWeaponAttack() {
        return WeaponAttack;
    }
}
