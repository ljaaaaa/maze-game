import java.awt.Graphics2D;

public class Player extends Item {
 
    	public static final int SPEED = 10;
    	public static final int WIDTH = Constants.GRID_PIECE;
    	public static final int HEIGHT = Constants.GRID_PIECE * 2;

    	public Player(String imageName){
        	super(imageName);
        	setSize(WIDTH, HEIGHT);
        	this.x = Constants.FRAME_WIDTH/2 - this.width/2;
                this.y = Constants.FRAME_HEIGHT/2 - this.height/2;
    	}

    	@Override
    	public void drawItem(Graphics2D g2d){
        	g2d.setColor(Constants.PLAYER_COLOR);
        	g2d.fillRect(x, y, width, height);
    	}
}
