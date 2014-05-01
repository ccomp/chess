import java.util.ArrayList;

public class Bishop extends Piece {
	
	public Bishop(Space s, Boolean isBlack) {
		super(s, isBlack);
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Space>();
		Space here = super.getSpace();

		for (int i = 0; i<=315; i+=45) {
			while (here.adjDeg(i).getPiece() == null || here.adjDeg(i).getPiece().isBlack() != isBlack) {
				locs.add(here.adjDeg(i));
			}
		}

		return locs;
	}
}