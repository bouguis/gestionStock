/**
 * 
 */
package sn.objis.gestionStock.service;

import java.sql.Connection;
import java.util.List;

import sn.objis.gestionStock.dao.IDaoCategorieImpl;
import sn.objis.gestionStock.domain.Categorie;

/**
 * @author diawara
 *
 */
public class IServiceCategorieImpl implements IServiceCategorie {
	
	private Connection con;
	IDaoCategorieImpl dao ;

	public IServiceCategorieImpl(Connection con) {
		super();
		this.con = con;
		dao = new IDaoCategorieImpl(con);
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.service.IService#add(java.lang.Object)
	 */
	@Override
	public void add(Categorie t) {
		dao.ajouter(t);

	}

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.service.IService#getAll()
	 */
	@Override
	public List<Categorie> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.service.IService#supprimer(java.lang.Object)
	 */
	@Override
	public void supprimer(Categorie t) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see sn.objis.gestionStock.service.IService#modify(java.lang.Object)
	 */
	@Override
	public void modify(Categorie t) {
		// TODO Auto-generated method stub

	}

}
