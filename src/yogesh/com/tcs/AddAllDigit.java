package yogesh.com.tcs;
import java.util.*;
public class AddAllDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :");
	int num = sc.nextInt();
	int div, rem=0;
	while(num>0) {
		div = num % 10;
		rem = rem + div;
		num = num / 10;
	}
	System.out.println("Answer is :"+rem);
	sc.close();
}
}
