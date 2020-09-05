/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager.insert;

/**
 *
 * @author hailiang194
 * @param <E> inserted element's data type
 */
public interface IInsertable<E> {
	/**
	 * insert new element to list
	 * @param element inserted element
	 */
	public void insert(E element);
}
