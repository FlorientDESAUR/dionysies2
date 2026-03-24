package tournoi;

public class Journée {
    private Epreuve epreuveMatin;
    private Epreuve epreuveMidi;
    private Epreuve epreuveSoir;

    public Journée(Epreuve epreuveMatin, Epreuve epreuveMidi, Epreuve epreuveSoir) {
        this.epreuveMatin = epreuveMatin;
        this.epreuveMidi = epreuveMidi;
        this.epreuveSoir = epreuveSoir;
    }

    public int scoreJournee(){
        return epreuveMatin+epreuveMidi+epreuveSoir;
    }
}

