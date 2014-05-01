import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Board {


private static ArrayList<Space> spaces = new ArrayList<Space>();
private static Piece p;
private static Rectangle mouseRec;
private static int ready = 0;

private static int mx=0, my=0;
private ArrayList<Piece> pieces = new ArrayList<Piece>();

	public Board(){
		init();
		mouseRec = new Rectangle(mx, my, 10, 10); 
	}	

	public void printSpace(Space s) {
		System.out.println(s.getRow() + " " + s.getCol());
	}


public void init(){
spaces = makeSpaces();

p = new Piece(spaces.get(1), false);
p.init();
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
		mouseRec = new Rectangle(mx, my, 10, 10); 
		System.out.println(ready);
		p.update();
}

public ArrayList<Piece> getPieces() {
	return pieces;
}

public void draw(Graphics2D g){
		
	for (int i = 0; i < spaces.size(); i++) {
		Space s = spaces.get(i);
		s.draw(g);
	}
	p.draw(g);
	g.fillRect(mx, my, 10, 10);
}

public static void ready(){
	if(ready == 0){
		ready++;
		System.out.println(ready);
	}	
}

public static void notReady(){
	if(ready == 1){
		ready = 0;
		System.out.println(ready);
	}	

}

public static void moveTo(Piece np, Space s){
	np.setPosition(s.getX(), s.getY());	
}

    public static void mousePressed(MouseEvent e) {

    }

    public static void mouseReleased(MouseEvent e) {

    }

    public static void mouseEntered(MouseEvent e) {

    }

    public static void mouseExited(MouseEvent e) {

    }

    public static void mouseClicked(MouseEvent e) {
	mx = e.getX();
	my = e.getY();
	if(ready == 0){	
       		if(mouseRec.intersects(p.getRectangle())){
        		p.clicked();
        		ready();
		}
	}
	if(ready > 0){	
       		if(!mouseRec.intersects(p.getRectangle())){
        		p.unclicked();
        		notReady();
			for(int i = 0; i < spaces.size(); i++){
				Space s = spaces.get(i);
				if(mouseRec.intersects(s.getRectangle())){
					moveTo(p, s); 
				}	
			}
	    }
	}
    }
}
