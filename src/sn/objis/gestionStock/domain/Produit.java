/**
 * 
 */
package sn.objis.gestionStock.domain;

import java.util.List;

/**
 * @author diawara
 *
 */
public class Produit {
	//Déclaration des attributs
	private long idProduit;
	private String reference;
	private String designation;
	private double qte_Stock;
	private double limite;
	private double prix_U_Achat_HT;
	private double prix_U_Vente_TTC;
	private double tva;
	private Categorie idCategorie;
	private Fournisseur idFournisseur;
	private List<Categorie> categorie;
	private List<Fournisseur> fournisseur;
	
	
	//Les Constructeurs
	
	/**
	 *Constructeur sans parametre 
	 */
	public Produit() {
		super();
	}


	/**
	 * @param idProduit
	 * @param reference
	 * @param designation
	 * @param qte_Stock
	 * @param limite
	 * @param prix_U_Achat_HT
	 * @param prix_U_Vente_TTC
	 * @param tva
	 * @param categorie
	 * @param fournisseur
	 */
	public Produit(long idProduit, String reference, String designation, double qte_Stock, double limite,
			double prix_U_Achat_HT, double prix_U_Vente_TTC, double tva, List<Categorie> categorie,
			List<Fournisseur> fournisseur) {
		super();
		this.idProduit = idProduit;
		this.reference = reference;
		this.designation = designation;
		this.qte_Stock = qte_Stock;
		this.limite = limite;
		this.prix_U_Achat_HT = prix_U_Achat_HT;
		this.prix_U_Vente_TTC = prix_U_Vente_TTC;
		this.tva = tva;
		this.categorie = categorie;
		this.fournisseur = fournisseur;
	}
	
	//Les Getteurs et les Setters
	


	public long getIdProduit() {
		return idProduit;
	}


	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getQte_Stock() {
		return qte_Stock;
	}


	public void setQte_Stock(double qte_Stock) {
		this.qte_Stock = qte_Stock;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public double getPrix_U_Achat_HT() {
		return prix_U_Achat_HT;
	}


	public void setPrix_U_Achat_HT(double prix_U_Achat_HT) {
		this.prix_U_Achat_HT = prix_U_Achat_HT;
	}


	public double getPrix_U_Vente_TTC() {
		return prix_U_Vente_TTC;
	}


	public void setPrix_U_Vente_TTC(double prix_U_Vente_TTC) {
		this.prix_U_Vente_TTC = prix_U_Vente_TTC;
	}


	public double getTva() {
		return tva;
	}


	public void setTva(double tva) {
		this.tva = tva;
	}


	public Categorie getIdCategorie() {
		return idCategorie;
	}


	public void setIdCategorie(Categorie idCategorie) {
		this.idCategorie = idCategorie;
	}


	public Fournisseur getIdFournisseur() {
		return idFournisseur;
	}


	public void setIdFournisseur(Fournisseur idFournisseur) {
		this.idFournisseur = idFournisseur;
	}


	public List<Categorie> getCategorie() {
		return categorie;
	}


	public void setCategorie(List<Categorie> categorie) {
		this.categorie = categorie;
	}


	public List<Fournisseur> getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(List<Fournisseur> fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	
	
	

}
