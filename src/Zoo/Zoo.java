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

    public Zoo(String nom, String adresse, String region) {
        this.nom = nom;
        this.adresse = adresse;
        this.region = region;
        this.animals = new ArrayList<Animal>();
        this.soigneurs = new ArrayList<Soigneur>();
        this.visiteurs = new ArrayList<Visiteur>();
    }

}
