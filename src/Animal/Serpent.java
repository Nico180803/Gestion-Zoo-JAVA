package Animal;

public final class Serpent extends Animal{

    public Serpent(String nom) {
        super(nom);
    }

    public void bruit() {
        System.out.println(getNom()+" : SSSSSSSSSSSSSSSSSSSSSSSS");
    }

    public void bouger() {
        System.out.println(getNom()+" : Rampe");
    }

    public void manger() {
        System.out.println(getNom()+" : Gobe");
    }
}
