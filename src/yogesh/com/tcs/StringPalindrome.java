package yogesh.com.tcs;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();	
		String a = "";
		for(int i=s.length(); i>0; i--) {		
			a = a + s.charAt(i-1);
		}
		if(a.equals(s)) {
		System.out.println("OK");
	}else {
		System.out.println("NO OK");
	}
		sc.close();
	}
}
