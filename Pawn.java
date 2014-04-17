import java.util.ArrayList;

public class Pawn extends Piece {

	public Pawn(Space s, Boolean isBlack){
		super(s, isBlack);	
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Piece>();
		if (isBlack()) {
		 	if (super.getSpace().adjNorth().hasPiece() == false) {
		 		locs.add(super.getSpace.adjNorth);
		 	}

		 	if (super.getSpace().adjNorthEast().hasPiece() && super.getSpace().adjNorthEast().)
		}
	}
}