/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

/**
 *
 * @author hailiang194
 */
public class StringInputter extends Inputter<String>{

	@Override
	protected String inputValue() throws Exception {
		return in.readLine();
	}

	@Override
	protected boolean isInvalidElement(String element) {
		return false;
	}

	@Override
	protected String invalidMessage(String element) {
		return "";
	}
	
}
