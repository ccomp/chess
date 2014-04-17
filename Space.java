import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class Space {

	private int row, col;
	private int x, y;

	public Space(int row, int col) {
		row = this.row;
		col = this.col;
		x = row * 80;
		y = col * 80;
	}

	public void init(){
		System.out.println(row + " " + col);
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	public void setRow(int rowNew) {
		row = rowNew;
	}

	public void setCol(int colNew) {
		col = colNew;
	}

	public void draw(Graphics2D g){

		g.drawString("Space", x, y);	

		
	}

}
