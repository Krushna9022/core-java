class Event
{
	private String eventName,eventDate,eventLocation;
	public Event()
	{
		
	}
	public Event(String eventName,String eventDate,String eventLocation)
	{
		this.eventDate=eventDate;
		this.eventName=eventName;
		this.eventLocation=eventLocation;
	}
	public String getDate()
	{
		return eventDate;
	}
	public String  getEventName()
	{
		return eventName;
	}
	public String  getLocation()
	{
		return eventLocation;
	}
	public void displayEventDetail()
	{
		System.out.println("Event name : "+eventName+"\nEvent Date : "+eventDate+"\nEvent Location : "+eventLocation);
	}
	public static void isConflict(Event otherEvent[])
	{
		for(int i=0;i<otherEvent.length;i++)
		{
			for(int j=i+1;j<otherEvent.length;j++)
			{
				if(otherEvent[i].getDate().equals(otherEvent[j].getDate()) && otherEvent[i].getLocation().equals(otherEvent[j].getLocation()))
				{
					System.out.println("their is conflit "+otherEvent[i].getEventName()+" and "+otherEvent[j].getEventName()+"date is "+otherEvent[i].getDate());
				}
			}
		}
	}
	
}
class Seminar extends Event
{
	private int numberOfSpeaker;
	
	public Seminar(String eventName,String eventDate,String eventLocation,int numberOfSpeaker)
	{
		super(eventName,eventDate,eventLocation);
		this.numberOfSpeaker=numberOfSpeaker;
	}
	public void displayEventDetail()
	{
		super.displayEventDetail();
		System.out.println("total speaker :"+numberOfSpeaker);
	}
}

class MusicalPerformance extends Event
{
	private String performerList[];
	
	public  MusicalPerformance(String eventName,String eventDate,String eventLocation,String performerList[])
	{
		super(eventName,eventDate,eventLocation);
		this.performerList=performerList;
	}
	public void displayEventDetail()
	{
		super.displayEventDetail();
		for(int i=0;i<performerList.length;i++)
		{
			System.out.println(performerList[i]);
		}
	}
}

public class EventOrganizerApp
{
	public static void main(String x[])
	{
		Event event[]=new Event[5];
		event[0]=new Event("Dance Performance : 1","22-11-2024","tech hall");
		
		event[1]=new Seminar("Seminar Performance : 1","23-11-2024","A1-hall",5);

		event[3]=new MusicalPerformance("Musical Performance:1 ","21-11-2024","A5-hall",new String []{"1.Gaurav  :-Deva Shriganesha","2.Pooja :natraj-mathurichya bajari","3.Kishor :chote chote peg","4.kalyani,mayuri :desi girl"});
		
		event[2]=new MusicalPerformance("Musical Performance: 2 ","25-11-2024","A5-hall",new String []{"1.rishi  :-Deva ","2.kalyani & suraj : tera hoke rahange ","3.vikas :chote chote peg","4.pratiksha ,Ashwani :Aaigari nandani"});
		
		event[4]=new Seminar("Seminar Performance :2 ","22-11-2024","tech hall",10);
		
		for(int i=0;i<event.length;i++)
		{	if(event[i]!=null)
			{
				event[i].displayEventDetail();
				System.out.println("=======================================================\n");
			}
		}
		Event e=new Event();
		e.isConflict(event);
		
	}
}