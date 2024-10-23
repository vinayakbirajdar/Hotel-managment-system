package JavaProjects;

public class Room {
	
	int roomNumber;
	String RoomType;
	boolean isBooked;
	float price;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	Room(int roomNumber,String RoomType,float price)
	{
		this.roomNumber = roomNumber;
		this.price = price;
		this.RoomType = RoomType;
	}
	
	void bookRoom()
	{
		if(isBooked == false)
		{
			isBooked = true;
			System.out.println("Room " +roomNumber+ " has been booked");
		}
		else
		{
			System.out.println("Room " +roomNumber+ " is already booked");
		}
	}
	
	void checkOut()
	{
		if(isBooked == true)
		{
			isBooked = false;
			System.out.println("Room " +roomNumber+ " has been checked out");
		}
		else
		{
			System.out.println("Room "+roomNumber+ " is already vacant");
		}
	}
	
	void showRoom()
	{
		String status = isBooked == true ? "Booked" : "Available";
		 System.out.println("Room " + roomNumber + " (" + RoomType + ") - " + status);
	}
	
	

}
