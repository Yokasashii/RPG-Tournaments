package Tournaments;

public interface Attack {
    public void hit(int criticalChance, int criticalDamage, Player cible);
    public  void special(int criticalChance, int criticalDamage, int heal, int shield,Player cible);
}
