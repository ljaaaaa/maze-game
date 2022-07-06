import java.awt.Graphics2D;

public class Background {
 
    public char[][] grid;

    public Background(){
        grid = new char[Constants.GRID_WIDTH][Constants.GRID_HEIGHT];
        setBackground();
    }

    public void setBackground(){
        for (int x = 0; x < grid.length; x++){
            for (int y = 0; y < grid[x].length; y++){
                grid[x][y] = Constants.GRASS;
            }
        }
    }

    public void drawBackground(Graphics2D g2d){
        for (int x = 0; x < grid.length; x++){
            for (int y = 0; y < grid[x].length; y++){
                switch (grid[x][y]) {

                    case Constants.GRASS:
                        //g2d.setColor(Constants.GRASS_COLOR);
                        //g2d.fillRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, 
                        //                Constants.GRID_PIECE, Constants.GRID_PIECE);
                        g2d.setColor(Constants.BUSH_COLOR);
                        g2d.drawRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, 
                                        Constants.GRID_PIECE, Constants.GRID_PIECE);
                        break;

                }
            }
        }

    }

}
