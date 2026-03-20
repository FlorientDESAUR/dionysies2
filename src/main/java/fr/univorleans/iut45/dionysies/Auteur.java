package fr.univorleans.iut45.dionysies;

public class Auteur {
    String nom;
    int niveauTragedie;
    String citation_tragedie;
    int niveauComedie;
    String citationComedie; 
    int niveauDrame;
    String citationDrame;

    public Auteur(
        String nom,
        int niveauTragedie, 
        String citation_tragedie, 
        int niveauComedie, 
        String citationComedie, 
        int niveauDrame,
        String citationDrame){
            this.nom = nom;
            this.niveauTragedie = niveauTragedie;
            this.citation_tragedie = citation_tragedie;
            this.niveauComedie = niveauComedie;
            this.citationComedie = citationComedie;
            this.niveauDrame = niveauDrame;
            this.citationDrame = citationDrame;
    }

    public int getNiveauTragedie(){
        return this.niveauTragedie;
    }

    public int getNiveauComedie(){
        return this.niveauComedie;
    }

    public int getNiveauDrame(){
        return this.niveauDrame;
    }

    public String getCitationTragedie(){
        return this.citation_tragedie;
    }

    public String getCitationComedie(){
        return this.citationComedie;
    }

    public String getCitationDrame(){
        return this.citationDrame;
    }

    /**
     * renvoie le style qui est le point fort de l'auteur
     * @return Style res
     */
    public Style pointFort(){
        Style res = Style.TRAGÉDIE;
        if(this.niveauComedie > this.niveauTragedie){
            if(this.niveauDrame > this.niveauComedie){
                res = Style.DRAME;
            } else {
                res = Style.COMÉDIE;
            }
        } else if (this.niveauDrame > this.niveauTragedie){
            res = Style.DRAME;
        }
        return res;
    }

    /**
     * renvoie le niveau de l'auteur pour un style donné
     * @param s
     * @return
     */
    public int niveauStyle(Style s){
         //TODO
        return -1;
    }

    /**
     * renvoie la citation que l'auteur utilise pour un style donné
     * @param s
     * @return
     */
    public String citationStyle(Style s){
        //TODO
        return null;
    }

    @Override
    public String toString(){
        return "L'honorable "+this.nom;
    }
}
