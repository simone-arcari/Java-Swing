public class Perona {
    String nome;
    String cognome;
    String lavoro;

    Perona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.lavoro = "Disoccupato";
    }

    Perona(String nome, String cognome, String lavoro) {
        this.nome = nome;
        this.cognome = cognome;
        this.lavoro = lavoro;
    }

    public String saluta(Perona p, boolean printFlag) {
        String str = "Ciao " + p.nome + " " + p.cognome + ", sono " + this.nome + " " + this.cognome + "\n";
        
        if(printFlag) {
            System.out.println(str);

        }

        return str;
    }
}
