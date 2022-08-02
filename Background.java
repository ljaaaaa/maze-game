import java.awt.Graphics2D;

public class Background {
	public char[][] grid;
	
	//Moved coords
	private int viewX;
	private int viewY;

	//Visible width and heights
        private int paintWidth = Constants.Frame.WIDTH / Constants.Grid.PIECE + 2;
        private int paintHeight = Constants.Frame.HEIGHT / Constants.Grid.PIECE + 2;


   	public Background(){
        	grid = new char[Constants.Grid.WIDTH][Constants.Grid.HEIGHT];
        	setBackground();
		grid[10][10] = Constants.Grid.FOOD;
		grid[2][2] = Constants.Grid.OBSTACLE;
		viewX = 0;
		viewY = 0;
    	}

    	public void setBackground(){
        	for (int x = 0; x < grid.length; x++){
            		for (int y = 0; y < grid[x].length; y++){
                		grid[x][y] = Constants.Grid.GRASS;
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
        	if (-viewX / Constants.Grid.PIECE + paintWidth >= Constants.Grid.WIDTH){
			viewX -= xPlus;
		
		} if (-viewY / Constants.Grid.PIECE + paintHeight >= Constants.Grid.HEIGHT){
                        viewY -= yPlus;
                }
	}

	public void paintGrass(Graphics2D g2d, int x, int y){
		g2d.setColor(Constants.Colors.GRASS);
                g2d.fillRect(x, y, Constants.Grid.PIECE, Constants.Grid.PIECE);

               	g2d.setColor(Constants.Colors.GRASS2);
                g2d.drawRect(x, y, Constants.Grid.PIECE, Constants.Grid.PIECE);
	}

	public void paintFood(Graphics2D g2d, int x, int y){
		g2d.setColor(Constants.Colors.APPLE);
                g2d.fillRect(x, y, Constants.Grid.PIECE, Constants.Grid.PIECE);
	}

	public void paintObstacle(Graphics2D g2d, int x, int y){
                g2d.setColor(Constants.Colors.BUSH);
                g2d.fillRect(x, y, Constants.Grid.PIECE, Constants.Grid.PIECE);
        }

    	public void drawBackground(Graphics2D g2d){
		//Grid start square
		int startX = -viewX / Constants.Grid.PIECE;
		int startY = -viewY / Constants.Grid.PIECE;

		//Paint visible areas
        	for (int x = 0; x < paintWidth; x++){
            		for (int y = 0; y < paintHeight; y++){
                		switch (grid[x+startX][y+startY]) {

                    			case Constants.Grid.GRASS:
                        			paintGrass(g2d, (viewX%Constants.Grid.PIECE)+x*Constants.Grid.PIECE, 
                                                                (viewY%Constants.Grid.PIECE)+y*Constants.Grid.PIECE);
						break;
					
					case Constants.Grid.FOOD:
						paintFood(g2d, (viewX%Constants.Grid.PIECE)+x*Constants.Grid.PIECE, 
								(viewY%Constants.Grid.PIECE)+y*Constants.Grid.PIECE);
						break;
					 case Constants.Grid.OBSTACLE:
                                                paintObstacle(g2d, (viewX%Constants.Grid.PIECE)+x*Constants.Grid.PIECE,
                                                                (viewY%Constants.Grid.PIECE)+y*Constants.Grid.PIECE);
                                                break;
				}
            		}
        	}

    	}
}
