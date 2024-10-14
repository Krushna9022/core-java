import java.sql.*;
public class DBConnect
{
	public static void main(String x[])
	{
		String url="jdbc:mysql://localhost:3306/mysql";
		String user="root";
		String password="krushna";
		
		try{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection(url,user,password);
		if(conn!=null)
		{
			System.out.println("connected");
		}
		
		}
		catch(SQLException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}
	}
}