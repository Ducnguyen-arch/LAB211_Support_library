/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author hailiang194
 */
public abstract class FileLister {

	protected final File parent;

	public FileLister(File parent) {
		this.parent = parent;
	}

	/**
	 * check if file is needed to do something base on your purpose, if you
	 * want to get the list of all child, override it return true
	 *
	 * @param file
	 * @return true if file is needed, otherwise false
	 */
	protected abstract boolean isNeededFile(File file);

	/**
	 * get the list of child file
	 * @return list
	 */
	public ArrayList<File> list() {
		ArrayList<File> children = new ArrayList<>();

		list(this.parent, children);
		
		return children;
	}

	/**
	 * get the list of child file
	 * @param file parent file
	 * @param found list of child file
	 */
	protected void list(File file, ArrayList<File> found) {
		if (file.isFile()) {
			if(this.isNeededFile(file))
				found.add(file);
			
			return;
		}
		
		File[] children = file.listFiles();
		
		for (File child : children) {
			list(child, found);
		}
	}

}
