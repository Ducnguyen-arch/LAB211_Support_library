/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

/**
 *
 * @author hailiang194
 */
public interface FileSavable {
	/**
	 * save all data in container to file
	 */
	public void saveAll();
	
	/**
	 * append the last element of container to file
	 */
	public void append();
}
