package Animal;

public final class Oiseau extends Animal{

    public Oiseau(String nom) {
        super(nom, "Oiseau");
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

    @Override
    public String toString() {
        return  super.toString()+", Type = 'Oiseau'}";
    }
}
