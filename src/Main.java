import Animal.*;
import Zoo.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Lion wouaf = new Lion("Wouaf");
        Serpent sssss = new Serpent("Ssssss");

        Zoo beauval = new Zoo("Beauval", "8 avenu fauch", "Provence");

        beauval.ajouterAnimal(wouaf);
        beauval.ajouterAnimal(sssss);

        beauval.listeAnimal();
    }
}