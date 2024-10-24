/*
 Write a Java program to create a class called "Book" with attributes 
for title, author, and ISBN, and methods to add,view,show,update and remove 
book record from array of object ,ask size of array of object from user.

*/
import java.util.*;
class Book
{
	private int id;
	private String title;
	private String author;
	private int isbin;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setIsbin(int isbin)
	{
		this.isbin=isbin;
	}
	public int getIsbin()
	{
		return isbin;
	}
	
} 

class BookDetail
{
	Scanner sc=new Scanner(System.in);
	private Book book[];
	public void setBook(Book book[])
	{
		this.book=book;
	}
	public void showBookDetail()
	{
		if(book==null)
		{
			System.out.println("no records present....");
			return;
		}	
		System.out.println("=========== Displaying the detail of book ==========");
		System.out.println("Id"+"\t"+"title"+"\t"+"Author"+"\t"+"ISBIN"+"\n=================================");
		for(Book b:book)
		{
			if(b!=null)
			{
				System.out.println(b.getId()+"\t"+b.getTitle()+"\t"+b.getAuthor()+"\t"+b.getIsbin());
			}
		}
	}
	
	public void setUpdateDetail(int findid)
	{
		if(book==null)
		{
			System.out.println("detail are not present yet..");
			return;
		}
		boolean flag=true;
		for(int i=0;i<book.length;i++)
		{
			if(findid==book[i].getId())
			{
				System.out.println("Enter the new  id");
				int upid=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the new book title");
				String uptitle=sc.nextLine();
				System.out.println("Enter the new book author");
				String upauthor=sc.nextLine();
				System.out.println("Enter the new isbin number");
				int upisbin=sc.nextInt();
				sc.nextLine();
				book[i].setId(upid);
				book[i].setTitle(uptitle);
				book[i].setAuthor(upauthor);
				book[i].setIsbin(upisbin);	
				System.out.println("detail updated sucessfully....");
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("detail not found..");
		}
	}
	
	public void deleteDetail(int delid)
	{
		if(book==null)
		{
			System.out.println("no records present....");
			return;
		}	
		
		boolean flag=true;
		for(int i=0;i<book.length;i++)
		{
			if(delid==book[i].getId())
			{
				book[i]=null;
				flag=false;
				System.out.println("deleted book detail sucessfully...");
			}
		}
		if(flag)
		{
			System.out.println("No record found...");
		}
	}

}

public class BookApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of books");
		int n=sc.nextInt();
		Book book[]=new Book[n];
		BookDetail bookdetail=new BookDetail();
		while(true)
		{
			
			System.out.println("\n===============================\n");
			System.out.println("1. for add details");
			System.out.println("2. for show details");
			System.out.println("3. for update details");
			System.out.println("4. for delete details");
			System.out.println("5. for exit ");
			System.out.println("\n===============================\n");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the how many books to be add");
					int add=sc.nextInt();
					if(add>n)
					{
						System.out.println("available space are "+n+" operation not possible");
						break;
					}
					System.out.println("Enter the details of books");
					for(int i=0;i<=add;i++)
					{
						book[i]=new Book();
						System.out.println("enter the id of book");
						int id=sc.nextInt();
						sc.nextLine();
						System.out.println("enter the title of book");
						String title=sc.nextLine();
						System.out.println("enter the author of book");
						String author =sc.nextLine();
						System.out.println("enter the isbin of book");
						int isbin=sc.nextInt();
						sc.nextLine();
						book[i].setId(id);
						book[i].setAuthor(author);
						book[i].setTitle(title);
						book[i].setIsbin(isbin);
					}
					bookdetail.setBook(book);
					System.out.println("Books are added sucessfully...");
					break;
				case 2:
					System.out.println("Displaying the detail of books");
					bookdetail.showBookDetail();
					break;
					
				case 3:
					System.out.println("update the detail");
					int findid=sc.nextInt();
					bookdetail.setUpdateDetail(findid);
					bookdetail.showBookDetail();
					break;
					
				case 4:
					System.out.println("Enter the Id to delete the record");
					int delid=sc.nextInt();
					bookdetail.deleteDetail(delid);
					break;
				case 5:
					System.out.println("Existing ....");
					System.exit(0);
					
				default:
					System.out.println("invalid input");
				
			}	
		}
	}
}