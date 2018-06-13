/**
 * 
 */
package sn.objis.gestionStock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.gestionStock.domain.Categorie;

/**
 * @author diawara
 *
 */
public class IDaoCategorieImpl implements IDaoCategorie {
	
	private Connection con;
	

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.dao.IDao#ajouter(java.lang.Object)
	 */
	public IDaoCategorieImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public void ajouter(Categorie t) {
		
		try {
			//Preparation de la requete
			String sql ="INSERT INTO Categorie (Libelle_Categorie) VALUES (?)";
			PreparedStatement pst =con.prepareStatement(sql);
			//Transmission des valeurs
			pst.setString(1,t.getLibelle());
			//Execution de la requete
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.dao.IDao#findAll()
	 */
	@Override
	public List<Categorie> findAll() {
		List<Categorie>listeCategories = new ArrayList<>();
		Categorie cat = null;
		try {
			
			//Preparation de la requete
			String sql="SELECT * FROM Categorie";
			Statement st = con.createStatement();
			//Execution de la requete
			ResultSet rs = st.executeQuery(sql);
			//Traitement des resultats
			while (rs.next()) {
				long idRecupere = rs.getLong("ID_Categorie");
				String libelleRecupere = rs.getString("Libelle_Categorie");
				cat = new Categorie(idRecupere, libelleRecupere);
				listeCategories.add(cat);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeCategories;
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.dao.IDao#update(java.lang.Object)
	 */
	@Override
	public void update(Categorie t) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.dao.IDao#delete(int)
	 */
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
