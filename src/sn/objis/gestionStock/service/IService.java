/**
 * 
 */
package sn.objis.gestionStock.service;

import java.util.List;

/**
 * @author diawara
 *
 */
public interface IService <T> {
	public void add(T t);
	public List<T> getAll();
	public void supprimer(T t);
	public void modify(T t);

}
