package Zoo;

import Animal.Animal;
import Humain.Soigneur;
import Humain.Visiteur;

import java.util.ArrayList;

public class Spectacle {

    private String nom;
    private int nbPlace;
    private ArrayList<Animal> animals;
    private ArrayList<Soigneur> soigneurs;
    private ArrayList<Visiteur> visiteurs;
    public Spectacle(String nom, int nbPlace) {
        this.nom = nom;
        this.nbPlace = nbPlace;
        this.animals = new ArrayList<Animal>();
        this.soigneurs = new ArrayList<Soigneur>();
        this.visiteurs = new ArrayList<Visiteur>();
    }

    public void prestation(){

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
