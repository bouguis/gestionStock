/**
 * 
 */
package sn.objis.gestionStock.domain;

/**
 * @author diawara
 *
 */
public class Categorie {
	
	//Déclaration attributs
	private long idCategorie;
	private String libelle;
	
	
	//Constructeurs
	/**
	 *Constructeur sans parametre 
	 */
	public Categorie() {
		super();
	}


	/**
	 * @param idCategorie
	 * @param libelle
	 */
	public Categorie(long idCategorie, String libelle) {
		super();
		this.idCategorie = idCategorie;
		this.libelle = libelle;
	}
	
	
	//Getters and Sertter


	/**
	 * @return
	 */
	public long getIdCategorie() {
		return idCategorie;
	}


	/**
	 * @param idCategorie
	 */
	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}


	/**
	 * @return
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	

}
