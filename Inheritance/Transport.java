class Vehicle
{
	private String model,registerNumber;
	private int speed=20,fuelCapacity,fuelConsume;
	
	public Vehicle(String model, String registerNumber,  int fuelCapacity )
	{
        this.model = model;
        this.registerNumber = registerNumber;
        this.fuelCapacity = fuelCapacity;
    }
	
	 public String getModel() {
        return model;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getFuelConsume() {
        return fuelConsume;
    }

    public void setFuelConsume(int fuelConsume) {
        this.fuelConsume = fuelConsume;
    }
	
	
	public void fuelNeeded(int distance)
	{
		int fuel=(distance/20);
		setFuelConsume(fuel);
	}
	
	public int  distanceCovered(int speed,int time)
	{
		int distance=speed*time;
		setSpeed(speed);
		return distance;
	}
	
	
	public void display()
	{
		System.out.print("\n"+getModel()+"\t"+getRegisterNumber()+"\t"+getFuelCapacity()+"\t"+getSpeed()+"\t"+getFuelConsume());
	}
	
}

class Truck extends Vehicle
{
	private int cargoWeigth;
	
	Truck(int w)
	{	super("Truck","Truck123",50);
		this.cargoWeigth=w;
	}
	public int  getCargoWeigth()
	{
		return cargoWeigth;
	}
	public void display()
	{	super.display();
		System.out.print(distanceCovered(300,20)+"\t"+getCargoWeigth());	
	}
}

class Bus extends Vehicle
{
	private int passenger;
	public Bus(int passenger)
	{
		super("Bus","Bus12Pu2345",20);
		this.passenger=passenger;
	}
	public int getPassanger()
	{
		return passenger;
	}
	public void display()
	{
		super.display();
		System.out.print(distanceCovered(200,20)+"\t"+getPassanger());
		
	}
}

public class Transport 
{
	public static void main(String x[])
	{
		Truck t=new Truck(500);
		t.display();
		
		Bus bus=new Bus(100);
		bus.display();
	}
}