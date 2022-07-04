import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyPanel extends JPanel {

    public Player player;
    public Plant bush;

    public MyPanel(Player player, Plant bush){
        setBounds(Constants.FRAME_BOUNDS);
        this.player = player;
        this.bush = bush;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        drawBackground(g2d);
        player.drawItem(g2d);
        bush.drawItem(g2d);
    }

    public void drawBackground(Graphics2D g2d){
        g2d.setColor(Constants.GRASS);
        g2d.fillRect(0, 0, Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
    }
}