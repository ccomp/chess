import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.util.ArrayList;

public class Pawn extends Piece {

	private String clicker = "notClickedPawn";

	public Pawn(Space s, Boolean isBlack){
		super(s, isBlack);	
	}

	public void draw(Graphics2D g){
		g.drawString(clicker, x + 20, y + 20);
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Space>();
		if (isBlack()) {
		 	if (super.getSpace().adjSouth().getPiece() == null) {
		 		locs.add(super.getSpace().adjSouth());
		 	}

		 	if (super.getSpace().adjSouthEast().getPiece().isBlack() == false) {
		 		locs.add(super.getSpace().adjSouth());
		 	}

		 	if (super.getSpace().adjSouthWest().getPiece().isBlack() == false) {
		 		locs.add(super.getSpace().adjSouth());
		 	}

		} else {

			if (super.getSpace().adjNorth().getPiece() == null) {
				locs.add(super.getSpace().adjNorth());
			}

			if (super.getSpace().adjNorthWest().getPiece().isBlack() == true) {
				locs.add(super.getSpace().adjNorthWest());
			}

			if (super.getSpace().adjNorthEast().getPiece().isBlack() == true) {
				locs.add(super.getSpace().adjNorthEast());
			}
		}

		return locs;
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
