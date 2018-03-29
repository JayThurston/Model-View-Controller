package userInterface;
import static java.lang.System.*;

import java.util.Scanner;
import domain.*;

public class UI {
	private Order order;
	private int choice;
	
		public int yassss(Order order){
			this.order = order;
			choice = 0;
			
			while(true){
				choice= menu();
					switch (choice) {
					case  1 : {
						
						System.out.println("Enter quantity you would like to order");
						Scanner qScanner = new Scanner(System.in);
						System.out.println();
						order.setQuantity(qScanner.nextInt());
						System.out.println("Order entered");
						break;
					}
					case 2 : {
						System.out.println("Units ordered: ");
						System.out.println(order.getQuantity());
						break;
					}
					case 3 : {
						System.exit(0);
		        
					}
		    
					default:
						System.out.println("Invalid entry, please try again");
						break;
					}
			}
		}
	
	
	public int menu() {
	System.out.println("Choose one of the following:");
	System.out.println("1. Enter Order");
	System.out.println("2. View Order");
	System.out.println("3. Exit");
	Scanner menuChoice = new Scanner(System.in);
	System.out.println();
	System.out.println("Enter 1, 2, or 3");
	int choice;
	choice = menuChoice.nextInt();
	
	return choice;
	}
}
