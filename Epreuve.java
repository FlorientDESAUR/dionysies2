public class Epreuve {
    private String style;
    private int spectateur;

    public Epreuve(String style, int spectateur) {
        this.style = style;
        this.spectateur = spectateur;
    }
    public int score(int qualite){
        return spectateur*qualite;
    }
}