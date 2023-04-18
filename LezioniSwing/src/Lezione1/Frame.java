/*
*   The Frame Class creat our graphics window
*
*   author: Simone Arcari
*   date: 03/03/2023
*
* */

package Lezione1;

import javax.swing.*;

public class Frame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Window title");

        frame.setSize(960,540);                            // WINDOW DIMENSION IN PIXEL
        //frame.setLocation(100,50);                               // INITIAL WINDOW POSITION IN PIXEL
        frame.setLocationRelativeTo(null);                             // INITIAL WINDOW POSITION TO THE CENTER
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // DEFAULT BEHAVIOR OF THE WINDOW ON CLOSE BUTTON
        frame.setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}
