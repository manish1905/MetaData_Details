package com.capgemini.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.capgemini.beans.DataBaseBean;


public interface MetaDataDao {
	public void Connection(DataBaseBean dataBaseBean) throws SQLException;
	public ArrayList<String> getSchemaDetails() throws SQLException;
	public ArrayList<String> getTableNameDetails(String schema) throws SQLException;
	public ArrayList<String> getCoulmnDetails(String table) throws SQLException;

}
