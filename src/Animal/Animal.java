package Animal;

public abstract class Animal {
    private String nom;
    private Boolean malade;
    private String espece;

    public Animal(String nom, String espece) {
        this.nom = nom;
        this.malade = false;
        this.espece = espece;
    }

    public abstract void bruit();

    public abstract void bouger();

    public abstract void manger();

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom ='" + nom + '\'';
    }

    public Boolean getMalade() {
        return malade;
    }

    public void setMalade(Boolean malade) {
        this.malade = malade;
    }

    public String getEspece() {
        return espece;
    }
}
