import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame{
    
    private JTextArea textArea;
    private JScrollPane scrollPane;
    
    public myFrame(String titleString) {

        super(titleString);
        
        // Creazione della finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300); // Imposta le dimensioni della finestra
        this.setLayout(new BorderLayout()); // Imposta il layout della finestra

        // Creazione della JTextArea
        textArea = new JTextArea();
        textArea.setEditable(false); // Imposta la JTextArea come non modificabile
        scrollPane = new JScrollPane(textArea); // Aggiunge uno scrollPane alla JTextArea

        // Aggiunge la JTextArea al centro della finestra
        this.add(scrollPane, BorderLayout.CENTER);

        // Aggiunge del testo di esempio alla JTextArea
        textArea.append("Benvenuto!\n");

        // Rendi la finestra visibile
        this.setVisible(true);
    }

    public void append(String str) {
        this.textArea.append(str);
    }
}
