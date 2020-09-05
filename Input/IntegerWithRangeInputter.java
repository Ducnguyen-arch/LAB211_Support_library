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
public class IntegerWithRangeInputter extends Inputter<Integer>{

	private final int MIN;
	private final int MAX;

	public IntegerWithRangeInputter(int MIN, int MAX) {
		this.MIN = MIN;
		this.MAX = MAX;
	}
	
	
	
	@Override
	protected Integer inputValue() throws Exception {
		return Integer.parseInt(in.readLine());
	}

	@Override
	protected boolean isInvalidElement(Integer element) {
		return ((element < MIN) || (element > MAX));
	}

	@Override
	protected String invalidMessage(Integer element) {
		return String.format("Input is out of range, input=%d, range=[%d,%d]", element, MIN, MAX);
	}
	
}
