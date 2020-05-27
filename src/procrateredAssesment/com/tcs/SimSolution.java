package procrateredAssesment.com.tcs;
import java.util.*;
public class SimSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sim sim[] = new Sim[5];
	
		for(int i=0; i<5; i++) {
			int simId = sc.nextInt(); sc.nextLine();
			String customerName = sc.nextLine();
			double balance = sc.nextDouble(); sc.nextLine();
			double ratePerSecond = sc.nextDouble(); sc.nextLine();
			String circle = sc.nextLine();
			
		sim[i] = new Sim(simId, customerName, balance, ratePerSecond, circle);
		}
		String circle1 = sc.nextLine();
		String convertCircle = sc.nextLine();
		sc.close();
		
		Sim newSim[] = transferCustomerCircle(sim, circle1, convertCircle);
		
		for(int i=0; i<newSim.length; i++) {
			System.out.println(newSim[i].getSimId()+" "+newSim[i].getCustomerName()+" "+
						newSim[i].getCircle()+" "+newSim[i].getRatePerSecond());
			}
		}
		
		
private static Sim[] transferCustomerCircle(Sim a[], String circle1, String convertCircle) {
			int b=0;
			for(int i=0; i<a.length; i++) {
				if(a[i].getCircle().equals(circle1)) {
					b++;
				}
			}
			int o=0;
			Sim m[] = new Sim[b];
			for(int i=0; i<a.length; i++) {
				if(a[i].getCircle().equals(circle1)) {
					a[i].setCircle(convertCircle);
					m[o] = a[i];
					o++;
				}
			}
			for(int i=0; i<m.length; i++) {
				for(int j=0; j<i; j++) {
					if(m[i].getRatePerSecond()>m[j].getRatePerSecond()) {
						Sim temp = m[i];
						m[i] = m[j]; 
						m[j] = temp;
					}
				}
				}
			return m;
		
	}
}
