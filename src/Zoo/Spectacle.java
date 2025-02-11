package Zoo;

public class Spectacle {

    private String nom;
    private int nbPlace;

    public Spectacle(String nom, int nbPlace) {
        this.nom = nom;
        this.nbPlace = nbPlace;
    }

    public void prestation(){

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }
}
