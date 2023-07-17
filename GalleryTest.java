package Task4_2;

import junit.framework.TestCase;

public class GalleryTest extends TestCase {
	public void test() {
		//create test for class PlayTime
		PlayTime p1 = new PlayTime(3, 20);
		//create test for class Gallery
		Gallery image = new Image("stored in flower.gif", 57234, 50, 100, "medium");
		Gallery text = new Texts("stored in welcome.txt", 5312, 830);
		Gallery sound = new Sounds("stored in theme.mp3", 40960, p1);
	}
}
