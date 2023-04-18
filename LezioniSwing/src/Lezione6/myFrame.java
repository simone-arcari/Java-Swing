package Lezione6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame {

    /* My components are used only in this Class, so they are private */
    private MyTextAreaPanel myTextAreaPanel;
    private JTextField myTextField;
    private JButton myButton;

    public myFrame() {

        super("Window title");

        /* Components */
        myTextField = new JTextField();                          // TEXT BAR, YOU CAN WRITE INSIDE
        myTextAreaPanel = new MyTextAreaPanel();                 // TEXT BOX
        myButton = new JButton("Clicca il tasto");          // BUTTON FOR GENERAL PURPOSE

        /* Frame settings */
        setSize(960,540);                            // WINDOW DIMENSION IN PIXEL
        setLocationRelativeTo(null);                             // INITIAL WINDOW POSITION TO THE CENTER
        setLayout(new BorderLayout());                           // SET LAYOUT FOR THE FRAME
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          // DEFAULT BEHAVIOR OF THE WINDOW ON CLOSE BUTTON

        /* Add components */
        add(myTextAreaPanel, BorderLayout.CENTER);
        add(myTextField, BorderLayout.PAGE_START);
        add(myButton, BorderLayout.PAGE_END);

        /* Button settings */
        myButton.addActionListener(new ActionListener() {       // ActionListener() IS AN INTERFACE, IT ISN'T A CLASS
            @Override
            public void actionPerformed(ActionEvent e) {        // THIS IS THE ONLY METHOD FOR ActionListener()

                String textFromTextField = myTextField.getText();                               // TAKE TEXT FROM TEXT BAR AFTER BUTTON ARE CLICKED

                if(!textFromTextField.equals("")) {
                    myTextAreaPanel.appendText("Hai cliccato il tasto: " + textFromTextField + "\n");        // PRINT MESSAGE ON BOX TEXT
                    myTextField.setText("");                                                        // CLEN TEXT BAR
                }
            }
        });

        setVisible(true);                                        // NOW THE WINDOW IS VISIBLE
    }
}
