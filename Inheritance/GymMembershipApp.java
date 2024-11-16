class GymMembership
{
	private String memberName,memberShipType;
	private int duration;
	private double amount;
	
	
	public GymMembership(String memberName,String memberShipType,int duration)
	{
		this.memberName=memberName;
		this.memberShipType=memberShipType;
		this.duration=duration;
	}
	public double getAmount()
	{
		return amount;
	}
	public void calculateFees()
	{	if(memberShipType.equals("basic"))
		{
			amount=(500*duration);
			System.out.println("amount to pay"+amount);
		}
		if(memberShipType.equals("standard"))
		{
			amount=(800*duration);
			System.out.println("amount to pay"+amount);
		}
	}
	public void checkSpecialOffer()
	{
		System.out.println("Diwali offer 30% 0ff");
	}
	public void displayMembershipDetails()
	{
		System.out.println("name :"+memberName+"\nmembership-type"+memberShipType+"\n duration in mm :"+duration+"\namount :"+amount);
	}
	public void modifyMemberShipType(String newType)
	{	
		this.memberShipType=newType;
	}
}

class PermiumMembership extends GymMembership
{
	private boolean personalTrainer;
	private boolean spaAcess;
	private double amount;
	private int duration;
	public PermiumMembership(String memberName,String memberShipType,int duration,boolean personalTrainer,boolean spaAcess)
	{
		super( memberName, memberShipType, duration);
		this.personalTrainer=personalTrainer;
		this.spaAcess=spaAcess;
		this.duration=duration;
	}
	public void calculateFees()
	{
		amount=1000*duration;
		System.out.println("amount to pay"+amount);
	}
	public void displayMembershipDetails()
	{	System.out.println("premium member  ");
		System.out.println("Access to spa"+spaAcess);
		System.out.println("personal Trainer avalible"+personalTrainer);
		
	}
	public void ModifySpaAccess()
	{
		if(spaAcess)
		{
			this.spaAcess=false;
		}
		else
		{
			this.spaAcess=true;
		}
	}	
}

public class GymMembershipApp
{
	public static void main(String x[])
	{	GymMembership gym[]=new GymMembership[4];
	//	PermiumMembership p1=new PermiumMembership("krushna","premium",5,true,false);
		gym[0]=new PermiumMembership("krushna","premium",5,true,false);
		// gym[0].calculateFees();
		// gym[0].displayMembershipDetails();
		// System.out.println("=============================================");
		
		gym[1]=new GymMembership("Gaurav","standard",6);
		//gym[1].calculateFees();
		//gym[1].displayMembershipDetails();
		//System.out.println("=============================================");
		
		gym[2]=new GymMembership("Rishi","basic",6);
		// gym[2].calculateFees();
		// gym[2].displayMembershipDetails();
		for(GymMembership g:gym)
		{   if(g!=null)
			{
				g.calculateFees();
				g.checkSpecialOffer();
				g.displayMembershipDetails();
				g.calculateFees();
				System.out.println("========================================");
			}
		}
		
	}
}