package procrateredAssesment.com.tcs;
import java.util.*;
public class OpaTestSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OpaTest oo[] = new OpaTest[4];
		
		for(int i=0; i<oo.length; i++) {
			int playerId = sc.nextInt(); sc.nextLine();
			String skill = sc.nextLine();
			String level = sc.nextLine();
			int points = sc.nextInt(); sc.nextLine();
			
			oo[i] = new OpaTest(playerId, skill, level, points);
		}
		
		String skill_1 = sc.nextLine().toLowerCase();
		String level_1 = sc.nextLine().toLowerCase();
		
		sc.close();
		
		int skillMatch = findPointsForGivenSkill(oo, skill_1);
		
		if(skillMatch>0) {
			System.out.println(skillMatch);
		}
		else {
			System.out.println("The given skill is not available");
		}
		
		int ss[] = GetPlayerBasedOnLevel(oo, skill_1, level_1);
		
		 	for(int i=0; i<ss.length; i++) {
		 		if(ss[i]>0) {
		 			System.out.println(ss[i]);
		 		}
		 		else {
System.out.println("No player is available with specified level, skill and eligiblity points");
		 		}
		 	}
		
		}
	
	
		public static int findPointsForGivenSkill(OpaTest a[], String sk) {
			int c=0; 
			for(int i=0; i<a.length; i++) {
				if(a[i].getSkill().equals(sk)) {
					c++;
				}
			}	
			int ans=0;
			for(int i=0; i<c; i++) {
				if(a[i].getSkill().equals(sk)) {
					ans = ans + a[i].getPoints();
				}
			}
			return ans;
		}
		
	
		public static int[] GetPlayerBasedOnLevel(OpaTest b[], String sk, String le) {
			int cc=0;
			
			
			for(int i=0; i<b.length; i++) {
				if(b[i].getSkill().equals(sk) && b[i].getLevel().equals(le)) {
					cc++;
				}
			}
			
			
			int ans1[] = new int[cc];
			int r=0;
			for(int i=0; i<b.length; i++) {
				if((b[i].getSkill().equals(sk)) && (b[i].getLevel().equals(le) && 
						b[i].getPoints()>=20)) {
					
					ans1[r] = b[i].getPlayerId();
					r++;
			}
			}
		return ans1;
}
		
}