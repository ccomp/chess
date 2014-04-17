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

	public void draw(Graphics2D g){

		g.drawString("Space", x, y);	

		
	}

	public Space adjNorth(Space s) {
		if (s.getRow() !=0) {
			Space update = new Space(s.getCol(), s.getRow()-1);
			return update;
		} else {
			return null;
		}
		
	}

	public Space adjNorthEast(Space s) {
		if (s.getRow() == 0 || s.getCol()==7) {
			return null;
		}
		Space update = new Space(s.getCol()+1, s.getRow()-1);
		return update;
	}

	public Space adjEast(Space s) {
		if (s.getCol()==7) {
			return null;
		}
		Space update = new Space(s.getCol()+1, s.getRow());
		return update;
	}

	public Space adjSouthEast(Space s) {
		if (s.getRow()==7 || s.getCol()==0) {
			return null;
		}
		Space update = new Space(s.getCol()+1, s.getRow()+1);
		return update;
	}

	public Space adjSouth(Space s) {
		if (s.getRow()==7) {
			return null;
		}
		Space update = new Space(s.getCol(), s.getRow()+1);
		return update;
	}

	public Space adjSouthWest(Space s) {
		if (s.getRow() ==7 || s.getCol() == 0) {
			return null;
		}
		Space update = new Space(s.getCol()-1, s.getRow()+1);
		return update;
	}

	public Space adjWest(Space s) {
		if (s.getCol() == 0) {
			return null;
		}
		Space update = new Space(s.getCol()-1, s.getRow());
		return update;
	}

	public Space adjNorthWest(Space s) {
		if (s.getRow()== 0 || s.getCol() == 0) {
			return null;
		}
		Space update = new Space(s.getCol()-1, s.getRow()-1);
		return update;
	}

}
