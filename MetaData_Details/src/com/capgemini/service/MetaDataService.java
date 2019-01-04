package com.capgemini.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.beans.DataBaseBean;
import com.capgemini.dao.impl.MetaDataDaoImpl;

public class MetaDataService {
	MetaDataDaoImpl daoImpl=new MetaDataDaoImpl();
	
	public void connectionDetail(DataBaseBean dbBean)
	{
		daoImpl.Connection(dbBean);
	}
	
	public ArrayList<String> schemaData()
	{
		
		ArrayList<String> schema=new ArrayList<String>();
		try {
			schema=daoImpl.getSchemaDetails();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return schema;
	}
	public ArrayList<String> tableDetail(String schema)
	{
		ArrayList<String> tableList=new ArrayList<String>();
		try {
			tableList=daoImpl.getTableNameDetails(schema);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tableList;
	}
	public ArrayList<String> columnDetail(String table)
	{
		ArrayList<String> columnList=new ArrayList<String>();
		 try {
			columnList=daoImpl.getCoulmnDetails(table);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return columnList;
	}
			
				
	

}
