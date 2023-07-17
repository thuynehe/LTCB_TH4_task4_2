/**
 * 
 */
package Task4_2;

/**
 * @author ThuyNguyen
 *
 */
public abstract class Gallery {
	private String nameFiles;
	private int size; //number of bytes
	/**
	 * this is constructor
	 * @param nameFiles
	 * @param size
	 */
	public Gallery(String nameFiles, int size) {
		super();
		this.nameFiles = nameFiles;
		this.size = size;
	}
	
}
