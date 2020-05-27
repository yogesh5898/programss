package procrateredAssesment.com.tcs;

public class Player {
	private int playerId;
	private String playerName;
	private int iccRank;
	private int noOfMatchPlayed;
	private int totalRunsScored;
	
	public Player(int playerId, String playerName, int iccRank, int noOfMatchPlayed, int totalRunsScored) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.iccRank = iccRank;
		this.noOfMatchPlayed = noOfMatchPlayed;
		this.totalRunsScored = totalRunsScored;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getIccRank() {
		return iccRank;
	}

	public void setIccRank(int iccRank) {
		this.iccRank = iccRank;
	}

	public int getNoOfMatchPlayed() {
		return noOfMatchPlayed;
	}

	public void setNoOfMatchPlayed(int noOfMatchPlayed) {
		this.noOfMatchPlayed = noOfMatchPlayed;
	}

	public int getTotalRunsScored() {
		return totalRunsScored;
	}

	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	
	

}
