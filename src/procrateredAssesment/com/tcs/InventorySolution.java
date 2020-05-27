package procrateredAssesment.com.tcs;
import java.util.*;
public class InventorySolution {
	public static void main(String[] args) {
		Inventory inventory[] = new Inventory[4];
		int search;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<inventory.length; i++) {
			int inventoryId =sc.nextInt(); sc.nextLine();
			int maximumQuantity = sc.nextInt(); sc.nextLine();
			int currentQuantity = sc.nextInt(); sc.nextLine();
			int threshold = sc.nextInt(); sc.nextLine();
			
		inventory[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity,
													threshold);
		}
		search = sc.nextInt();
		sc.close();
		
		Inventory newInventory[] = replenish(inventory, search);
		
for(int i=0; i<newInventory.length; i++) {
	if(newInventory[i].getThreshold()>75)
	{
		System.out.println(newInventory[i].getInventoryId()+" Critical Filling");
	}
	else if(newInventory[i].getThreshold()>=50 && newInventory[i].getThreshold()<=74) 
	{
		System.out.println(newInventory[i].getInventoryId()+" Moderate Filling");
	}
	else
	{
		System.out.println(newInventory[i].getInventoryId()+" Non Critical Filling");
	}
			}
		}
	
		private static Inventory[] replenish(Inventory a[], int limit) {
			int b=0;
			for(int i=0; i<a.length; i++) {
				if(a[i].getThreshold()<=limit) {
					b++;
				}
			}
		    int c=0;
		 Inventory m[] = new Inventory[b];
		 for(int i=0; i<a.length; i++) {
			 if(a[i].getThreshold()<=limit) {
				 m[c] = a[i];
				 c++;
			 }
		 }
		 return m;
		}
	
}
