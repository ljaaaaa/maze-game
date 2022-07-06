import java.awt.Graphics2D;

public class Background {
	public char[][] grid;
	public int viewX;
	public int viewY;

   	public Background(){
        	grid = new char[Constants.GRID_WIDTH][Constants.GRID_HEIGHT];
        	setBackground();
		grid[10][10] = Constants.FOOD;
		int viewX = 0;
		int viewY = 0;
    	}

    	public void setBackground(){
        	for (int x = 0; x < grid.length; x++){
            		for (int y = 0; y < grid[x].length; y++){
                		grid[x][y] = Constants.GRASS;
            		}
        	}
    	}

	public void move(int xPlus, int yPlus){
                viewX += xPlus;
                viewY += yPlus;
        }

	public void paintGrass(Graphics2D g2d, int x, int y){
		g2d.setColor(Constants.GRASS_COLOR);
                g2d.fillRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, Constants.GRID_PIECE, Constants.GRID_PIECE);

               	g2d.setColor(Constants.GRASS2_COLOR);
                g2d.drawRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, Constants.GRID_PIECE, Constants.GRID_PIECE);
	}

	public void paintFood(Graphics2D g2d, int x, int y){
		g2d.setColor(Constants.APPLE_COLOR);
                g2d.fillRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, Constants.GRID_PIECE, Constants.GRID_PIECE);

                g2d.setColor(Constants.APPLE2_COLOR);
                g2d.drawRect(x*Constants.GRID_PIECE, y*Constants.GRID_PIECE, Constants.GRID_PIECE, Constants.GRID_PIECE);
	}

    	public void drawBackground(Graphics2D g2d){
		//Visible width and heights
		int paintWidth = Constants.FRAME_WIDTH / Constants.GRID_PIECE;
		int paintHeight = Constants.FRAME_HEIGHT / Constants.GRID_PIECE;

		//Start square positions for grid
		int startX = viewX/Constants.GRID_PIECE;
		int startY = viewY/Constants.GRID_PIECE;

		//I'm sorry I'll change this formatting later
		if (startX < 0) startX = 0;
		if (startY < 0) startY = 0;

		startX = 0; startY = 0;

		//Paint visible areas
        	for (int x = 0; x < paintWidth; x++){
            		for (int y = 0; y < paintHeight; y++){
                		switch (grid[x+startX][y+startY]) {

                    			case Constants.GRASS:
                        			paintGrass(g2d, x+viewX, y+viewY);
						break;
					
					case Constants.FOOD:
						paintFood(g2d, x+viewX, y+viewY);
						break;
				}
            		}
        	}

    	}
}
