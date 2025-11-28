import RPG.Damage;
import RPG.Healer;
import RPG.Tank;

void main() {
    Damage Yohi = new Damage(20, 100, "Yohi");
    Healer Mona = new Healer(5, 85, "Mona");
    Tank Torro = new Tank(15,125,"Torro");

    Yohi.hit(25, Yohi.getDamage(), Mona);
}
