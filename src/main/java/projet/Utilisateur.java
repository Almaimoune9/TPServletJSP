package projet;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String pseudo;
	private String email;
	private String motdepass;
	public Utilisateur(String nom, String prenom, String pseudo, String email, String motdepass) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.email = email;
		this.motdepass = motdepass;
	}
	public Utilisateur() {
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotdepass() {
		return motdepass;
	}
	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
	}
	

}
