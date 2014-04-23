import java.util.ArrayList;

public class Rook extends Piece {
	
	public Rook(Space s, Boolean isBlack) {
		super(s, isBlack);
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Space>();

		if (super.getSpace().adjSouth().getPiece() == null) {
			locs.add(super.getSpace().adjSouth());
		}
		if (super.getSpace().adjNorth().getPiece() == null) {
			locs.add(super.getSpace().adjNorth());
		}
		// if (super.getSpace().adj)
		// 
		return locs;
	}
}