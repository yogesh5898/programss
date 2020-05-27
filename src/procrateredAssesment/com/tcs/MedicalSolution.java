package procrateredAssesment.com.tcs;
import java.util.*;
public class MedicalSolution {
	public static void main(String[] args) {
			
		Medical medical[] = new Medical[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<medical.length; i++) {
			String name = sc.nextLine();
			String disease = sc.nextLine();
			String tablet = sc.nextLine();
			int cost = sc.nextInt(); sc.nextLine();
			
		medical[i] = new Medical(name, disease, tablet, cost);
		}
		String match = sc.nextLine();
		sc.close();
		
		Medical sortCost[] = findingMatchedTablet(medical, match);
		int ans[] = new int[sortCost.length];
		for(int i=0; i<sortCost.length; i++) {
				ans[i] = sortCost[i].getCost();
			}
		Arrays.sort(ans);
		for(int i : ans) {
			System.out.println(i);
		}
	}
		
		
		private static Medical[] findingMatchedTablet(Medical a[], String match) {
			int b=0;
			for(int i=0; i<a.length; i++) {
				if(a[i].getTablet().equals(match)) {
					b++;
				}
			}
			int c=0;
			Medical m[] = new Medical[b];
			for(int i=0; i<a.length; i++) {
				if(a[i].getTablet().equals(match)) {
					m[c] = a[i];
					c++;
				}
			}
		return m;	
		
}
}