package procrateredAssesment.com.tcs;

public class OpaTest {
	private int playerId;
	private String skill;
	private String level;
	private int points;
	
	public OpaTest(int playerId, String skill, String level, int points) {
		super();
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
}
