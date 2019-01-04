package com.capgemini.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MetaDataImpl {
	
	public ArrayList getSchemaDetails() throws SQLException;
	public ArrayList getTableNameDetails(ArrayList<String> list) throws SQLException;
	public void getCoulmnDetails(ArrayList<String> list) throws SQLException;
	/*public void getAllMetaData(ArrayList<String> list) throws SQLException;*/
	

}