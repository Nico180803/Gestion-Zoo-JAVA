package Humain;

import Animal.*;

public final class Visiteur extends Humain{

    public Visiteur(String nom, String prenom, int age) {
        super(nom, prenom, age, "Visiteur");
    }

    public void reagis(Animal animal){
        if (animal instanceof Lion)
            System.out.println ("Les visiteurs applaudisse");
        else if (animal instanceof Oiseau) {
            System.out.println ("Les visiteurs sont stupéfaits");
        }else {
            System.out.println("Les visiteur s'exclament");
        }
    }
}
