import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;

public class Space {

	private int row, col;
	private int x, y;
	private boolean hasPiece;
	private ArrayList<Piece> pieces = new ArrayList<Piece>();	
	private Rectangle collider;

	public Space(int col, int row) {
		this.row = row;
		this.col = col;
		x = row * 80;
		y = col * 80;
		hasPiece = false;
		collider = new Rectangle(x, y, 80, 80);

	}

	public void init(){
		
	}

	public Piece getPiece() {
		for (Piece p : pieces) {
			if (p.getSpace() == this) {
				return p;
			}
		}
			return null;
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
	
	public Rectangle getRectangle(){
		return collider;
	}

	public boolean isEqual(Space s){
		if(row == s.getRow() && col == s.getCol()){
			return true;
		}
		return false;
	}	

	public void draw(Graphics2D g){
		g.setColor(Color.white);
		g.drawString("" + row + col , x, y + 10);	
	}
	public Space adjNorth() {
		if (getRow() !=0) {
			Space update = new Space(getCol(), getRow()-1);
			return update;
		} else {
			return null;
		}
		
	}

	public Space adjDeg(int deg) {
		if (deg == 0) {
			return adjEast();
		}

		if (deg == 45) {
			return adjNorthEast();
		}

		if (deg == 90) {
			return adjNorth();
		}

		if (deg == 135) {
			return adjNorthWest();
		}

		if (deg == 180) {
			return adjWest();
		}

		if (deg == 225) {
			return adjSouthWest();
		}

		if (deg == 270) {
			return adjSouth();
		}

		if (deg == 315) {
			return adjSouthEast();
		} else {
			return null;
		}

			
		
	}

	public Space adjNorthEast() {
		if (getRow() == 0 || getCol()==7) {
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


}
