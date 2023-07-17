/**
 * 
 */
package Task4_2;

/**
 * @author ThuyNguyen
 *
 */
public class Sounds extends Gallery {
	private PlayTime playingTime;

	/**
	 * this is constructor
	 * @param nameFiles
	 * @param size
	 * @param playingTime
	 */
	public Sounds(String nameFiles, int size, PlayTime playingTime) {
		super(nameFiles, size);
		this.playingTime = playingTime;
	}
	
}
