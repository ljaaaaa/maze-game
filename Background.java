import java.awt.Graphics2D;

public class Background {

	public char[][] grid;

   	public Background(){
        	grid = new char[Constants.GRID_WIDTH][Constants.GRID_HEIGHT];
        	setBackground();
		grid[10][10] = Constants.FOOD;
    	}

    	public void setBackground(){
        	for (int x = 0; x < grid.length; x++){
            		for (int y = 0; y < grid[x].length; y++){
                		grid[x][y] = Constants.GRASS;
            		}
        	}
    	}

    	public void drawBackground(Graphics2D g2d){
		//Visible width and heights
		int paintWidth = Constants.FRAME_WIDTH / Constants.GRID_PIECE;
		int paintHeight = Constants.FRAME_HEIGHT / Constants.GRID_PIECE;

		//Paint visible areas
        	for (int x = 0; x < paintWidth; x++){
            		for (int y = 0; y < paintHeight; y++){
                		switch (grid[x][y]) {

                    			case Constants.GRASS:
                        			g2d.setColor(Constants.GRASS_COLOR);
                        			g2d.fillRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, 
                                        		Constants.GRID_PIECE, Constants.GRID_PIECE);
                        	
						g2d.setColor(Constants.GRASS2_COLOR);
                        			g2d.drawRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, 
                                        		Constants.GRID_PIECE, Constants.GRID_PIECE);
                        				break;
					
					case Constants.FOOD:
						g2d.setColor(Constants.APPLE_COLOR);
                                		g2d.fillRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE,
                                        		Constants.GRID_PIECE, Constants.GRID_PIECE);

                                		g2d.setColor(Constants.APPLE2_COLOR);
                                		g2d.drawRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE,
                                        		Constants.GRID_PIECE, Constants.GRID_PIECE);
                		}
            		}
        	}

    	}
}
