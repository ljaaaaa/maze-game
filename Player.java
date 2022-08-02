import java.awt.Graphics2D;

public class Player extends Item {
    	public Player(String imageName){
        	super(imageName);
        	setSize(Constants.Player.WIDTH, Constants.Player.HEIGHT);
        	this.x = Constants.Frame.WIDTH/2 - this.width/2;
                this.y = Constants.Frame.HEIGHT/2 - this.height/2;
    	}

    	@Override
    	public void drawItem(Graphics2D g2d){
        	g2d.setColor(Constants.Player.COLOR);
        	g2d.fillRect(x, y, width, height);
    	}
}
