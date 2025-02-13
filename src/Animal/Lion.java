package Animal;

public final class Lion extends Animal{

    public Lion(String nom) {
        super(nom);
    }

    public void bruit() {
        System.out.println(getNom()+" : ROARRRRRRRR");
    }

    public void bouger() {
        System.out.println(getNom()+" : Marche");
    }

    public void manger() {
        System.out.println(getNom()+" : Dévore");
    }

    @Override
    public String toString() {
        return  super.toString()+", Type = 'Lion'}";
    }
}
