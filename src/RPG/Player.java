package RPG;

abstract class Player implements Attack {
    private String name;
    private int hp;
    private int damage;

    public Player(int damage, int hp, String name) {
        this.damage = damage;
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
