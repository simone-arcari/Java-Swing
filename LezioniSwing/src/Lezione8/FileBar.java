package Lezione8;

import javax.swing.*;
import java.awt.*;

public class FileBar extends JDesktopPane {

    private JTextField filename1;
    private JTextField filename2;
    private JTextField filename3;
    private JTextField filename4;
    private JTextField filename5;
    private JTextField filename6;
    private JTextField filename7;
    private JTextField filename8;
    private JTextField filename9;
    private JTextField filename10;
    private JTextField filename11;
    private JTextField filename12;
    private JTextField filename13;
    private JTextField filename14;
    private JTextField filename15;
    private JTextField filename16;
    private JTextField filename17;
    private JTextField filename18;
    private JTextField filename19;
    private JTextField filename20;

    private String currentFilePrinted;



    FileBar(TextPanel codePanel) {
        filename1 = new JTextField("esercizio1.java\t\t");
        filename2 = new JTextField("esercizio2.java");
        filename3 = new JTextField("esercizio3.java");
        filename4 = new JTextField("esercizio4.java");
        filename5 = new JTextField("esercizio5.java");
        filename6 = new JTextField("esercizio6.java");
        filename7 = new JTextField("esercizio7.java");
        filename8 = new JTextField("esercizio8.java");
        filename9 = new JTextField("esercizio9.java");
        filename10 = new JTextField("esercizio10.java");
        filename11 = new JTextField("esercizio11.java");
        filename12 = new JTextField("esercizio12.java");
        filename13 = new JTextField("esercizio13.java");
        filename14 = new JTextField("esercizio14.java");
        filename15 = new JTextField("esercizio15.java");
        filename16 = new JTextField("esercizio16.java");
        filename17 = new JTextField("esercizio17.java");
        filename18 = new JTextField("esercizio18.java");
        filename19 = new JTextField("esercizio19.java");
        filename20 = new JTextField("esercizio20.java");

        currentFilePrinted = "empty";


        filename1.setEditable(false);                                       // impostiamo il testo come non modificabile


        setLayout(new GridLayout(20,2));

        add(filename1);
        add(filename2);
        add(filename3);
        add(filename4);
        add(filename5);
        add(filename6);
        add(filename7);
        add(filename8);
        add(filename9);
        add(filename10);
        add(filename11);
        add(filename12);
        add(filename13);
        add(filename14);
        add(filename15);
        add(filename16);
        add(filename17);
        add(filename18);
        add(filename19);
        add(filename20);


        filename1.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {

                if(!currentFilePrinted.equals("esercizio1.java")) {

                    codePanel.write("fxdxfhxfdhdsh");
                    currentFilePrinted = "esercizio1.java";
                }
            }
        });
    }
}
