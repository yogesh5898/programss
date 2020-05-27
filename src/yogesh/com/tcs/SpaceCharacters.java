package yogesh.com.tcs;
import java.util.*;
public class SpaceCharacters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String a[] = s.split(" ");
	 System.out.print("No of Spaces :"+(a.length-1)+" & ");
	 System.out.println("No of Characters :"+(s.length()));
	sc.close();
}
}
