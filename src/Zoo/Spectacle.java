package Zoo;

import Animal.Animal;
import Humain.Soigneur;
import Humain.Visiteur;

import java.util.ArrayList;

public class Spectacle {

    private String nom;
    private int nbPlace;
    private ArrayList<Animal> animals;
    private Soigneur soigneur;
    private ArrayList<Visiteur> visiteurs;
    private ArrayList<Tour> tours;

    public Spectacle(String nom, int nbPlace, Soigneur soigneur) {
        this.nom = nom;
        this.nbPlace = nbPlace;
        this.soigneur = soigneur;

        this.animals = new ArrayList<Animal>();
        this.visiteurs = new ArrayList<Visiteur>();
        this.tours = new ArrayList<Tour>();
    }

    public void ajouterAnimal(Animal a) {
        if (animals.contains(a)) {
            System.out.println("L'animal est déja présent dans le spectacle.");
        }else{
            animals.add(a);
            System.out.println(a.getNom() + " a bien été ajouté");
        }

    }

    public void ajouterVisiteur(Visiteur v) {
        if (visiteurs.size() == nbPlace) {
            System.out.println("Le spectacle est déjà plein");
        }else{
            if (visiteurs.contains(v)) {
                System.out.println("Le visiteur est déjà dans le spectacle.");
            }else {
                visiteurs.add(v);
                System.out.println(v.getNom()+ " a bien été ajouté");
            }
        }
    }

    public void ajouterTour(Tour t) {
        if (tours.contains(t)) {
            System.out.println("le tour est déjà dans le spectacle.");
        }else {
            tours.add(t);
            System.out.println(t.getNom() + " a bien été ajouté");
        }
    }

    public void prestation(){
        System.out.println("Gérant : "+soigneur.getNom());
        for (Tour t : tours) {
            t.execute();
            for (Visiteur visiteur : visiteurs) {
                visiteur.reagis(t.getAnimal());
            }
            System.out.println();
        }
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
