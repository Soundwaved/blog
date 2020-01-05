package description;

import java.sql.Date;

public class Description {
	
	private String auteur;
	private String titre;
	private String description;
	private String texte;
	private Date   date;
	private int id;
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId());
        sb.append(" - ");
        sb.append(getAuteur());
        sb.append(" - ");
        sb.append(getTitre());
        sb.append(" - ");
        sb.append(getDescription());
        sb.append(" - ");
        sb.append(getTexte());
        sb.append(" - ");
        sb.append(getDate());
        return sb.toString();
    }

}

