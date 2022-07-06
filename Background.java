import java.awt.Graphics2D;

public class Background {
	public char[][] grid;
	
	//Moved coords
	private int viewX;
	private int viewY;

	//Visible width and heights
        private int paintWidth = Constants.FRAME_WIDTH / Constants.GRID_PIECE + 2;
        private int paintHeight = Constants.FRAME_HEIGHT / Constants.GRID_PIECE + 2;


   	public Background(){
        	grid = new char[Constants.GRID_WIDTH][Constants.GRID_HEIGHT];
        	setBackground();
		grid[10][10] = Constants.FOOD;
		grid[2][2] = Constants.OBSTACLE;
		viewX = 0;
		viewY = 0;
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

		//X-axis in range
		if (viewX > 0){
			viewX = 0;
		
		} if (viewY > 0){
			viewY = 0;
		}

		//Y-axis in range
        	if (-viewX / Constants.GRID_PIECE + paintWidth >= Constants.GRID_WIDTH){
			viewX -= xPlus;
		
		} if (-viewY / Constants.GRID_PIECE + paintHeight >= Constants.GRID_HEIGHT){
                        viewY -= yPlus;
                }
	}

	public void paintGrass(Graphics2D g2d, int x, int y){
		g2d.setColor(Constants.GRASS_COLOR);
                g2d.fillRect(x, y, Constants.GRID_PIECE, Constants.GRID_PIECE);

               	g2d.setColor(Constants.GRASS2_COLOR);
                g2d.drawRect(x, y, Constants.GRID_PIECE, Constants.GRID_PIECE);
	}

	public void paintFood(Graphics2D g2d, int x, int y){
		g2d.setColor(Constants.APPLE_COLOR);
                g2d.fillRect(x, y, Constants.GRID_PIECE, Constants.GRID_PIECE);
	}

	public void paintObstacle(Graphics2D g2d, int x, int y){
                g2d.setColor(Constants.BUSH_COLOR);
                g2d.fillRect(x, y, Constants.GRID_PIECE, Constants.GRID_PIECE);
        }

    	public void drawBackground(Graphics2D g2d){
		//Grid start square
		int startX = -viewX / Constants.GRID_PIECE;
		int startY = -viewY / Constants.GRID_PIECE;

		//Paint visible areas
        	for (int x = 0; x < paintWidth; x++){
            		for (int y = 0; y < paintHeight; y++){
                		switch (grid[x+startX][y+startY]) {

                    			case Constants.GRASS:
                        			paintGrass(g2d, (viewX%Constants.GRID_PIECE)+x*Constants.GRID_PIECE, 
                                                                (viewY%Constants.GRID_PIECE)+y*Constants.GRID_PIECE);
						break;
					
					case Constants.FOOD:
						paintFood(g2d, (viewX%Constants.GRID_PIECE)+x*Constants.GRID_PIECE, 
								(viewY%Constants.GRID_PIECE)+y*Constants.GRID_PIECE);
						break;
					 case Constants.OBSTACLE:
                                                paintObstacle(g2d, (viewX%Constants.GRID_PIECE)+x*Constants.GRID_PIECE,
                                                                (viewY%Constants.GRID_PIECE)+y*Constants.GRID_PIECE);
                                                break;
				}
            		}
        	}

    	}
}
