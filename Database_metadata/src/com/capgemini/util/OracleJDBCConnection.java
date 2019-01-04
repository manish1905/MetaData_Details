package com.capgemini.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleJDBCConnection {
	
	public static Connection getConnection() throws SQLException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection connection=null;
		DatabaseMetaData metaData=null;
		try
		{
			connection=DriverManager.getConnection("jdbc:oracle:thin:@135.203.55.96:1521:plsystst","plutil","may=05");
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		/*try {
			metaData=connection.getMetaData();
			System.out.println("DriverName:"+metaData.getDriverName());
			System.out.println("DriverVersion:"+metaData.getDriverVersion());
			System.out.println("DataBase Product Name:"+metaData.getDatabaseProductName());
			System.out.println("DataBase Product version:"+metaData.getDatabaseProductVersion());
			//connection.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			metaData=connection.getMetaData();
			ResultSet rs=metaData.getSchemas();
			while(rs.next())
			{
				String tableSchema=rs.getString("TABLE_SCHEM");
				//String tableCatalog=rs.getString(1);
				System.out.println("table_schema:"+tableSchema);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			metaData=connection.getMetaData();
			String[] table= {"TABLE"};
			ResultSet rs=metaData.getTables(null,null,null, table);
			while(rs.next())
			{
				System.out.println("table_name:"+rs.getString(3));
			}
			connection.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		return connection;

}
	
}
