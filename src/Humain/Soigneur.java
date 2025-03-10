package Humain;

import Animal.Animal;
import Zoo.Enclos;

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

    public void diagnostiquer(Enclos enclos, Animal animal) {
        if (animal.getMalade()){
            System.out.println(animal.getNom()+ " est déjà malade");
        }else {
            if (enclos.getAnimaux().contains(animal)){
                if (specialite.equals(animal.getEspece())){
                    int chance = 50 + (enclos.getSale()*10);
                    Random r = new Random();
                    if (r.nextInt(100) > chance) {
                        animal.setMalade(true);
                        System.out.println("Le soigneur "+ super.getPrenom()+ " a découvert que l'animal " + animal.getNom() + " de type "+ animal.getEspece() + " est tombé malade.");
                    }else {
                        System.out.println("Le soigneur "+ super.getPrenom()+ " n'a pas découvert de maladie sur l'animal " + animal.getNom() + " de type "+ animal.getEspece() + ".");
                    }
                }else {
                    System.out.println("Le soigneur n'a pas la bonne spécialité");
                }
            }else {
                System.out.println("Il n'y a pas cette animal dans cette enclo");
            }
        }
    }

    public void soigner(Animal animal) {
        if (specialite.equals(animal.getEspece())){
            if (animal.getMalade()) {
                animal.setMalade(false);
                System.out.println("Le soigneur "+ super.getPrenom()+ " a soigné l'animal " + animal.getNom() + " de type "+ animal.getEspece() + " de son mal.");
            }else {
                System.out.println(animal.getNom() + " n'est pas malade");
            }
        }else {
            System.out.println("Le soigneur n'a pas la bonne spécialité");
        }
    }
}
