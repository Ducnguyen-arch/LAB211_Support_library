/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager.remove;

import Manager.IIdentifiable;

/**
 *
 * @author hailiang194
 * @param <E> 
 */
public interface IRemovable<E> {
	/**
	 * remove the first element satisfy identifier
	 * @param identifier identifier
	 */
	public void removeFirst(IIdentifiable<E> identifier);
	
	/**
	 * remove all elements satisfy identifier
	 * @param identifier identifier
	 */
	public void removeAll(IIdentifiable<E> identifier);
}
