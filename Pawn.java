import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;

public class Pawn extends Piece {

	private String clicker = "notClickedPawn";

	public Pawn(Space s, Boolean isBlack){
		super(s, isBlack);	
	}

	public void init(){
		printValids();
	}

	public void draw(Graphics2D g){
		g.drawString(clicker, x + 20, y + 20);
	}

	public void printValids(){
		System.out.println("cur row col " + getRow() + " " + getCol());
		for(int i = 0; i < getMoveLocations().size(); i++){
			Space s = getMoveLocations().get(i);
			System.out.println("Row " + s.getRow() + "Col" + s.getCol());
		}	
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Space>();
		if (isBlack()) {
		 	if (getSpace().adjSouth().getPiece() == null) {
		 		locs.add(getSpace().adjSouth());
		 	}


		 	if (getSpace().adjSouthEast().getPiece() != null) {
		 		if (!getSpace().adjSouthEast().getPiece().isBlack()) {
		 			locs.add(getSpace().adjSouth());
		 		}
			}
		 	if (getSpace().adjSouthWest().getPiece() != null) {
				if (!getSpace().adjSouthWest().getPiece().isBlack()) {
					locs.add(getSpace().adjSouth());
				}
			}

			if (getSpace().getX() == 1) {
				locs.add(getSpace().adjSouth().adjSouth());
			}

		} else {

			if (getSpace().adjNorth().getPiece() == null) {
				locs.add(getSpace().adjNorth());
			}

		 	if (getSpace().adjNorthEast().getPiece() != null) {
				if (getSpace().adjNorthEast().getPiece().isBlack() == true) {
					locs.add(getSpace().adjNorthEast());
				}
			}

		 	if (getSpace().adjNorthWest().getPiece() != null) {
				if (getSpace().adjNorthWest().getPiece().isBlack()) {
					locs.add(getSpace().adjNorthWest());
				}			
			}

			if (getSpace().getX() == 6) {
					locs.add(getSpace().adjNorth().adjNorth());
				}	
		}
		return locs;
	}

		public boolean isValid(Space s){
			if(s.getRow() == getRow() - 1){
				if(s.getCol() == getCol()){
					return true;
				}	
			}
			return false;
		}

		public void update(){
		 collider = new Rectangle(x, y, 80, 80);
		}

		public void clicked(){
			clicker = "clickedPawn";
		}	
		public void unclicked(){
			clicker = "unclickedPawn";
		}	

		

	}
