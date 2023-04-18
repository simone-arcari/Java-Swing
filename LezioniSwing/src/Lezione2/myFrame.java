package Lezione2;

import javax.swing.*;

public class myFrame extends JFrame {

    public myFrame() {

        super("Window title");

        setSize(960,540);                            // WINDOW DIMENSION IN PIXEL
        //setLocation(100,50);                               // INITIAL WINDOW POSITION IN PIXEL
        setLocationRelativeTo(null);                             // INITIAL WINDOW POSITION TO THE CENTER
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // DEFAULT BEHAVIOR OF THE WINDOW ON CLOSE BUTTON
        setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}
