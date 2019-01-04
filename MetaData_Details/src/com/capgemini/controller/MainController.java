package com.capgemini.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.capgemini.dao.impl.MetaDataDaoImpl;
import com.capgemini.service.MetaDataService;

@Controller
public class MainController {
	MetaDataService metaDataService=new MetaDataService();
	
	/*@RequestMapping("/index")
	public ModelAndView indexController()
	{
		return new ModelAndView("index");
		
	}*/
	/*@RequestMapping(value="/details")*/
	/*public ModelAndView metaDataController()
	{
		Map<String, Object> model = new HashMap<String, Object>();
		ModelAndView mv=new ModelAndView("metaData",model);
		mv.addObject("myList",);
		//mv.addObject(model);
		
		ModelAndView mv=new ModelAndView();
		ArrayList<String> allData=new ArrayList<String>();
				System.out.println("Fetching DB details");
		allData=metaDataService.getAllMetaData();
		mv.addObject("myList",allData);
		return mv;
	}
	*/
}
