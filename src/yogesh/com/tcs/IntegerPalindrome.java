package yogesh.com.tcs;
import java.util.*;
public class IntegerPalindrome {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	String conv = Integer.toString(num);
	StringBuilder sb = new StringBuilder(conv);
	String ans = sb.reverse().toString();
	if(ans.equals(conv)) {
		System.out.println("Ok");
	}
	else {
		System.out.println("No Ok");
	}
	sc.close();
}
}