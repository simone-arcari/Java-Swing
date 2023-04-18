package Lezione8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    /* My components are used only in this Class, so they are private */
    private ToolBar myToolBar;
    private FileBar myFileBar;
    private TextPanel myTextPanel;
    private Console myConsole;

    public Frame() {

        super("Ambiente di Programmazione");

        /* Components */
        myToolBar = new ToolBar();
        myTextPanel = new TextPanel();
        myFileBar = new FileBar(myTextPanel);
        //myConsole = new Console();



        /* Frame settings */
        setSize(1920,1080);                          // WINDOW DIMENSION IN PIXEL
        setLocationRelativeTo(null);                             // INITIAL WINDOW POSITION TO THE CENTER
        setLayout(new BorderLayout());                           // SET LAYOUT FOR THE FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // DEFAULT BEHAVIOR OF THE WINDOW ON CLOSE BUTTON



        /* Add components */
        add(myToolBar, BorderLayout.PAGE_START);
        add(myFileBar, BorderLayout.WEST);
        add(myTextPanel, BorderLayout.CENTER);
        //add(myConsole, BorderLayout.SOUTH);


        myToolBar.button2.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                //Console.write("[CONSOLE] -> file salvato correttamente\n");

                setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
            }
        });


        setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}
