import Tournaments.Damage;
import Tournaments.Gui.MainGUI;
import Tournaments.Healer;
import Tournaments.Tank;

void main() {

    MainGUI gui = new MainGUI(800,400);
    gui.setUpGUI();

    Damage Yohi = new Damage(20, 100, "Yohi");
    Healer Mona = new Healer(5, 85, "Mona");
    Tank Torro = new Tank(15,125,"Torro");

}
