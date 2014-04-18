import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class Piece {
		Space s;
		Boolean isBlack;
		private int x, y;
		
	public Piece(Space s, Boolean isBlack) {
		this.s = s;		
		this.isBlack = isBlack;
		x = s.getX();
		y = s.getY();
	}

	public void setSpace(Space sNew) {
		s = sNew;
	}

	public Space getSpace() {
		return s;
	}

	public Boolean isBlack() {
		return this.isBlack;
	} 

	public void draw(Graphics2D g){
		g.drawString("I'm a piece!!", x + 20, y + 20);
	}

}