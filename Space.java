import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class Space {

	private int row, col;
	private int x, y;
	private boolean hasPiece;
	

	public Space(int col, int row) {
		this.row = row;
		this.col = col;
		x = row * 80;
		y = col * 80;
		hasPiece = false;

	}

	public void init(){
		
	}

	public boolean hasPiece() {
		return hasPiece;
	}

	public void pieceUpdate(Boolean b) {
		hasPiece = b;
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

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	

	public Space adjNorth() {
		if (getRow() !=0) {
			Space update = new Space(getCol(), s.getRow()-1);
			return update;
		} else {
			return null;
		}
		
	}

	public Space adjNorthEast() {
		if (getRow() == 0 || s.getCol()==7) {
			return null;
		}
		Space update = new Space(getCol()+1, getRow()-1);
		return update;
	}

	public Space adjEast() {
		if (getCol()==7) {
			return null;
		}
		Space update = new Space(getCol()+1, getRow());
		return update;
	}

	public Space adjSouthEast() {
		if (getRow()==7 || getCol()==0) {
			return null;
		}
		Space update = new Space(getCol()+1, getRow()+1);
		return update;
	}

	public Space adjSouth() {
		if (getRow()==7) {
			return null;
		}
		Space update = new Space(getCol(), getRow()+1);
		return update;
	}

	public Space adjSouthWest() {
		if (getRow() ==7 || getCol() == 0) {
			return null;
		}
		Space update = new Space(getCol()-1, getRow()+1);
		return update;
	}

	public Space adjWest() {
		if (getCol() == 0) {
			return null;
		}
		Space update = new Space(getCol()-1, getRow());
		return update;
	}

	public Space adjNorthWest() {
		if (getRow()== 0 || getCol() == 0) {
			return null;
		}
		Space update = new Space(getCol()-1, getRow()-1);
		return update;
	}


	public void draw(Graphics2D g){
		g.setColor(Color.white);
		g.drawString("" + row + col , x, y + 10);	
	}
}
