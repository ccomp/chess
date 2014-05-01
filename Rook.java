import java.util.ArrayList;

public class Rook extends Piece {
	
	public Rook(Space s, Boolean isBlack) {
		super(s, isBlack);
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Space>();

		for (int i = 0; i < (super.getSpace().adjSouth()); i++) {
			if (super.getSpace().adjSouth().getPiece().isBlack() == null) {
				locs.add(super.getSpace().adjSouth());
			}
		}

		for (int i = 0; i < (super.getSpace().adjNorth()); i++) {
			if (super.getSpace().adjNorth().getPiece().isBlack() == null) {
				locs.add(super.getSpace().adjNorth());
			}
		}

		// if (super.getSpace().adj)
		// 
		return locs;
	}
}