package procrateredAssesment.com.tcs;
import java.util.*;
public class playerSolution {
	public static void main(String[] args) {
		
		Player players[] = new Player[4];
		int target;
		
	Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<players.length; i++) {
			int playerId = sc.nextInt(); sc.nextLine();
			String playerName = sc.nextLine();
			int iccRank = sc.nextInt(); sc.nextLine();
			int noOfMatchPlayed = sc.nextInt(); sc.nextLine();
			int totalRunsScored = sc.nextInt(); sc.hasNextLine();
			
	players[i] = new Player(playerId, playerName, iccRank, noOfMatchPlayed,
											totalRunsScored);
		}
		target = sc.nextInt();
		sc.close();
		
		double newPlayers[] = findAverageScoreOfPlayers(players ,target);
		
		for(int i=0; i<newPlayers.length; i++) {
			if(newPlayers[i]>=80.0) {
				System.out.println("Grade A Player");
			}
			else if(newPlayers[i]>=50.0 && newPlayers[i]<=79.0) {
				System.out.println("Grade B Player");
			}
			else {
				System.out.println("Grade C Player");
			}
			}
		}
		
		private static double[] findAverageScoreOfPlayers(Player players[], int target) {
			int count=0;
			for(int i=0; i<players.length; i++) {
				if(players[i].getNoOfMatchPlayed()>=target) {
					count++;
				}
			}
			
			double avgRunRateArray[] = new double[count];
			
			for(int i=0; i<players.length; i++) {
				if(players[i].getNoOfMatchPlayed()>=target) {
	avgRunRateArray[i] = Double.valueOf(players[i].getTotalRunsScored() / players[i].getNoOfMatchPlayed());
				}
			}
		return avgRunRateArray;
	}
}
