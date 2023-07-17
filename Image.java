/**
 * 
 */
package Task4_2;

/**
 * @author ThuyNguyen
 *
 */
public class Image extends Gallery {
	private int height;
	private int width;
	private String quality;
	/**
	 * this is constructor
	 * @param nameFiles
	 * @param size
	 * @param height
	 * @param width
	 * @param quality
	 */
	public Image(String nameFiles, int size, int height, int width, String quality) {
		super(nameFiles, size);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}
	
}
