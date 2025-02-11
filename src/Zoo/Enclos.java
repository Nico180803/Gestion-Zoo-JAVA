package Zoo;

public class Enclos {
    private String nom;
    private int capacite;
    private int sale;

    public Enclos(String nom, int capacite, int sale) {
        this.nom = nom;
        this.capacite = capacite;
        this.sale = sale;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }
}
