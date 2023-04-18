package Lezione9;


import Lezione6.MyTextAreaPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    /* My components are used only in this Class, so they are private */

    private JPanel panel;
    private JButton button1;
    private JButton button2;
    public JWindow window1;
    private GestoreFinestre gestore1;
    public JWindow window2;
    private GestoreFinestre gestore2;

    public Frame() {

        super("Esempio finestre pop-up");

        /* Components */
        button1 = new JButton("attiva finestra 1");          // BUTTON FOR GENERAL
        button2 = new JButton("attiva finestra 2");
        window1 = new JWindow();
        gestore1 = new GestoreFinestre();
        window2 = new JWindow();
        gestore2 = new GestoreFinestre();

        /* gestore settings */
        gestore1.setFinestra(window1);
        gestore2.setFinestra(window2);

        /* Frame settings */
        setSize(960, 540);                            // WINDOW DIMENSION IN PIXEL
        setLocationRelativeTo(null);                             // INITIAL WINDOW POSITION TO THE CENTER
        setLayout(new BorderLayout());                           // SET LAYOUT FOR THE FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // DEFAULT BEHAVIOR OF THE WINDOW ON CLOSE BUTTON


        /* Add components */
        add(button1, BorderLayout.PAGE_END);
        add(button2, BorderLayout.PAGE_START);
        addWindowListener(gestore1);                               // Listener pop-up window1
        addWindowListener(gestore2);                               // Listener pop-up window2

        /* Button settings */
        button1.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                window1.setSize(300, 300);
                window1.setLocation(1920-300,500);
                window1.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                window2.setSize(300, 300);
                window2.setLocation(0,500);
                window2.setVisible(true);
            }
        });




        setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}

