package yogesh.com.tcs;
import java.util.*;
public class StringReverse {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String word = sc.nextLine();
	StringBuilder sb = new StringBuilder(word);
	System.out.println("Reverse String  :"+sb.reverse());
	sc.close();
	}
}
