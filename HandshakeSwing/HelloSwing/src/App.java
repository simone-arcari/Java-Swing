import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        myFrame frame = new myFrame("Handshake");
        
        Perona persona1 = new Perona("Mario", "Rossi");
        Perona persona2 = new Perona("Luigi", "Perrone", "Embedded Engineer");
        Perona persona3 = new Perona("Francesco", "Lucarelli", "Java Developer");
        Perona persona4 = new Perona("Silvia", "Cipitelli", "Project Manager");

        ArrayList<Perona> persone = new ArrayList<>();

        int n = 0;
        int totHandshake = 0;

        persone.add(persona1);
        persone.add(persona2);
        persone.add(persona3);
        persone.add(persona4);

        n = persone.size();
        totHandshake = n*(n-1)/2;
        System.out.println("totHandshake: " + totHandshake);


        handShake(persone, frame);
    }

    public static void handShake(ArrayList<Perona> persone, myFrame frame) {
        Perona p1;
        Perona p2;

        int handshakeCounter = 1;

        System.out.println(persone.size());

        for(int i=0; i<persone.size(); i++) {
            p1 = persone.get(i);
            
            for(int j=i+1; j<persone.size(); j++) {
                p2 = persone.get(j);

                
                frame.append("Saluto numero: " + handshakeCounter + "\n");
                frame.append(p1.saluta(p2, false));
                frame.append(p2.saluta(p1, false));

                handshakeCounter++;

            }

        }

    }
}
