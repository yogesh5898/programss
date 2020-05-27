package yogesh.com.tcs;
import java.util.*;
public class MoreFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		int m=0;
		for(int i=0; i<a.length; i++) {
			m = a[i];
		
		int fact=1;
		for(int j=1; j<=m; j++) {
			fact = fact * j;
		}
		System.out.println(fact);
		}
		sc.close();
}}
