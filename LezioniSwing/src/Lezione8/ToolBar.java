package Lezione8;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {


    private JPanel box1;
    private JPanel box2;
    private JPanel box3;
    public JButton button1;
    public JButton button2;
    public JButton button3;

    ToolBar() {

        box1 = new JPanel();
        box2 = new JPanel();
        box3 = new JPanel();

        button1 = new JButton("Nuovo File");
        button2 = new JButton("Salva");
        button3 = new JButton("Rinomina");

        setLayout(new GridLayout(1,3));

        add(box1);
        add(box2);
        add(box3);

        box1.add(button1);
        box2.add(button2);
        box3.add(button3);
    }
}
