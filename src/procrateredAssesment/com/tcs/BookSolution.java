package procrateredAssesment.com.tcs;
import java.util.*;
public class BookSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book[] = new Book[4];
		for(int i=0; i<book.length; i++) {
			int id = sc.nextInt(); sc.nextLine();
			String title = sc.nextLine();
			String author = sc.nextLine();
			double price = sc.nextDouble(); sc.nextLine();
			
		book[i] = new Book(id, title, author, price);
		}
		Book sorting[] = sortBooksByPrice(book);
		sc.close();
		for(int i=0; i<sorting.length; i++) {
			System.out.println(sorting[i].getId()+" "+sorting[i].getTitle()+" "+
					sorting[i].getAuthor()+" "+sorting[i].getPrice());
			}
		}
		
		private  static Book[] sortBooksByPrice(Book books[]) {
			for(int i=0; i<books.length; i++) {
				for(int j=0; j<i; j++) {
					if(books[i].getPrice()<books[j].getPrice()) {
						Book temp = books[j];
						books[j] = books[i];
						books[i] = temp;
					}
				}
			}
			return books;
	}
}
