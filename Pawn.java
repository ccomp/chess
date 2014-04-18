import java.util.ArrayList;

public class Pawn extends Piece {

	public Pawn(Space s, Boolean isBlack){
		super(s, isBlack);	
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Space>();
		if (isBlack()) {
		 	if (super.getSpace().adjNorth().hasPiece() == false) {
		 		locs.add(super.getSpace().adjNorth());
		 	}

		 	if (super.getSpace().adjNorthEast().hasPiece()) {
		 		for (Piece p: pieces) {
		 			if (p.getSpace() ==  super.getSpace().adjNorthEast() && p.isBlack() == false) {
		 				locs.add(super.getSpace().adjNorthEast());
		 			}
		 		}
		 	}

		 	if (super.getSpace().adjNorthWest().hasPiece()) {
		 		for (Piece p: pieces) {
		 			if (p.getSpace() ==  super.getSpace().adjNorthWest() && p.isBlack() == false) {
		 				locs.add(super.getSpace().adjNorthWest());
		 			}
		 		}
		 	}
		} else {

			if (super.getSpace().adjSouth().hasPiece() == false) {
				locs.add(super.getSpace().adjSouth());
			}

			if (super.getSpace().adjSouthEast().hasPiece()) {
				for (Piece p: pieces) {
					if (p.getSpace() ==  super.getSpace().adjSouthEast() && p.isBlack()) {
						locs.add(super.getSpace().adjSouthEast());
					}
				}
			}

			if (super.getSpace().adjSouthWest().hasPiece()) {
				for (Piece p: pieces) {
					if (p.getSpace() ==  super.getSpace().adjSouthWest() && p.isBlack()) {
						locs.add(super.getSpace().adjSouthWest());
					}
				}
			}
		}

		return locs;
	}
}