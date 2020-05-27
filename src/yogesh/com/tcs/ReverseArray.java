package yogesh.com.tcs;
import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Orginal Array");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Reverse Array");
		for(int j=4; j>0; j--) {
			System.out.println(a[j-1]);
		}
		
		sc.close();
	}
}
