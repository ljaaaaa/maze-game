import java.awt.Rectangle;
import java.awt.Color;

public class Constants {
    //Frame
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    public static final Rectangle FRAME_BOUNDS = new Rectangle(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

    //Colors
    public static final Color PLAYER = new Color(255, 0, 0);
    public static final Color GRASS = new Color(132, 191, 119);
    public static final Color BUSH = new Color(27, 117, 54);

    //Background Grid
    public static final int GRID_PIECE = 1; //Size of each grid square
    public static final int GRID_WIDTH = FRAME_WIDTH;
    public static final int GRID_HEIGHT = FRAME_HEIGHT;
}