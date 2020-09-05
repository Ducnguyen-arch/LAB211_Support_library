/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hailiang194
 * @param <E> inputted element's data type
 */
public abstract class Inputter<E> {

	protected static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * input value of element
	 *
	 * @return element
	 * @throws java.lang.Exception
	 */
	protected abstract E inputValue() throws Exception;

	/**
	 * check if element is invalid
	 *
	 * @param element checked element
	 * @return true if element is invalid, otherwise false
	 */
	protected abstract boolean isInvalidElement(E element);

	/**
	 * get the message when input is invalid
	 *
	 * @param element invalid element
	 * @return message
	 */
	protected abstract String invalidMessage(E element);

	/**
	 * input element with prompt
	 *
	 * @param msg prompt
	 * @return inputted element
	 * @throws Exception IO exception occurs or element is invalid
	 */
	public E input(String msg) throws Exception {
		System.out.print(msg);

		E element = this.inputValue();

		if (this.isInvalidElement(element)) {
			throw new Exception(this.invalidMessage(element));
		}

		return element;
	}

	/**
	 * input element until there's no exception
	 *
	 * @param msg prompt
	 * @return inputted elements
	 */
	public E inputUntilNoExeption(String msg) {
		E element = null;

		while (true) {
			try {
				element = this.input(msg);
				break;
			} catch (Exception ex) {
				System.out.println("ERROR: " + ex.getMessage());
			}
		}

		return element;
	}

	/**
	 * hold until user press Enter
	 */
	public static void hold() {
		try {
			in.readLine();
		} catch (IOException ex) {
			
		}
	}
}
