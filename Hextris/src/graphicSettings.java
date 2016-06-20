import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

import javax.swing.*;

public class graphicSettings extends JPanel implements ActionListener{
	
	Graphics2D graphics; //graphic settings of hextris
	
	Timer t = new Timer(5, (ActionListener) this);
	
	private int rotation = 0;
	
	public int turn = 0;
	
	public boolean pause;
	public boolean left;
	
	private Polygon bgHex, hex;
	
	public void addHex(Polygon bgHex, Polygon hex){
		this.bgHex = bgHex;
		this.hex = hex;
	}
	
	public void paintComponent(Graphics g){ //creating the shapes for the game
		super.paintComponent(g); //paintComponent is used to make the shapes
		
		graphics = (Graphics2D) g; //create graphic properties for the shape
	    
	    graphics.translate(640, 360); //centre the shape
	    graphics.setColor(Color.DARK_GRAY);
	    graphics.fill(bgHex);
	    
	    AffineTransform at = new AffineTransform(); //add affine transform to create movement within the shape
	    
	    graphics.setTransform(at); //add the affine transform to the shape
	    graphics.translate(640, 360); //centre the shape
	    graphics.rotate(Math.toRadians(rotation)); //allows rotation
	    graphics.setColor(Color.GRAY); //change color
	    graphics.fill(hex); //create the shape and fill the color
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(pause != true){
			hexRotation();
			repaint();
		}
	}
	
	private void hexRotation(){
		if(turn > 0){
			if(left == true){
				rotation -= 3;
			}
			else{
				rotation += 3;
			}
			turn -= 3;
		}
	}
}
