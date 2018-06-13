/**
 * 
 */
package sn.objis.gestionStock.dao;

import java.util.List;

/**
 * @author diawara
 *
 */
public interface IDao <T> {
	public void ajouter(T t);
	public List<T> findAll();
	public void update(T t);
	public void delete(int id);

}
