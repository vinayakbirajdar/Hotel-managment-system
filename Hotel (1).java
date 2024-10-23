package JavaProjects;
import java.util.ArrayList;
public class Hotel {

	ArrayList<Room> rooms = new ArrayList<>();
	
	void addRoom(int roomNumber,String roomType,float price)
	{
		Room r1 = new Room(roomNumber,roomType,price);
		rooms.add(r1);
		
	}
	
	void bookRoom(int roomNumber)
	{
		for(Room rm :rooms)
		{
			if(rm.roomNumber == roomNumber)
			{
				rm.bookRoom();
		}
		}
		
	}
	
	
	void AvaiableRoom()
	{
		System.out.println("Avaiable rooms");
		for(Room rm : rooms)
		{
			if(rm.isBooked == false)
			{
				rm.showRoom();
			}
		}
	}
	
	
	
	void checkOut(int roomNumber)
	{
		for(Room rm : rooms)
		{
			if(rm.roomNumber == roomNumber)
			{
				rm.checkOut();
			}
		}
	}
	
	void showAllRoom()
	{
		System.out.println("All rooms");
		for(Room rm : rooms)
		{
			rm.showRoom();
		}
	}
	
	void showPrice()
	{
		System.out.println("Single room - ₹999");
		System.out.println("Double room - ₹1299");
		System.out.println("Dulex room - ₹1799");

	}
	
}
