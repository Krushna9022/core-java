/*
Write a Java program to create a class called Smartphone with private instance variables brand, model,
and storageCapacity. Provide public getter and setter methods to access and modify these variables.
Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by
that value.
*/
import java.util.Scanner;
class Smartphone
{
	private String brand,model;
	private int storageCapacity;
	
	public void setBrand(String brand)
	{	this.brand=brand;
	}
	public String getBrand()
	{	return brand;
	}
	public void setModel(String model)
	{	this.model=model;
	}
	public String getModel()
	{	return model;
	}
	
	public void setStorage(int storageCapacity)
	{
		this.storageCapacity=storageCapacity;
	}
	public int getStorage()
	{
		return storageCapacity;
	}
}

class UpdateSmartPhone
{
	Smartphone phone;
	public UpdateSmartPhone(Smartphone phone)
	{
		this.phone=phone;
	}
	public void increaseStorage(int storage)
	{
		int newstorage= phone.getStorage()+storage;
		phone.setStorage(newstorage);
	}
	public void aboutPhone()
	{
		System.out.println("model "+phone.getModel()+"\nBrand "+phone.getBrand()+"\nStorage "+phone.getStorage());
		
	}
}

public class SmartphoneApp
{
	public static void main(String x[])
	{
		Smartphone phone =new Smartphone();
		phone.setBrand("Realme");
		phone.setModel("rmx2152");
		phone.setStorage(64);
		UpdateSmartPhone update=new UpdateSmartPhone( phone);
		update.aboutPhone();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size to upgrade the storage with how much gb");
		int storage =sc.nextInt();
		update.increaseStorage(storage);
		update.aboutPhone();
	}
}