package Tournaments.Gui;

import javax.swing.JFrame;

public class MainGUI {

    private JFrame frame;
    private int width;
    private int height;

    public MainGUI(int w, int h) {
        frame = new JFrame();
        width = w;
        height = h;
    }

    public void setUpGUI() {
        frame.setSize(width,height);
        frame.setTitle("Fighting Tournament");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
