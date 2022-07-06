import java.awt.Graphics2D;

public class Player extends Item {
 
    	public static final int SPEED = 10;
    	public static final int WIDTH = Constants.FRAME_WIDTH/14;
    	public static final int HEIGHT = Constants.FRAME_HEIGHT/8;

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

		g2d.setColor(Constants.PLAYER2_COLOR);
                g2d.drawRect(x, y, width, height);
    	}
}
