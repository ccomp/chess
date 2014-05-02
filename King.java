import java.util.ArrayList;

public class King extends Piece {

	private Boolean hasCastled;

	public King(Space s, Boolean isBlack){
		super(s, isBlack);	
		hasCastled = false;
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

			Space binit = new Space(4,7);
			Space brs1 = new Space(0,0);
			Space brs2 = new Space(7,0);

			if (getSpace.isEqual(binit)) {

				if (pieces.indexOf(Rook bRook1) != -1) {
					brIndex = pieces.indexOf(Rook bRook1);
					if (brs1.isEqual(pieces.get(brIndex).getSpace())) {
						locs.add(bcl1);
					}				
				}

				if (pieces.indexOf(Rook bRook2) != -1) {
					brIndex2 = pieces.indexOf(Rook bRook2);
					if (brs2.isEqual(pieces.get(brIndex2).getSpace())) {
						locs.add(bcl2);
					}
				}
			}		
		}

		if (isBlack() == false) {

			Space winit = new Space(4,7);
			Space wrs1 = new Space(0,7);
			Space wrs2 = new Space(7,7);

			if (getSpace.isEqual(winit)) {

				if (pieces.indexOf(Rook wRook1) != -1) {
					wrIndex = pieces.indexOf(Rook wRook1);
					if (wrs1.isEqual(pieces.get(wrIndex).getSpace())) {
						locs.add(wcl1);
					}				
				}

				if (pieces.indexOf(Rook wRook2) != -1) {
					wrIndex2 = pieces.indexOf(Rook wRook2);
					if (wrs2.isEqual(pieces.get(wrIndex2).getSpace())) {
						locs.add(wcl2);
					}
				}
			}		
		}
	return locs;
	}
}
