import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.awt.event.KeyEvent;
import java.awt.Point;

public class MyKeyListener implements KeyListener {
    	public Player player;
    	public final Set<Integer> pressedKeys = new HashSet<>();

    	public MyKeyListener(Player player) {
        	this.player = player;
    	}

    	public void keyPressed(KeyEvent e) { 
        	pressedKeys.add(e.getKeyCode());
        	handleKeys();
    	}

    	public void keyReleased(KeyEvent e) { 
        	pressedKeys.remove(e.getKeyCode());
        	handleKeys();
    	}

    	public void handleKeys(){
        	Point offset = new Point();
        
        	if (!pressedKeys.isEmpty()) {
            		for (Iterator<Integer> it = pressedKeys.iterator(); it.hasNext();) {
                		switch (it.next()) {
                    			case KeyEvent.VK_UP:
                        			offset.y-=1;
                        			break;
                    			case KeyEvent.VK_LEFT:
                        			offset.x-=1;
                        			break;
                    			case KeyEvent.VK_DOWN:
                        			offset.y+=1;
                        			break;
                    			case KeyEvent.VK_RIGHT:
                        			offset.x+=1;
                        			break;
                		}
            		}
        	}
        	player.move(offset.x*Player.SPEED, offset.y*Player.SPEED);
    	}

    	public void keyTyped(KeyEvent e) {
    
    	}
}
