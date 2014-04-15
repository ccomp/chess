public class Space {

	private int x, y;

	public Space(int row, int col) {
		int row = this.row;
		int col = this.col;
		x = row * 80;
		y = col * 80;
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	public void setRow(int rowNew) {
		row = rowNew;
	}

	public void setCol(int colNew) {
		col = colNew;
	}

	public void draw(Graphics2D g){

		g.drawString("Space", x, y);	

		System.out.println(row, " ", col);
	}

}
