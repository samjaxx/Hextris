import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class hextrisView {
	
	JFrame newGame = new JFrame("Hextris");
	graphicSettings gS = new graphicSettings();
	hexagon h = new hexagon();
	
	public hextrisView(){
		setFrame(newGame);
		startGame(newGame);
		addListeners(newGame);
		//System.out.println("hV");
	}
	
	private void setFrame(JFrame frame){	//setting the frame
		frame.setPreferredSize(new Dimension(1280, 720));	//set size of the game window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.pack();	// Display the window
		frame.setVisible(true);		// Set visibility to be true
		frame.setResizable(false);	//window cannot be resized
	}
	
	private void startGame(JFrame frame){
		gS.t.start();
		h.createHex();
		gS.addHex(h.bgHex, h.hex);
		frame.add(gS);
	}
	
	private void addListeners(JFrame frame){ //listens for left or right action
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==80){//when the p key is released
					System.out.println("pause");
					gS.pause = !gS.pause;//pause the game
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				if(gS.turn <= 0 && gS.pause == false){ //make sure the hex isn't already rotating
					if(e.getKeyCode()==37){ //if left is pushed
						gS.left = true; //choose left
						gS.turn = 60;
						System.out.println(gS.left);
					}
					else if(e.getKeyCode()==39){ //if right is pushed
						gS.left = false; //choose right
						gS.turn = 60;
						System.out.println(gS.left);
					}
				}
			}
		});
	}
}