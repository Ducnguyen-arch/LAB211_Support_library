/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.List;

/**
 *
 * @author hailiang194
 * @param <E> element data type
 */
public class Manager<E> {

	protected List<E> elements;

	public Manager() {
	}

	public Manager(List<E> elements) {
		this.elements = elements;
	}

	public int size() {
		return this.elements.size();
	}

	public E get(int index) {
		return this.elements.get(index);
	}
}
