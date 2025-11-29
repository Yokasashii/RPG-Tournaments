package Tournaments;

public class Damage extends Player {
    public Damage(int damage, int hp, String name) {
        super(damage, hp, name);
    }

    @Override
    public void hit(int criticalChance, int criticalDamage, Player cible) {

    }

    @Override
    public void special(int criticalChance, int criticalDamage, int heal, int shield, Player cible) {

    }
}
