import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;

public class Piece {
		Space s;
		Boolean isBlack;
		protected int x, y;
		protected Rectangle collider;
		private String clicker = "I'm a Piece nigguh!!!";
		private String printed = "";
		protected String name;
		private ArrayList<Space> locs;
		
		
	public Piece(Space s, boolean isBlack) {
		this.s = s;		
		this.isBlack = isBlack;
		x = s.getX();
		y = s.getY();
	}

	public void move(Space loc) {
		for (Space l: this.locs) {
				if (loc.equals(l)) {
					if (loc.getPiece() != null) {
						setSpace(loc);
					}
			
			} else if (loc.getPiece().isBlack() != isBlack) {
				Piece temp = loc.getPiece();
				GamePanel.getBoard().getPieces().remove(loc.getPiece());
				GamePanel.getBoard().getPieces().add(temp);
				setSpace(loc);
			}
		}
	}

	public ArrayList<Space> getMoveLocations(){
		ArrayList<Space> spaces = new ArrayList<Space>();
		System.out.println("Wrong one");
		return spaces;
	}	
	
	public void init(){
		collider = new Rectangle(x, y, 80, 80);
		if(isBlack){
			printed += "black ";
		}else{
			printed += "white ";
		}

		printed += name;

	}

	public void update(){
		collider = new Rectangle(x, y, 80, 80);
	}

	public ArrayList<Space> getLocs() {
		return locs;
	}

	public Space getSpace(){
		return s;
	}

	public void setSpace(Space sNew) {
		s = sNew;
	}

	public int getRow(){
		return x / 80;
	}

	public int getCol(){
		return y / 80;
	}

	public void setPosition(int nx, int ny){
		x = nx;
		y = ny;
	}

	public Boolean isBlack() {
		return this.isBlack;
	} 

	public void draw(Graphics2D g){
		g.drawString(clicker, x + 20, y + 20);
//		g.fillRect(x, y, 80, 80);
	}

	public Rectangle getRectangle(){
		return collider;
	}

	public void clicked(){
		clicker = "clicked";
	}	
	public void unclicked(){
		clicker = name;
	}	
}

