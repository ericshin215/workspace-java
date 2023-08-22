package kr.co.himedia.templatemethod02;

public class PlayerTest {
	
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		
		PlayerLevel player2 = new IntermediateLevel();
		player.setLevel(player2);
		player.play(2);
		
		PlayerLevel player3 = new AdvancedLevel();
		player.setLevel(player3);
		player.play(3);
	}

}
