package Lezione7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame {

    /* My components are used only in this Class, so they are private */
    private MyTextAreaPanel myTextAreaPanel;
    private MyToolsBar barraStrumenti;
    private JButton myButton;

    private String messageTextToolBarLayout;

    public myFrame() {

        super("Window title");

        messageTextToolBarLayout = "FlowLayout LEFT";

        /* Components */
        myTextAreaPanel = new MyTextAreaPanel();                 // TEXT BOX
        myButton = new JButton("Clicca per sapere il Layout della Tool Bar");          // BUTTON FOR GENERAL PURPOSE
        barraStrumenti = new MyToolsBar();

        /* Frame settings */
        setSize(960,540);                            // WINDOW DIMENSION IN PIXEL
        setLocationRelativeTo(null);                             // INITIAL WINDOW POSITION TO THE CENTER
        setLayout(new BorderLayout());                           // SET LAYOUT FOR THE FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // DEFAULT BEHAVIOR OF THE WINDOW ON CLOSE BUTTON

        /* Add components */
        add(myTextAreaPanel, BorderLayout.CENTER);
        add(myButton, BorderLayout.PAGE_END);
        add(barraStrumenti, BorderLayout.PAGE_START);

        /* Button settings */
        myButton.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                myTextAreaPanel.appendText("ToolBar: " + messageTextToolBarLayout + "\n");        // PRINT MESSAGE ON BOX TEXT

            }
        });

        /* Tool Bar Button settings */
        barraStrumenti.button1.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                barraStrumenti.setLayout(new FlowLayout(FlowLayout.CENTER));
                messageTextToolBarLayout = "FlowLayout CENTER";
                setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
            }
        });

        /* Tool Bar Button settings */
        barraStrumenti.button2.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                barraStrumenti.setLayout(new FlowLayout(FlowLayout.RIGHT));
                messageTextToolBarLayout = "FlowLayout RIGHT";
                setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
            }
        });

        /* Tool Bar Button settings */
        barraStrumenti.button3.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                barraStrumenti.setLayout(new FlowLayout(FlowLayout.LEFT));
                messageTextToolBarLayout = "FlowLayout LEFT";
                setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
            }
        });

        /* Tool Bar Button settings */
        barraStrumenti.button4.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                barraStrumenti.setLayout(new GridLayout(4,1));
                messageTextToolBarLayout = "GridLayout";

                setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
            }
        });

        setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}
