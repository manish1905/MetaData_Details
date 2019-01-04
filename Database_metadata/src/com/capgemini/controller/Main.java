package com.capgemini.controller;

import com.capgemini.service.MetaDataDetails;

public class Main {
	
	public static void main(String[] arg)
	{
		try {
			System.out.println("Tables MetaData are as follows::");
			MetaDataDetails metDetail=new MetaDataDetails();
			metDetail.getCoulmnDetails(metDetail.getTableNameDetails(metDetail.getSchemaDetails()));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
