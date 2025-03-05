package Zoo;
import Animal.*;
import Humain.*;
import java.util.ArrayList;

public class Zoo {
    private String nom;
    private String adresse;
    private String region;
    private double prixEntre;
    private double solde;
    private int billet;
    private int billetEnfant;

    private ArrayList<Animal> animals;
    private ArrayList<Soigneur> soigneurs;
    private ArrayList<Visiteur> visiteurs;
    private ArrayList<Enclos> enclos;

    public Zoo(String nom, String adresse, String region, double prixEntre) {
        this.nom = nom;
        this.adresse = adresse;
        this.region = region;
        this.prixEntre = prixEntre;

        this.animals = new ArrayList<Animal>();
        this.soigneurs = new ArrayList<Soigneur>();
        this.visiteurs = new ArrayList<Visiteur>();
        this.enclos = new ArrayList<Enclos>();

        this.billet = 0;
        this.billetEnfant = 0;
    }

    public void finJournee(){
        //Calcul du CA de la journée
        for (Visiteur v : visiteurs) {
            if (v.getAge()<16){
                billetEnfant++;
            }else {
                billet++;
            }
        }
        solde += ((prixEntre*0.85)*billetEnfant)+(prixEntre*billet);
        double venteDuJour = ((prixEntre*0.85)*billetEnfant)+(prixEntre*billet);
        System.out.println(billet + " billets Adulte + " + billetEnfant + " billets enfant ont été vendu aujourd'hui pour un total de " + venteDuJour);

        //reset des billets vendus
        billetEnfant = 0;
        billet = 0;

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
        if (animals.contains(a)) {
            System.out.println("L'animal est déja ajouté");
        }
        else {
            animals.add(a);
            System.out.println(a.getNom() + " a bien été ajouté");
        }
    }
    public void ajouterSoigneur(Soigneur s) {
        if (soigneurs.contains(s)) {
            System.out.println("Le soigneur est déja renseigné");
        }
        else {
            soigneurs.add(s);
            System.out.println(s.getNom() + " a bien été ajouté");
        }
    }
    public void ajouterVisiteur(Visiteur v) {
        if (visiteurs.contains(v)) {
            System.out.println("Le visiteur est déja renseigné");
        }
        else {
            visiteurs.add(v);
            System.out.println(v.getNom() + " a bien été ajouté");
        }
    }
    public void ajouterEnclos(Enclos e) {
        if (enclos.contains(e)) {
            System.out.println("L'enclos est déja renseigné");
        }
        else {
            enclos.add(e);
            System.out.println(e + " a bien été ajouté");
        }
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

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
