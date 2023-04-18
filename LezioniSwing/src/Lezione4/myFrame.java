package Lezione4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        /* Button settings */
        myButton.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                myTextArea.append("Hai cliccato il tasto: \n");     // PRINT MESSAGE ON BOX TEXT
            }
        });

        setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}
