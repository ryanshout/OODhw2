/**
 * 
 */
package edu.txstate.simpleLib.ts1271.rab230;

import java.io.Serializable;

/**
 * @author ryan
 *
 */
public class LibDirectory implements Serializable {

	/**
	 *  default UID
	 */
	private static final long serialVersionUID = 1L;
	
	public static LibDirectory instance = null;
	protected LibDirectory() {
		
	}
	public static LibDirectory getInstance() {
		if (instance == null) {
			instance = new LibDirectory();
		}
		return instance;
	}

}
