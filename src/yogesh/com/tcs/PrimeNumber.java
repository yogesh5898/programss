package yogesh.com.tcs;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int c=0;
		for(int i=2; i<num/2; i++) {
			if(num % i ==0) {
				c++;
				break;
			}
		}
		if(c>0) {
			System.out.println("Not Prime number");
		}
		else {
			System.out.println("Prime Number");
		}
		sc.close();
	}

}
