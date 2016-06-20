import java.awt.Polygon;

public class hexagon {

	Polygon bgHex = new Polygon();
	Polygon hex = new Polygon();
	
	public void createHex(){ //create hexagons for the game
	    for(int i = 0; i < 6; i++){ //add coordinates for each vertex
	    	bgHex.addPoint((int) (300 * Math.cos(i * 2 * Math.PI / 6)), (int) (300 * Math.sin(i * 2 * Math.PI / 6)));
	    }
	    
	    for(int i = 0; i < 6; i++){ //add coordinates for each vertex
	    	hex.addPoint((int) (100 * Math.cos(i * 2 * Math.PI / 6)), (int) (100 * Math.sin(i * 2 * Math.PI / 6)));
	    }
	}
}
