import java.awt.Rectangle;
import java.awt.Color;

public class Constants {
    //Frame
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    public static final Rectangle FRAME_BOUNDS = new Rectangle(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

    //Move Area
    public static final int MOVE_WIDTH = FRAME_WIDTH/2;
    public static final int MOVE_HEIGHT = FRAME_HEIGHT/2;
    public static final Rectangle MOVE_BOUNDS = new Rectangle(MOVE_WIDTH/2, MOVE_HEIGHT/2, MOVE_WIDTH, MOVE_HEIGHT);

    //Items
    public static final Size BUSH_SIZE = new Size(FRAME_WIDTH/10, FRAME_WIDTH/10);
    public static final Size PLAYER_SIZE = new Size(FRAME_WIDTH/16, FRAME_WIDTH/10);

    //ActionListener
    public static final int DELAY = 100;

    //Colors
    public static final Color PLAYER = new Color(255, 0, 0);
    public static final Color GRASS = new Color(132, 191, 119);
    public static final Color BUSH = new Color(27, 117, 54);
}