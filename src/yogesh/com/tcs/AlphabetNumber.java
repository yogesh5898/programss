package yogesh.com.tcs;
import java.util.*;
public class AlphabetNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String c = "yoge";
	char b[] = c.toCharArray();
	int a[] = new int[c.length()];
	for(int i=0; i<b.length; i++) {
		 a[i] = (int)b[i];
		System.out.println(a[i]+1-97);
	}
	sc.close();
}
}
