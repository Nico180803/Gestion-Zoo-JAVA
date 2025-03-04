package Zoo;

import Animal.Animal;
import Humain.Soigneur;

import java.util.ArrayList;

public class Enclos {
    private String nom;
    private int capacite;
    private int sale;
    ArrayList<Animal> animaux;

    public Enclos(String nom, int capacite, int sale) {
        this.nom = nom;
        this.capacite = capacite;
        this.sale = sale;
        this.animaux = new ArrayList<Animal>();
    }

    public void salePlus(){
        sale += 1;
    }

    public void ajouterAnimal(Animal animal) {
        if (capacite == 0) {
            System.out.println("L'Enclos est Plein !");
        }else{
            this.animaux.add(animal);
            this.capacite--;
            System.out.println(animal.getNom()+" est mis dans l'enclos "+this.getNom()+"\nIl reste "+this.getCapacite()+" place dans l'enclo "+this.getNom());
        }
    }

    public void nettoyage(Soigneur soigneur) {
        System.out.println(soigneur.getNom()+" nettoie l'enclos "+this.getNom());
        this.sale = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Enclos{" +
                "nom ='" + nom + '\'' +
                ", capacite =" + capacite +
                ", sale =" + sale +
                ", animaux =" + animaux +
                '}';
    }
}
