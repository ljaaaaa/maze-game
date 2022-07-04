import java.awt.Graphics2D;

public class Player extends Item {
 
    public Player(String imageName, int x, int y){
        super(imageName, x, y);
        setSize(Constants.PLAYER_SIZE);
        centerPlayer();
    }

    public void centerPlayer(){
        this.x = Constants.FRAME_WIDTH/2 - this.width/2;
        this.y = Constants.FRAME_HEIGHT/2 - this.height/2;
    }

    @Override
    public void drawItem(Graphics2D g2d){
        g2d.setColor(Constants.PLAYER);
        g2d.fillRect(x, y, width, height);
    }
}