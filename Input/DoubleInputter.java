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
public class DoubleInputter extends Inputter<Double>{

	@Override
	protected Double inputValue() throws Exception {
		return Double.parseDouble(in.readLine());
	}

	@Override
	protected boolean isInvalidElement(Double element) {
		return false;
	}

	@Override
	protected String invalidMessage(Double element) {
		return "";
	}
	
}
