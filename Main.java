import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {
    public MyKeyListener keyListener;
    public MyMouseListener mouseListener;
    public MyActionListener actionListener;
    public Timer timer;
    public MyPanel panel;

    public Player player;
    
    public Main(){
        player = new Player("images/player.png", 50, 50);
        panel = new MyPanel(player);
        
        keyListener = new MyKeyListener(player);
        mouseListener = new MyMouseListener();
        actionListener = new MyActionListener(panel);
        timer = new Timer(MyActionListener.DELAY, actionListener);
        setUpFrame();
    }

    public void setUpFrame(){
        JFrame f = new JFrame("Game");
        f.setIconImage(new ImageIcon("images/image.png").getImage());
        f.setSize(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT+37);
        f.setLayout(null);

        f.addMouseListener(mouseListener);

        f.addKeyListener(keyListener);
        f.setFocusable(true);

        f.add(panel);

        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        timer.start();
    }
}