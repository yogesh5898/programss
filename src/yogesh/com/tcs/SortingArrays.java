package yogesh.com.tcs;

import java.util.Arrays;

public class SortingArrays {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,1};
		String b[] = new String[3];
		b[0] = "yogesh";
		b[1] = "praveena";
		b[2] = "Lusu";
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(b);
		for(String j : b) {
			System.out.println(j);
		}
		
	}
}
