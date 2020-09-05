/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formatter;

/**
 *
 * @author hailiang194
 * @param <E> formatted element's data type
 */
public interface IFormatable<E> {
	/**
	 * convert data from string to element
	 * @param data data
	 * @return element
	 * @throws Exception 
	 */
	public E parse(String data) throws Exception;
	
	/**
	 * convert element to data string
	 * @param element formatted element
	 * @return data string
	 */
	public String format(E element);
}
