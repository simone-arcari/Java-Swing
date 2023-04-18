package Lezione7;

import javax.swing.*;
import java.awt.*;

public class MyTextAreaPanel extends JPanel {
    /* JPanel is a container, which can contains other components */

    private JTextArea myTextArea;

    public MyTextAreaPanel() {
        myTextArea = new JTextArea();                            // BOX FOR TEXT

        setLayout(new BorderLayout());                           // LAYOUT SETTINGS FOR myTextAreaPanel CLASS

        add(new JScrollPane(myTextArea), BorderLayout.CENTER);

    }

    public void appendText(String text)
    {
        myTextArea.append(text);
    }

}
