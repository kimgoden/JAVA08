package project09;
class Brother implements myBrother {

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("플레이 게임");
	}

	@Override
	public void playSports() {
		// TODO Auto-generated method stub
		System.out.println("플레이 운동");
	}

	@Override
	public void playChess() {
		// TODO Auto-generated method stub
		System.out.println("플레이 체스");
	}
	
	
}
public class Brother_MAIN {
public static void main(String[] args) {
	Brother bro1 = new Brother();
	bro1.playGame();
	bro1.playSports();
	bro1.playChess();
	System.out.println("-------------------------");
	oldBrother bro2 = new Brother();
	bro2.playGame();
    System.out.println("-------------------------");
    littleBrother bro3 = new Brother();
    bro3.playSports();
    System.out.println("-------------------------");
    Brother bro4 = new Brother();
    bro4.playGame();
	bro4.playSports();
	bro4.playChess();

}
}
