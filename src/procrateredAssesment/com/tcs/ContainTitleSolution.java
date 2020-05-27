package procrateredAssesment.com.tcs;
import java.util.*;
public class ContainTitleSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContainTitle book[] = new ContainTitle[4];
		
		for(int i=0; i<book.length; i++) {
			int id = sc.nextInt(); sc.nextLine();
			String title = sc.nextLine().toLowerCase();
			String author = sc.nextLine();
			double price = sc.nextDouble(); sc.nextLine();
			
		book[i] = new ContainTitle(id, title, author, price);
		}
		String search = sc.nextLine().toLowerCase();
		sc.close();
		
		int title[] = searchTitle(book, search);
		
		Arrays.sort(title);
		for(int i : title) {
			System.out.println(i);
		}
	}
		private static int[] searchTitle(ContainTitle book[], String search) {
			int c=0;	
			for(int i=0; i<book.length; i++) {
				if(book[i].getTitle().contains(search)) {
					c++;
				}}
		
			int m[] = new int[c];
			
			for(int i=0; i<book.length; i++) {
				if(book[i].getTitle().contains(search)) {
					
					m[i] = book[i].getId(); 
	
				}}
			return m;
		
	}
}
