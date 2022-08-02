import java.awt.Rectangle;
import java.awt.Color;

public class Constants {
    	//Frame constants
	public static class Frame {
    		public static final int WIDTH = 800;
    		public static final int HEIGHT = 600;
    		public static final Rectangle BOUNDS = new Rectangle(0, 0, WIDTH, HEIGHT);
	}

    	//Color constants
	public static class Colors {
    		public static final Color GRASS = new Color(132, 191, 119);
    		public static final Color GRASS2 = new Color(27, 117, 54);
    		public static final Color APPLE = new Color(200, 0, 0);
		public static final Color BUSH = new Color(8, 69, 13);
	}

    	//Background grid constants
	public static class Grid {
    		public static final int PIECE = 50; //Size of each grid square
    		public static final int WIDTH = Frame.WIDTH/10; //Grid width
    		public static final int HEIGHT = Frame.HEIGHT/10;

    		public static final char GRASS = 'g';
    		public static final char FOOD = 'f';
    		public static final char OBSTACLE = 'o';
	}

	//Player constants
	public static class Player {
		public static final int SPEED = 10;
        	public static final int WIDTH = Constants.Grid.PIECE;
	        public static final int HEIGHT = Constants.Grid.PIECE * 2;
		public static final Color COLOR = new Color(0, 0, 255);
	}
}
