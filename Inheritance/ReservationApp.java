import java.util.*;
class Reservation
{
	private  String revId;
	private String custName;
	private String date;
	private String status;
	
	public Reservation(String revId,String custName,String date,String status)
	{
		this.revId=revId;
		this.custName=custName;
		this.date=date;
		this.status=status;
	}
	
	public void displayReservationDetail()
	{
		System.out.print(revId+"\t"+custName+"\t"+date+"\t"+status);
	}
	public void checkStatus()
	{
		System.out.println("status is :"+status);
	}
	public void modifyReservation(String newdate)
	{
		this.date=newdate;
	}
	public String getId()
	{
		return revId;
	}
	public void updateName(String name)
	{
		this.custName=name;
	}
}

class ResortReservation extends Reservation
{
	private int roomNumber;
	public ResortReservation(String revId,String custName,String date,String status,int room)
	{
		super(revId, custName, date, status);
		this.roomNumber=room;
	}
	public void displayReservationDetail()
	{
		System.out.println("Resort reservation");
		super.displayReservationDetail();
		System.out.println("\tRoom no: R-"+roomNumber);
	}
}

class RailwayReservation extends Reservation
{
	private int seatNo;
	public RailwayReservation(String revId,String custName,String date,String status,int seat)
	{	super(revId,custName,date,status);
		this.seatNo=seat;
	}
	public void displayReservationDetail()
	{	System.out.println("Railway reservation");
		super.displayReservationDetail();
		System.out.println("\tSeat no: "+seatNo);
	}
}


public class ReservationApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Reservation rev[]=new Reservation[5];
		String id,name,date,status;
		int room,seat,choice,r=0;
	  do{	System.out.println("=========================================================");
			System.out.println("1.Booking ResortReservation and RailwayReservation");
			System.out.println("2.Show the detail ");
			System.out.println("3.Update the reservation detail");
			System.out.println("4.check Status");
			System.out.println("5.Existing");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			System.out.println("=========================================================");
			switch(choice)
			{
				case 1 :
					System.out.println("1.ResortReservation");
					System.out.println("2.Raailway Reservation");
					
					choice=sc.nextInt();
					switch(choice)
					{
						case 1:
							sc.nextLine();
							System.out.println("Enter the id");
							id=sc.nextLine();
							System.out.println("Enter the name");
							name=sc.nextLine();
							System.out.println("Enter the date in dd-mm-yyyy");
							date=sc.nextLine();
							System.out.println("Enter the room number ");
							room=sc.nextInt();
							sc.nextLine();
							System.out.println("Enter the Status");
							status=sc.nextLine();
							// ResortReservation rev=new ResortReservation(id,name,date,status,room);
							rev[r++]=new ResortReservation(id,name,date,status,room);
							if(r<rev.length)
							{	System.out.println("detail are Added \ndetails are :");
								System.out.println("===================================");
								rev[r-1].displayReservationDetail();
							}
							break;
						case 2:
							sc.nextLine();
							System.out.println("Enter the id");
							id=sc.nextLine();
							System.out.println("Enter the name");
							name=sc.nextLine();
							System.out.println("Enter the date in dd-mm-yyyy");
							date=sc.nextLine();
							System.out.println("Enter the railway seat number ");
							seat=sc.nextInt();
							sc.nextLine();
							System.out.println("Enter the Status");
							status=sc.nextLine();
							// ResortReservation rev=new ResortReservation(id,name,date,status,room);
							rev[r++]=new RailwayReservation(id,name,date,status,seat);
							if(r<rev.length)
							{	System.out.println("detail are Added \ndetails are :");
								System.out.println("===================================");
								rev[r-1].displayReservationDetail();
							}
							
							break;	
					}
					break;
				case 2:
					if(r<rev.length)
					{	System.out.println("Id"+"\tname"+"\tdate"+"\t\tstatus"+"\tBooking seat/room ");
						for( int i=0;i<r;i++)
						{
							rev[i].displayReservationDetail();
						}
					}
					else
					{
						System.out.println("no seat are availble");
					}
					break;
				case 3:	
					System.out.println("1.update date");
					System.out.println("2.update name");
					System.out.println("Enter the choice");
					choice=sc.nextInt();
					switch(choice)
					{
						case 1:
							System.out.println("1.Enter the id for update the date");
							sc.nextLine();
							id=sc.nextLine();
							boolean f=true;
							for(int i=0;i<r;i++)
							{
								if(rev[i].getId().equals(id))
								{	f=false;
									System.out.println("enter the date ");
									date=sc.nextLine();
									rev[i].modifyReservation(date);
									System.out.println("update date Sucessfully...");
								}
							}
							if(f)
							{
								System.out.println("Id is not present");
							}
						break;
						case 2:
							System.out.println("1.Enter the id for update the name");
							sc.nextLine();
							id=sc.nextLine();
							f=true;
							for(int i=0;i<r;i++)
							{
								if(rev[i].getId().equals(id))
								{	f=false;
									System.out.println("enter the name ");
									name=sc.nextLine();
									rev[i].updateName(name);
									System.out.println("update name Sucessfully...");
								}
							}
							if(f)
							{
								System.out.println("Id is not present");
							}
						break;	
					}	
					break;
				case 4:
					System.out.println("1.Enter the id for check status");
					sc.nextLine();
					id=sc.nextLine();
					boolean b=true;
					for(int i=0;i<r;i++)
					{
						if(rev[i].getId().equals(id))
						{	b=false;
							rev[i].checkStatus();
						}
					}
					if(b)
					{
						System.out.println("Id is not present");
					}
					break;
				
				case 5:
					System.out.println("Existing ....");
				break;
				default:
				{
					System.out.println("Invalid input....");
				}
			}
		}while(choice<5);
	}
}