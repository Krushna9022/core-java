/*
		var-args
WAP to create the class name as Player with a setter and getter method with a Player details.
Create the one more class name as Team and pass Player objects in Team class using a var-args concept and show the Player details in Team class.
*/

class Player
{
	private int id;
	private int runs;
	private String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setRuns(int runs)
	{
		this.runs=runs;
	}
	public int getRuns()
	{
		return runs;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
}

class Team
{
	private Player players[];
	public void setPlayers(Player ...players)
	{
		this.players=players;
	}
	public void getPlayers()
	{
		System.out.println("Id"+"\t"+"Name"+"\t"+"Runs"+"\n==================================");
		for(int i=0;i<players.length;i++)
		{
			System.out.println(players[i].getId()+"\t"+players[i].getName()+"\t"+players[i].getRuns());
		}
	}

}

public class TeamApplication
{
	
	public static void main(String x[])
	{
		Player p1=new Player();
		p1.setId(1);
		p1.setName("kkp");
		p1.setRuns(100);
		
		Player p2=new Player();
		p2.setId(2);
		p2.setName("rhp");
		p2.setRuns(200);
		
		Player p3=new Player();
		p3.setId(3);
		p3.setName("avb");
		p3.setRuns(100);
		
		Team team=new Team();
		team.setPlayers(p1,p2,p3);
		team.getPlayers();
	}
}