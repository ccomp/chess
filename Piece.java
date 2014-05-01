import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class Piece {
		Space s;
		Boolean isBlack;
		private int x, y;
		public Rectangle collider;
		private String clicker = "I'm a Piece nigguh!!!";
		
		
	public Piece(Space s, Boolean isBlack) {
		this.s = s;		
		this.isBlack = isBlack;
		x = s.getX();
		y = s.getY();
	}

	public void init(){
		collider = new Rectangle(x, y, 80, 80);
	}

	public void update(){
	 collider = new Rectangle(x, y, 80, 80);
	}

	public void setSpace(Space sNew) {
		s = sNew;
	}

	public void setPosition(int nx, int ny){
		x = nx;
		y = ny;
	}

	public Space getSpace() {
		return s;
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
		clicker = "I'm a Nigguh 2.0!!!";
	}	
}

