import java.awt.EventQueue;

public class Hextris {

	public static void main(String[] args){//
		if(args.length == 0){//if this is a brand new game 
			runGame();//create a new game
		}
		else{//otherwise
			runGame();
		}
	}
	
	private static void runGame(){//creates the runnable to start the game
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				hextrisView hV = new hextrisView();//initializes the view for the new game
				hextrisController hC = new hextrisController();//initalizes the controller for the new game
			}
			
		});
	}
	
}
