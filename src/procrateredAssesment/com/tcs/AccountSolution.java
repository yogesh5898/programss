package procrateredAssesment.com.tcs;
import java.util.*;
public class AccountSolution {
	 public static void main(String args[] ) throws Exception {
	        
	        Scanner sc = new Scanner(System.in);
	       
	        int id = sc.nextInt();
	        double balance = sc.nextDouble();
	        double interestRate = sc.nextDouble();
	        
	      Account account = new Account(id, balance, interestRate);
	        
	       int noOfYears = sc.nextInt();
	       sc.close();
	
	    double ans = calculateInterest(account, noOfYears);
	    System.out.format("%.3f",ans);
	 }
	    public static double calculateInterest(Account a, int noOfYears)
	    {
	    
	        double temp = (noOfYears * a.interestRate)  / 100 ;
	        double anss = a.balance * (a.interestRate + temp) / 100;    
	    	return anss; 
	    	  }
	   
}
