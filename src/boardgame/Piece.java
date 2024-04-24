package boardgame;

public class Piece {

	protected Position position; //se nao atribuir nada a ela incialmente, por padrao é null
	private Board board;

	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}


	protected Board getBoard() {
		return board;
	}

	
	
}
