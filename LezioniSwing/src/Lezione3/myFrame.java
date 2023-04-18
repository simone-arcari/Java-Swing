package Lezione3;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    /* My components are used only in this Class, so they are private */
    private JTextArea myTextArea;
    private JButton myButton;

    public myFrame() {

        super("Window title");

        /* Components */
        myTextArea = new JTextArea();                            // BOX FOR TEXT
        myButton = new JButton("Clicca il tasto");          // BUTTON FOR GENERAL PURPOSE

        /* Frame settings */
        setSize(960,540);                            // WINDOW DIMENSION IN PIXEL
        setLocationRelativeTo(null);                             // INITIAL WINDOW POSITION TO THE CENTER
        setLayout(new BorderLayout());                           // SET LAYOUT FOR THE FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // DEFAULT BEHAVIOR OF THE WINDOW ON CLOSE BUTTON

        /* Add components */
        add(myTextArea, BorderLayout.CENTER);
        add(myButton, BorderLayout.PAGE_START);

        setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}
