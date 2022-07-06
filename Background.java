import java.awt.Graphics2D;

public class Background {
	public char[][] grid;
	private int viewX;
	private int viewY;

   	public Background(){
        	grid = new char[Constants.GRID_WIDTH][Constants.GRID_HEIGHT];
        	setBackground();
		grid[10][10] = Constants.FOOD;
		viewX = 1;
		viewY = 1;
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
		System.out.println("moving");
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

                g2d.setColor(Constants.APPLE2_COLOR);
                g2d.drawRect(x, y, Constants.GRID_PIECE, Constants.GRID_PIECE);
	}

    	public void drawBackground(Graphics2D g2d){
		//Visible width and heights
		int paintWidth = Constants.FRAME_WIDTH / Constants.GRID_PIECE;
		int paintHeight = Constants.FRAME_HEIGHT / Constants.GRID_PIECE;

		//Grid start square
		System.out.println(viewX);
		int startX = Constants.GRID_PIECE / -viewX;
		int startY = Constants.GRID_PIECE / -viewY;

		System.out.println(startX + " : " + startY);

		//Paint visible areas
        	for (int x = 0; x < paintWidth+startX; x++){
            		for (int y = 0; y < paintHeight+startY; y++){
				int newX = x+startX;
				int newY = y+startY;
                		switch (grid[newX][newY]) { //check out actual grid square (starts at startX)

                    			case Constants.GRASS:
                        			paintGrass(g2d, viewX+x*Constants.GRID_PIECE, viewY+y*Constants.GRID_PIECE);
						break;
					
					case Constants.FOOD: //paint using actual x (starts at 0)
						paintFood(g2d, viewX+x*Constants.GRID_PIECE, viewY+y*Constants.GRID_PIECE);
						break;
				}
            		}
        	}

    	}
}
