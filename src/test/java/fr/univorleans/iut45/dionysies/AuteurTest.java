package fr.univorleans.iut45.dionysies;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AuteurTest {
    String citation_antigone = App.lireCitation(App.cheminRessources+"antigone.txt");
    String citation_limiers = App.lireCitation(App.cheminRessources+"limiers.txt");

    Auteur initSophocole(){
        return new Auteur("Sophocle", 95, citation_antigone, 0, "", 60, citation_limiers);
    }

    @Test
    public void testPointFort() {
        Auteur sophocle = initSophocole();
        assertEquals(Style.TRAGÉDIE,sophocle.pointFort());
    }

    @Test
    public void testCitationStyle() {
        Auteur sophocle = initSophocole();
        System.out.println(citation_antigone);
        assertEquals(citation_antigone,sophocle.citationStyle(Style.TRAGÉDIE));
        assertEquals(citation_limiers,sophocle.citationStyle(Style.DRAME));
        assertEquals("", sophocle.citationStyle(Style.COMÉDIE));
    }

    @Test
    public void testNiveauStyle() {
        Auteur sophocle = initSophocole();
        assertEquals(95,sophocle.niveauStyle(Style.TRAGÉDIE));
        assertEquals(0,sophocle.niveauStyle(Style.COMÉDIE));
        assertEquals(60,sophocle.niveauStyle(Style.DRAME));
    }

    
}
