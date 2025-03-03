package Humain;

import Animal.Animal;

import java.util.Random;

public final class Soigneur extends Humain {

    private String specialite;
    private boolean occupe = false;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    public Soigneur(String nom, String prenom, int age, String specialite) {
        super(nom, prenom, age, "Soigneur");
        this.specialite = specialite;
    }

    public void diagnostiquer(Animal animal) {
        if (specialite.equals(animal.getEspece())){
            Random r = new Random();
            if (r.nextInt(2) == 0) {
                animal.setMalade(true);
                System.out.println("Le soigneur "+ super.getNom()+ " a découvert que l'animal " + animal.getNom() + " de type "+ animal.getEspece() + " est tombé malade.");
            }
        }else {
            System.out.println("Le soigneur n'a pas la bonne spécialité");
        }
    }

    public void soigner(Animal animal) {
        if (specialite.equals(animal.getEspece())){
            if (animal.getMalade()) {
                animal.setMalade(false);
                System.out.println("Le soigneur "+ super.getNom()+ " a soigné l'animal " + animal.getNom() + " de type "+ animal.getEspece() + " de son mal.");
            }
        }else {
            System.out.println("Le soigneur n'a pas la bonne spécialité");
        }
    }
}
