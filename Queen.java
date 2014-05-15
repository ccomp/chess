import java.util.ArrayList;

public class Queen extends Piece {

	public Queen(Space s, Boolean isBlack){
		super(s, isBlack);	
	}

	public ArrayList<Space> getMoveLocations() {
		Space here = getSpace();
		ArrayList<Space> locs = new ArrayList<Space>();

		for (int r=0; r<315; r+=45) {
			while (here.adjDeg(r) != null) {
				if (here.adjDeg(r).getPiece() == null) {
					locs.add(here.adjDeg(r));
					here = here.adjDeg(r);
				} else if (here.adjDeg(r).getPiece().isBlack() != isBlack) {
					locs.add(here.adjDeg(r));
					break;
				} else {
					break;
				}
				
			}
		}

		return locs;
	}

}