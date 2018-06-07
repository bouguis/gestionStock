/**
 * 
 */
package sn.objis.gestionStock.domain;

/**
 * @author diawara
 *
 */
public class Utilisateur {
	//Declaration des attributs
	private long id_Utilisateur;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String login;
	private String password;
	
	//Ajout des constructeurs
	public Utilisateur() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param login
	 * @param password
	 */
	public Utilisateur(String nom, String prenom, String email, String telephone, String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
	}
	
	//Les Getters et Setters

	public long getId_Utilisateur() {
		return id_Utilisateur;
	}

	public void setId_Utilisateur(long id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
