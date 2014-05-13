import java.util.ArrayList;

public class Knight extends Piece {

	public Knight(Space s, Boolean isBlack){
		super(s, isBlack);	
	}

	public ArrayList<Space> getMoveLocations() {
		
		int x = getSpace().getX();
		int y = getSpace().getY();

		ArrayList<Location> locs = new ArrayList<Location>();

		Location here = getSpace();

			if (getSpace().adjNorth().adjNorth().adjEast().getPiece() != null) {
				if(getLocation().adjNorth().adjNorth().adjEast().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjNorth().adjNorth().adjEast());
				}
			}

			if (getSpace().adjNorth().adjNorth().adjWest().getPiece() != null) {
				if (getLocation().adjNorth().adjNorth().adjWest().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjNorth().adjNorth().adjWest());
				}
			}

			if (getSpace().adjNorth().adjEast().adjEast().getPiece() != null) {
				if (getLocation().adjNorth().adjEast().adjEast().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjNorth().adjEast().adjEast());
				}
			}

			if (getSpace().adjSouth().adjEast().adjEast().getPiece() != null) {
				if (getLocation().adjSouth().adjEast().adjEast().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjSouth().adjEast().adjEast());
				}
			}

			if (getSpace().adjNorth().adjWest().adjWest().getPiece() != null) {
				if (getLocation().adjNorth().adjWest().adjWest().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjNorth().adjWest().adjWest());
				}
			}

			if (getSpace().adjSouth().adjWest().adjWest().getPiece() != null) {
				if (getLocation().adjSouth().adjWest().adjWest().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjSouth().adjWest().adjWest());
				}
			}

			if (getSpace().adjSouth().adjSouth().adjEast().getPiece() != null) {
				if (getLocation().adjSouth().adjSouth().adjEast().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjSouth().adjSouth().adjEast());
				}
			}

			if (getSpace().adjSouth().adjSouth().adjWest().getPiece() != null) {
				if (getLocation().adjSouth().adjSouth().adjWest().getPiece().isBlack() != isBlack) {
					locs.add(getLocation().adjSouth().adjSouth().adjWest());
				}
			}

		return locs;
	}
}