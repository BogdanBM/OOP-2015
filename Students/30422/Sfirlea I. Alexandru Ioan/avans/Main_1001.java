
public class Main_1001 {

	public static void main(String[] args) {
		int i;
		PieceHolder.storePiece(PieceHolder.hold);
		int[][] a = new int[][] { { 3, 1, 0, 1, 1, 1, 1, 2, 1, 1 }, 
								  { 3, 0, 5, 5, 5, 1, 1, 2, 1, 1 },
								  { 1, 0, 1, 0, 5, 1, 2, 1, 1, 1 },
								  { 1, 1, 1, 1, 1, 4, 1, 5, 1, 1 },
								  { 1, 0, 1, 0, 1, 1, 1, 0, 1, 0 },
								  { 3, 1, 0, 1, 1, 1, 1, 2, 0, 1 },
								  { 3, 0, 5, 5, 5, 1, 1, 2, 1, 1 }, 
								  { 0, 1, 0, 0, 5, 1, 3, 2, 1, 1 },
								  { 0, 1, 0, 1, 0, 4, 1, 5, 1, 1 },
								  { 0, 1, 0, 0, 1, 1, 1, 2, 1, 0 } };

		int score = 0;
		
		score=BackMatrix.deleteMatrix(a, score);
		for (i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("scorul este: " + score);

		Piece[] randomPiece = new Piece[3];
		PieceHolder.generatePieces(randomPiece);
		for (i = 0; i < 3; i++) {
			Piece.printPiece(randomPiece[i]);
		}
		if (BackMatrix.gameOver(randomPiece, a) == true) {
			BackMatrix.movePiece(a , randomPiece);
			for (i = 0; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			

		} else
			System.out.println("game over");
	}

}
