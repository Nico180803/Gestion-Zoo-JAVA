package Animal;

public final class Serpent extends Animal{

    public Serpent(String nom) {
        super(nom, "Serpent");
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

    @Override
    public String toString() {
        return  super.toString()+", Type = 'Serpent'}";
    }
}
