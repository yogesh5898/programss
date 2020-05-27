package yogesh.com.tcs;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String conv = Integer.toString(n);
		String sp[] = conv.split("");
		int tot = 0;
		for(int i=0; i<sp.length; i++) {
			tot =tot + (Integer.valueOf(sp[i]) * Integer.valueOf(sp[i]) 
										* Integer.valueOf(sp[i]));
		}
		if(tot == n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("No Armstrong");
		}
		sc.close();
	}
}
