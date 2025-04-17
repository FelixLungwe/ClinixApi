package bu.clinix.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChaineConnexion
{
	private static Connection connection;
	   
	   static
	   {
	   	try
			{
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/clinix", "root", "felix243");
			}
			catch (ClassNotFoundException e)
			{
				System.out.println("||------probleme avec le driver-----||");
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				System.out.println("||-----probleme avec la chaine de cxion-----||");
				e.printStackTrace();
			}
	   }

		public static Connection getConnection()
		{
			return connection;
		}

}
