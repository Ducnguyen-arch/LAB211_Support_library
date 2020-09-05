/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author hailiang194
 */
public abstract class Form {

	protected enum EXIT_OPTION {
		UPDATE_EXIT, //get out current update() and invoke update() again
		LOOP_EXIT //get out of form
	};

	/**
	 * run it only one after initializing object
	 */
	public abstract void setup();

	/**
	 * it is invoked by loop
	 *
	 * @return exit option flag
	 */
	protected abstract EXIT_OPTION update();

	/**
	 * run it after invoke setup()
	 */
	public void loop() {
		while(update() != EXIT_OPTION.LOOP_EXIT){
			continue;
		}
	}
}
