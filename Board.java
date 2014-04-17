import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Board {


private ArrayList<Space> spaces = new ArrayList<Space>();

	public Board(){
		init();
	}	

public void init(){
spaces = makeSpaces();
}

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
	g.drawString("this works", 100, 100);
}

}
