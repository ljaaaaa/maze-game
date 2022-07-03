import java.awt.Graphics2D;

public class Plant extends Item{

    public Plant(String imageName, int x, int y) {
        super(imageName, x, y);
        setSize(Constants.BUSH_SIZE);
       
    }

    @Override
    public void drawItem(Graphics2D g2d){
        g2d.setColor(Constants.PLAYER);
        g2d.fillRect(x, y, width, height);

    }
    
}
