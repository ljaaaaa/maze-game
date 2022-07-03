import java.awt.Graphics2D;

public class Player extends Item {
 
    public Player(String imageName, int x, int y){
        super(imageName, x, y);
        setSize(50, 80);
    }

    @Override
    public void drawItem(Graphics2D g2d){
        g2d.setColor(Constants.PLAYER);
        g2d.fillRect(x, y, width, height);

    }
}