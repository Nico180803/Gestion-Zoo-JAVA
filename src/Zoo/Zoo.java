package Zoo;
import Animal.*;
import Humain.*;
import java.util.ArrayList;

public class Zoo {
    private String nom;
    private String adresse;
    private String region;

    private ArrayList<Animal> animals;
    private ArrayList<Soigneur> soigneurs;
    private ArrayList<Visiteur> visiteurs;
    private ArrayList<Enclos> enclos;

    public Zoo(String nom, String adresse, String region) {
        this.nom = nom;
        this.adresse = adresse;
        this.region = region;
        this.animals = new ArrayList<Animal>();
        this.soigneurs = new ArrayList<Soigneur>();
        this.visiteurs = new ArrayList<Visiteur>();
        this.enclos = new ArrayList<Enclos>();
    }

    public void finJournee(){
        //Augmentation saleté
        enclos.forEach((e)->{
            e.salePlus();
        });

        //SOIGNEURS LIBERE
        soigneurs.forEach((s)->{
            s.setOccupe(false);
        });
    }

    //AJOUTS PARAMETRES

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
    public void ajouterEnclos(Enclos e) {
        enclos.add(e);
        System.out.println(e + " a bien été ajouté");
    }

    //SUPRESSION PARAMETRES

    public void supprimerAnimal(Animal a) {
        animals.remove(a);
        System.out.println(a + " a bien été supprimé");
    }

    public void supprimerSoigneur(Soigneur s) {
        soigneurs.remove(s);
        System.out.println(s + " a bien été supprimé");
    }

    public void supprimerVisiteur(Visiteur v) {
        visiteurs.remove(v);
        System.out.println(v + " a bien été supprimé");
    }

    public void supprimerEnclos(Enclos e) {
        enclos.remove(e);
        System.out.println(e + " a bien été supprimé");
    }

    //LISTES PARAMETRES

    public void listeAnimal() {
        for (Animal a : animals) {
            System.out.println(a.toString());
        }
    }
    public void listeSoigneur() {
        for (Soigneur s : soigneurs) {
            System.out.println(s.toString());
        }
    }
    public void listeVisiteur() {
        for (Visiteur v : visiteurs) {
            System.out.println(v.toString());
        }
    }
    public void listeEnclos() {
        for (Enclos e : enclos) {
            System.out.println(e.toString());
        }
    }
    
    //GETTER ET SETTER

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
