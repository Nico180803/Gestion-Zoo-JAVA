package Animal;

public abstract class Animal {
    private String nom;
    private Boolean malade;

    public Animal(String nom) {
        this.nom = nom;
        this.malade = false;
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
}
