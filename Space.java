import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class Space {

	private int row, col;
	private int x, y;
	

	public Space(int col, int row) {
		this.row = row;
		this.col = col;
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

	

	public Space adjNorth() {
		if (this.row !=0) {
			Space update = new Space(this.col, this.row-1);
			return update;
		} else {
			return null;
		}
		
	}

	public Space adjNorthEast() {
		if (this.row == 0 || this.col==7) {
			return null;
		}
		Space update = new Space(this.col+1, this.row-1);
		return update;
	}

	public Space adjEast() {
		if (this.col==7) {
			return null;
		}
		Space update = new Space(this.col+1, this.row);
		return update;
	}

	public Space adjSouthEast() {
		if (this.row==7 || this.col==0) {
			return null;
		}
		Space update = new Space(this.col+1, this.row+1);
		return update;
	}

	public Space adjSouth() {
		if (this.row==7) {
			return null;
		}
		Space update = new Space(this.col, this.row+1);
		return update;
	}

	public Space adjSouthWest() {
		if (this.row ==7 || this.col == 0) {
			return null;
		}
		Space update = new Space(this.col-1, this.row+1);
		return update;
	}

	public Space adjWest() {
		if (this.col == 0) {
			return null;
		}
		Space update = new Space(this.col-1, this.row);
		return update;
	}

	public Space adjNorthWest() {
		if (this.row == 0 || this.col == 0) {
			return null;
		}
		Space update = new Space(this.col-1, this.row-1);
		return update;
	}
	public void draw(Graphics2D g){
		g.setColor(Color.white);
		g.drawString("" + row + col , x, y);	

		
	}
}
