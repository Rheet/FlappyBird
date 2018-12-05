package Flappy;

import javafx.scene.image.Image;

public class Resourses {
	
	 public Image birdImgs[] = new Image[3];

	    public Resourses() {
	        try {
	            for (int i = 0; i < birdImgs.length; i++) {
	                birdImgs[i] = new Image(getClass().getResourceAsStream("birdFrame" + i + ".png"));
	            }

	        } catch (Exception e) {
	            System.out.println("Problem in loading resourses");
	        }
	    }

}
