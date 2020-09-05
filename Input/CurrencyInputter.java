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
public class CurrencyInputter extends Inputter<Double>{

	@Override
	protected Double inputValue() throws Exception {
		return Double.parseDouble(in.readLine());
	}

	@Override
	protected boolean isInvalidElement(Double element) {
		return (Double.compare(element, 0.0) < 0);
	}

	@Override
	protected String invalidMessage(Double element) {
		return String.format("Input is out of range, input=%.2f, range=[%.2f, %.2f)", element, 0.0, Double.POSITIVE_INFINITY);
	}
	
}
