public class Piece {
		Space s;
		Boolean isBlack;
		
	public Piece(Space s, Boolean isBlack) {
		this.s = s;		
		this.isBlack = isBlack;
	}

	public void setSpace(Space sNew) {
		s = sNew;
	}

	public Space getSpace() {
		return s;
	}

	public Boolean isBlack() {
		return this.isBlack;
	} 
}