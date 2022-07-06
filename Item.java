import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Image;

public class Item {
    	public int x;
    	public int y;
    	public int width;
    	public int height;
    	public String imageName;

	public Item(String imageName){
		this.imageName = imageName;
	}

    	public Item(String imageName, int x, int y){
        	this.imageName = imageName;
		this.x = x;
        	this.y = y;

        	ImageIcon image = getIcon();
        	setSize(image.getIconWidth(), image.getIconHeight());
    	}

    	public void drawItem(Graphics2D g2d){
        	g2d.drawImage(getImage(), x, y, width, height, null);
    	}

    	public Rectangle getBounds(){
        	return new Rectangle(x, y, width, height);
    	}

    	public ImageIcon getIcon(){
        	return new ImageIcon(imageName);
    	}

    	public Image getImage(){
        	return new ImageIcon(imageName).getImage();
    	}

    	public void setSize(int width, int height){
        	this.width = width;
        	this.height = height;
    	}
}
