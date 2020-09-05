/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager.find;

import Manager.IIdentifiable;
import java.util.List;

/**
 *
 * @author hailiang194
 * @param <E> finding elements data type
 */
public interface IFindable<E> {
	/**
	 * find the first element in list that satisfy the identifier
	 * @param identifier identifier
	 * @return the found element, if not found return null
	 */
	public E findFirst(IIdentifiable<E> identifier);
	
	/**
	 * find all elements in list that satisfy the identifier
	 * @param identifier identifier
	 * @return list of found elements
	 */
	public List<E> findAll(IIdentifiable<E> identifier);
}
