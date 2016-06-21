import java.awt.Color;
import java.awt.Polygon;

public class blocks{
	
	private int orderNum; //keeps track of this block
	private int colorNum; //keeps track of the color of this block
	private int side;
	private int height = -250;
	
	private Polygon block = new Polygon(); //create the blocks

	
	public blocks(int color, int side){
		//orderNum = num;
		colorNum = color;
		this.side = side;
		
		block = createBlock(block, side);
	}
	
	private Polygon createBlock(Polygon block, int side){
		for(int i = 4; i < 6; i++){ //add coordinates for each vertex
	    	block.addPoint((int) (130 * Math.cos(i * 2 * Math.PI / 6)), (int) (130 * Math.sin(i * 2 * Math.PI / 6)));
	    }
	    for(int i = 5; i > 3; i--){ 
	    	block.addPoint((int) (100 * Math.cos(i * 2 * Math.PI / 6)), (int) (100 * Math.sin(i * 2 * Math.PI / 6)));
	    }
		
		return block;
	}
	
	public Polygon getPolygon(){
		return block;
	}
	
	public int getSide(){
		return side;
	}
	
	public int getNum(){
		return orderNum;
	}
	
	public int getColorNum(){
		return colorNum;
	}
	
	public Color getColor(){
		if(colorNum == 0){
			return Color.RED;
		}
		else if(colorNum == 1){
			return Color.BLUE;
		}
		else if(colorNum == 2){
			return Color.YELLOW;
		}
		else{
			return Color.GREEN;
		}
	}
	
	public int getHeight(){
		return height;
	}
	
	public void updateHeight(){
		height += 0.5;
	}
	
	public void remove(){
		
	}
	
	/*private int[] createXPoints(int side){
		ArrayList<Integer> XPoints = new ArrayList<Integer>();
		return XPoints;
	}
	
	private int[] createYPoints(int side){
		ArrayList<Integer> YPoints = new ArrayList<Integer>();
		return YPoints;
	}*/
	
}