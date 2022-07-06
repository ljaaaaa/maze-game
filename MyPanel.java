import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyPanel extends JPanel {
    	public Player player;
    	public Background background;

    	public MyPanel(Background background, Player player){
        	setBounds(Constants.FRAME_BOUNDS);
        	this.player = player;
        	this.background = background;
    	}

    	@Override
    	protected void paintComponent(Graphics g){
        	super.paintComponent(g);
        	Graphics2D g2d = (Graphics2D)g;

        	background.drawBackground(g2d);
        	player.drawItem(g2d);
    	}
}
