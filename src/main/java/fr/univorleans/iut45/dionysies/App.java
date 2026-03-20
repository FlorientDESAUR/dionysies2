package fr.univorleans.iut45.dionysies;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Bienvenu.e.s aux Dionysies!
 *
 */



public class App 
{
    static String cheminRessources = "src/main/resources/";
    public static String lireCitation(String chemin)  
    {
        String citation = "";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(chemin));
            String ligne = br.readLine();
            while (ligne != null) {
                citation += ligne +"\n";
                ligne = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Le fichier "+chemin+" n'existe pas");

        } catch (Exception e){

        }
        return citation;
        
    }
    public static void main( String[] args )
    {
        String citation_antigone = App.lireCitation(cheminRessources+"antigone.txt");
        String citation_limiers = lireCitation(cheminRessources+"limiers.txt");

        Auteur sophocle = new Auteur(
            "Sophocle", 
            95, 
            citation_antigone, 
            0, 
            "", 
            60, 
            citation_limiers);

        String citation_hécube = lireCitation(cheminRessources+"hecube.txt");
        String citation_cyclope = lireCitation(cheminRessources+"cyclope.txt");

        Auteur euripide = new Auteur("Euripide", 92, citation_hécube, 0, "", 80, citation_cyclope);

        String citation_guêpes =
            "TRYGÉE : Tiens, voilà quelqu'un qui s'amène avec une couronne de lauriers sur la tête.\n"
                + "LE SERVITEUR : Qui ça peut-il être ?\n"
                + "TRYGÉE : Il a une tête de charlatan.\n"
                + "LE SERVITEUR : Un devin peut-être ?";

        String citation_thesmophories =
            "La fortune a vite fait de changer en mal et de régner sous une autre face.";

        Auteur aristophane = new Auteur("Aristophane", 5, citation_thesmophories, 100, citation_guêpes, 0, "");

        System.out.println("Bienvenu.e.s aux Dionysies!!");

        System.out.println(aristophane);
        System.out.println(euripide);
        System.out.println(sophocle);

    }

    
}



