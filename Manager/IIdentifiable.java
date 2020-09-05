/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

/**
 *
 * @author hailiang194
 * @param <E> identified element's data type
 */
public interface IIdentifiable<E> {
	/**
	 * check if element is being finding
	 * @param element element
	 * @return true if it is being finding, otherwise false
	 */
	public boolean isFindingElement(E element);
}
