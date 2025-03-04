package Zoo;

import Animal.Animal;
import Humain.Soigneur;
import Humain.Visiteur;

import java.util.ArrayList;

public class Spectacle {

    private String nom;
    private int nbPlace;
    private int soigneurGerant;
    private ArrayList<Animal> animals;
    private ArrayList<Soigneur> soigneurs;
    private ArrayList<Visiteur> visiteurs;
    public Spectacle(String nom, int nbPlace, int soigneurGerant) {
        this.nom = nom;
        this.nbPlace = nbPlace;
        this.soigneurGerant = soigneurGerant;

        this.animals = new ArrayList<Animal>();
        this.soigneurs = new ArrayList<Soigneur>();
        this.visiteurs = new ArrayList<Visiteur>();
    }
    public void ajouterAnimal(Animal a) {
        animals.add(a);
        System.out.println(a.getNom() + " a bien été ajouté");
    }
    public void ajouterSoigneur(Soigneur s) {
        soigneurs.add(s);
        System.out.println(s.getNom() + " a bien été ajouté");
    }
    public void ajouterVisiteur(Visiteur v) {
        visiteurs.add(v);
        System.out.println(v.getNom()+ " a bien été ajouté");
    }
    public void prestation(String nomTour, int animal){
        System.out.println("Gérant : "+soigneurs.get(this.soigneurGerant));
        System.out.println("Bonjour à tous, aujourd'hui je vais vous presentez le tour intituler : "+nomTour+" réaliser par : "+animals.get(animal));
        System.out.println(animals.get(animal)+" réalise son tour");
        System.out.println();
        animals.get(animal).bruit();
        visiteurs.get(0).reagis(animals.get(animal));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }
}
