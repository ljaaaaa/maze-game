import java.awt.Rectangle;
import java.awt.Color;

public class Constants {
    //Frame
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    public static final Rectangle FRAME_BOUNDS = new Rectangle(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

    //ActionListener
    public static final int DELAY = 100;

    //Items
    public static final Size BUSH_SIZE = new Size(50, 50);
    public static final Size PLAYER_SIZE = new Size(50, 70);

    //Colors
    public static final Color PLAYER = new Color(255, 0, 0);
    public static final Color GRASS = new Color(132, 191, 119);
    public static final Color BUSH = new Color(0, 255, 0);
}