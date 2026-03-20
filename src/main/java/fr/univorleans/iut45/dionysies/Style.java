package fr.univorleans.iut45.dionysies;

public enum Style {
    COMÉDIE,
    TRAGÉDIE,
    DRAME;

    public String toString() {
	if (this == COMÉDIE)
	    return "Comédie";
	else if (this == TRAGÉDIE)
	    return "Tragédie";
	else {
	    assert this == DRAME;
	    return "Drame";
	}
    }
}
