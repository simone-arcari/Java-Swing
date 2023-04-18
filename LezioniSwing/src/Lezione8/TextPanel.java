package Lezione8;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private static TextArea myTextarea;

    TextPanel() {
        myTextarea = new TextArea();

        setLayout(new BorderLayout());

        add(myTextarea, BorderLayout.CENTER);
    }

    public void disableEditing() {
        myTextarea.setEditable(false);
    }

    public static void write(String text) {
        myTextarea.append(text);
    }
}
