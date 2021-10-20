package FootballPlayer;

public class FootballPlayer {
	short no;
	String name;
	boolean inPlay;
	int minutes;
	int numberOfGoals;
	
	void play(int minutesToPlay) {
		minutes += minutesToPlay;
	}
	
	void score() {
		numberOfGoals++;
	}
}
