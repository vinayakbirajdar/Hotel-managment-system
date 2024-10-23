package JavaProjects;

import java.util.Scanner;

public class HotelMain {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Hotel h1 = new Hotel();
		
		h1.addRoom(101, "Single",999 );
        h1.addRoom(102, "Double",1299);
        h1.addRoom(103, "dulex",1799);
        
    	h1.addRoom(104, "Single",999);
        h1.addRoom(105, "Double",1299);
        h1.addRoom(106, "dulex",1799);
        
        while(true)
        {
        	 System.out.println("\n**********Hotel Management System**********");
             System.out.println("1. Display Available Rooms");
             System.out.println("2.  Display price of all room");
             System.out.println("3. Book a Room");
             System.out.println("4. Checkout from a Room");
             System.out.println("5.  Display all room");
             System.out.println("6. Exit");
             System.out.print("Choose an option: ");
             int ch = sc.nextInt();
             
             switch(ch)
             {
             case 1:
            	 h1.AvaiableRoom();
            	 break;
            	 
             case 2:
            	 h1.showPrice();
            	 break;
            	 
             case 3:
            	 System.out.println("Enter the room number please");
            	 int rn1 = sc.nextInt();
            	 h1.bookRoom(rn1);
            	 break;
            	 
             case 4:
            	 System.out.println("Enter the room number please");
            	 int rn2 = sc.nextInt();
            	 h1.checkOut(rn2);
            	 break;
            	 
             case 5:
            	 h1.showAllRoom();
            	 break;
            	 
             case 6:
            	 System.out.println("Thank you");
            	 sc.close();
            	 return;
            	 
             default:
            	 System.out.println("Please enter an valid input");
            	 
             
             }
             
             
        }
        

	
		
	}
}
