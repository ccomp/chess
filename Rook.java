import java.util.ArrayList;

public class Rook extends Piece {
	
	public Rook(Space s, Boolean isBlack) {
		super(s, isBlack);
	}

	public void init(){
		printValids();
	}

	public void printValids(){
		System.out.println("cur row col " + getRow() + " " + getCol());
		for(int i = 0; i < getMoveLocations().size(); i++){
			Space s = getMoveLocations().get(i);
			System.out.println("Row " + s.getRow() + "Col" + s.getCol());
		}	
	}

	public ArrayList<Space> getMoveLocations() {
		ArrayList<Space> locs = new ArrayList<Space>();
		Space here = super.getSpace();

		for(int i = 0; i < 8; i++){
			Space s;
			s = new Space(getRow(), i);
			locs.add(s);
		}
		for(int i = 0; i < 8; i++){
			Space s;
			s = new Space(i, getCol());
			locs.add(s);
		}

		return locs;
	}
}
