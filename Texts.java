/**
 * 
 */
package Task4_2;

/**
 * @author ThuyNguyen
 *
 */
public class Texts extends Gallery {
	private int numLines;

	/**
	 * this is constructor
	 * @param nameFiles
	 * @param size
	 * @param numLines
	 */
	public Texts(String nameFiles, int size, int numLines) {
		super(nameFiles, size);
		this.numLines = numLines;
	}
	
}
