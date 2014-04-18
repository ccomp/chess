import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Board {


private ArrayList<Space> spaces = new ArrayList<Space>();
private Piece p;

	public Board(){
		init();
	}	

	public void printSpace(Space s) {
		System.out.println(s.getRow() + " " + s.getCol());
	}


public void init(){
spaces = makeSpaces();
<<<<<<< HEAD
=======
p = new Piece(spaces.get(1), false);
}
>>>>>>> 4546cb29043f665643f07d7f7c25bd7dd03961d5

public ArrayList<Space> makeSpaces(){

Space space;
ArrayList<Space> spaces = new ArrayList<Space>();
	for(int x = 0; x <= 7; x++){
		for(int y = 0; y <= 7; y++){
			space = new Space(x, y);
			space.init();		
			spaces.add(space);
	}
	
		
	}
	return spaces;

}

public void update(){

}

public void draw(Graphics2D g){
	
	for (int i = 0; i < spaces.size(); i++) {
		Space s = spaces.get(i);
		s.draw(g);
	}
	p.draw(g);
}

}
