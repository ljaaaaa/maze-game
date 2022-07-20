import java.awt.Rectangle;
import java.awt.Color;

public class Constants {
    	//Frame
    	public static final int FRAME_WIDTH = 800;
    	public static final int FRAME_HEIGHT = 600;
    	public static final Rectangle FRAME_BOUNDS = new Rectangle(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

    	//Colors
    	public static final Color PLAYER_COLOR = new Color(0, 0, 255);
    	public static final Color GRASS_COLOR = new Color(132, 191, 119);
    	public static final Color GRASS2_COLOR = new Color(27, 117, 54);
    	public static final Color APPLE_COLOR = new Color(200, 0, 0);
	public static final Color BUSH_COLOR = new Color(8, 69, 13);

    	//Background Grid
    	public static final int GRID_PIECE = 50; //Size of each grid square
    	public static final int GRID_WIDTH = FRAME_WIDTH/10;
    	public static final int GRID_HEIGHT = FRAME_HEIGHT/10;

    	public static final char GRASS = 'g';
    	public static final char FOOD = 'f';
    	public static final char OBSTACLE = 'o';
}
