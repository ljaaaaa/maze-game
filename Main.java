import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {
    
    public Player player;

    public MyPanel panel;

    public Main(){
        player = new Player("images/player.png", 50, 50); 
        panel = new MyPanel();  
        setUpFrame();
    }

    public void setUpFrame(){
        JFrame f = new JFrame("Game");
        f.setIconImage(new ImageIcon("images/image.png").getImage());
        f.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT+37);
        f.setLayout(null);

        f.addMouseListener(Statics.mouseListener);

        f.addKeyListener(Statics.keyListener);
        f.setFocusable(true);

        f.add(panel);

        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        Statics.timer.start();
    }
}