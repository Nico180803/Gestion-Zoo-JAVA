package Animal;

public final class Oiseau extends Animal{

    public Oiseau(String nom) {
        super(nom);
    }

    public void bruit() {
        System.out.println(getNom()+" : CUIT CUIT ");
    }

    public void bouger() {
        System.out.println(getNom()+" : Vol ");
    }

    public void manger() {
        System.out.println(getNom()+" : Picore ");
    }
}
