import java.awt.Graphics2D;

public class Player extends Item {
 
    public static final int SPEED = 1;
    public static final int WIDTH = Constants.FRAME_WIDTH/16;
    public static final int HEIGHT = Constants.FRAME_HEIGHT/10;

    public Player(String imageName, int x, int y){
        super(imageName, x, y);
        setSize(WIDTH, HEIGHT);
        centerPlayer();
    }

    public void centerPlayer(){
        this.x = Constants.FRAME_WIDTH/2 - this.width/2;
        this.y = Constants.FRAME_HEIGHT/2 - this.height/2;
    }

    public void move(int xPlus, int yPlus){
        this.x += xPlus;
        this.y += yPlus;
    }

    @Override
    public void drawItem(Graphics2D g2d){
        g2d.setColor(Constants.PLAYER_COLOR);
        g2d.fillRect(x, y, width, height);
    }
}