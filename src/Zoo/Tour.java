package Zoo;

import Animal.Animal;

public class Tour {

    private String nom;
    private Animal animal;

    public Tour(String nom, Animal animal) {
        this.nom = nom;
        this.animal = animal;
    }

    public void execute(){
        System.out.println("Voici le tour " + nom + "de " + animal.getNom() + ".");
        animal.bruit();
        System.out.println(animal.getNom()+ " fait un backflip.");
    }

    public String getNom() {
        return nom;
    }

    public Animal getAnimal() {
        return animal;
    }
}
