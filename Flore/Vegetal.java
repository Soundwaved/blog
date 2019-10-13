package Flore;

public abstract class Vegetal {
	private Etat etat;
	private String dessin[];

	public Vegetal() {
		this.etat = Etat.GRAINE;

		dessin = new String[6];
		dessin[0] = "_";
		dessin[1] = ".";
		dessin[2] = "|";
		dessin[5] = "#";

	}

	public String[] getDessin() {
		return dessin;
	}

	public void setDessin(String feuille, String fleur) {
		this.dessin[3] = feuille ;
		this.dessin[4] = fleur ;
	}
	
	
}
