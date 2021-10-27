package project09;

public interface oldBrother {
void playGame();
}

interface littleBrother {
	void playSports();
}
interface myBrother extends oldBrother, littleBrother  {
	void playChess();
}