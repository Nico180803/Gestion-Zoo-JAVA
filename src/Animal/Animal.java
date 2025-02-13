package Animal;

public abstract class Animal {
    private String nom;


    public Animal(String nom) {
        this.nom = nom;
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
}
