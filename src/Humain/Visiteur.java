package Humain;

import Animal.*;

public final class Visiteur extends Humain{

    public Visiteur(String nom, String prenom, int age) {
        super(nom, prenom, age, "Visiteur");
    }

    public void reagis(Animal animal){
        if (animal instanceof Lion)
            System.out.println (getNom()+" applaudit");
        else if (animal instanceof Oiseau) {
            System.out.println (getNom()+" est stupéfait");
        }else {
            System.out.println(getNom()+" s'exclame !");
        }
    }
}
