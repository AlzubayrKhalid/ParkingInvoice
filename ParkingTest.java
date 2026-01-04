package lab;
import java.util.Scanner;

public class ParkingTest {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Welcome to the Parking Invoice System\n"+ "-------------------------------------\n"+ "add ==> add a new invoice.\n"+ "pay ==> pay current invoice.\n"+ "print ==> print current invoice.\n"+ "exit ==> terminate the program.\n"+ "-------------------------------------\n"+ "Type your command.");
		String userch= read.next();
		
		String type;
		int duration;
		int numofInvoice = 0;
		ParkingInvoice obj = new ParkingInvoice();
		int sumPaid=0;


		while (!(userch.equals("exit")))
		{
			if (userch.equals("add"))
			{
				System.out.print("Enter the type and duration: ");
				type= read.next();
				duration= read.nextInt();
				
				obj.setType(type);
				obj.setDuration(duration);
				obj.setPaid(false);
				numofInvoice++;
				
			}
			
			else if (userch.equals("pay"))
			{
				if (numofInvoice == 0)
					System.out.println("ERROR: no current invoice.");
				else if (obj.getPaid())
					System.out.println("ERROR: already paid.");
				else
				{
					System.out.println("Payment done.");
					obj.setPaid(true);
					sumPaid += obj.calcPrice();
				}
				
			}
			
			else if (userch.equals("print"))
			{
				if (numofInvoice ==0)
					System.out.println("ERROR: no current invoice.");
				else
					obj.print();
			}
			
			else 
				System.out.println("ERROR: incorrect command.");
			
			userch = read.next();
		}
		
		System.out.printf("Sum of paid invoices: %d SR\nGoodbye.", sumPaid);
		
		read.close();
	}

}