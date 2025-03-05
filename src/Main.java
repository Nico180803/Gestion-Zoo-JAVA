import Animal.*;
import Humain.Soigneur;
import Humain.Visiteur;
import Zoo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Enclos enclosLions = new Enclos("Enclos des Lions", 10, 0);
        Enclos enclosSerpent = new Enclos("Enclos des Serpents", 10, 0);
        Enclos enclosOiseau = new Enclos("Enclos des Oiseaux", 10, 0);

        Lion wouaf = new Lion("Wouaf");
        Serpent sssss = new Serpent("Ssssss");

        Soigneur jean = new Soigneur("DelaFontaine","Jean", 64, "Serpent");
        Soigneur romain = new Soigneur("Arnold", "Romain", 34, "Lion");

        Visiteur patrick = new Visiteur("Patrick", "Patrick", 32);
        Visiteur elise = new Visiteur("Elise", "Elise", 19);

        Zoo beauval = new Zoo("Beauval", "8 avenu fauch", "Provence");

        Spectacle folie = new Spectacle("Ce lion diabétique va vous étonné !", 2, romain);


        //Test Ajout enclos
        beauval.ajouterEnclos(enclosLions);
        beauval.ajouterEnclos(enclosSerpent);
        beauval.ajouterEnclos(enclosOiseau);

        //Test ajout animal
        beauval.ajouterAnimal(wouaf);
        beauval.ajouterAnimal(sssss);

        //Test ajout animal à enclos
        enclosLions.ajouterAnimal(wouaf);
        enclosSerpent.ajouterAnimal(sssss);

        //Test ajout soigneur
        beauval.ajouterSoigneur(jean);
        beauval.ajouterSoigneur(romain);

        //Test ajout visiteurs
        beauval.ajouterVisiteur(patrick);
        beauval.ajouterVisiteur(elise);

        //Affichage animaux zoo
        System.out.println();
        beauval.listeAnimal();

        //Affichage enclos
        System.out.println();
        beauval.listeEnclos();

        //Affichage soigneurs
        System.out.println();
        beauval.listeSoigneur();

        //Affichage visiteurs
        System.out.println();
        beauval.listeVisiteur();

        System.out.println();

        //Test spectacle



        beauval.finJournee();
    }
}