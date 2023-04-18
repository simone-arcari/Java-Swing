package Lezione7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyToolsBar extends JPanel {

    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JButton button4;

    public MyToolsBar() {

        button1 = new JButton("FlowLayout CENTER");
        button2 = new JButton("FlowLayout RIGHT");
        button3 = new JButton("FlowLayout LEFT");
        button4 = new JButton("GridLayout ");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
}
