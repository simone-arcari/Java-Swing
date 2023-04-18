package Lezione9;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GestoreFinestre implements WindowListener {

    public JWindow finestra;
    private JTextArea t = new JTextArea();



    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.finestra.add(t);
        t.setText("mi hai attivato!!!");

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    public void setFinestra(JWindow finestra) {
        this.finestra = finestra;
    }
}
