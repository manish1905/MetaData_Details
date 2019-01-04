package com.capgemini.service;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.dao.MetaDataImpl;
import com.capgemini.util.OracleJDBCConnection;

public class MetaDataDetails implements MetaDataImpl
{
	
		static Connection connection=null;
		static DatabaseMetaData metaData =null;
		static
		{
	try {
		connection= OracleJDBCConnection.getConnection();
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
	try {
		metaData=connection.getMetaData();
	}catch(SQLException e1)
	{
		e1.printStackTrace();
	}
		}
		@Override
		public ArrayList getSchemaDetails() throws SQLException {
			
			// TODO Auto-generated method stub
			System.out.println("in schema Details");
			metaData=connection.getMetaData();
			ResultSet resultSet=metaData.getSchemas();
			ArrayList tableSchema=new ArrayList();
			while(resultSet.next())
				{
				String tblSchm=resultSet.getString("TABLE_SCHEM");
				tableSchema.add(tblSchm);
				}
			return tableSchema;
			
		}
		@Override
		public ArrayList getTableNameDetails(ArrayList<String> tableSchema) throws SQLException {
			// TODO Auto-generated method stub
			System.out.println("in table details");
			String[] table= {"TABLE"};
			ResultSet rs=null;
			ArrayList<String> mainTable=new ArrayList<String>();
			for(String tableDetail:tableSchema)
			{
			rs=metaData.getTables(null, tableDetail, null, table);
			while(rs.next())
			{
				mainTable.add("."+rs.getString(3));
			}
			}
			return mainTable;
		}
		@Override
		public void getCoulmnDetails(ArrayList<String> mainTable) throws SQLException {
			System.out.println("in column details");
			// TODO Auto-generated method stub
			ResultSet resSet=null;
			for(String table:mainTable)
			{
				resSet=metaData.getColumns(null,null, table, null);
				System.out.println("tableName--->"+table.toUpperCase());
				while(resSet.next())
				{
					System.out.println("Column name--->"+resSet.getString("COLUMN_NAME")
										+"Type name--->"+ resSet.getString("TYPE_NAME")+
										"Column size--->"+resSet.getString("COLUMN_SIZE"));
					
				}
				 System.out.println("\n");
			}
			
		}
	/*	@Override
		public void getAllMetaData(ArrayList<String> columnDetail) throws SQLException {
			// TODO Auto-generated method stub
			ResultSet resltDet=null;
			for(String tableDetl:columnDetail)
			{
				resltDet=metaData.get
			}
		}*/
		
}


