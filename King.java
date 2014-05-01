import java.util.ArrayList;

public class King extends Piece {

	private Boolean hasCastled;

	public King(Space s, Boolean isBlack){
		super(s, isBlack);	
		hasCastled == false;
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs= new ArrayList<Space>();
		Space here = super.getSpace();

		Space bcl1 = new Space(2,0);
		Space bcl2 = new Space(6,0);
		Space wcl1 = new Space(2,7);
		Space wcl2 = new Space(6,7);

		for (int i=0; i<=315; i+=45) {
			if (here.adjDeg(i).getPiece() == null || here.adjDeg(i).getPiece().isBlack() != isBlack) {
				locs.add(here.adjDeg(i));
			}
		}

		if (isBlack()) {

			if (here.isEqual(bcl1) == true) {
				locs.add(bcl1);
			}

			if (here.isEqual(bcl2) == true) {
				locs.add(bcl2);
			}				
		}

		if (isBlack() == false) {
			if (here.isEqual(wcl1)) {
				locs.add(wcl1);
			}

			if (here.isEqual(wcl2)) {
				locs.add(wcl2);
			}
		}

	}
}