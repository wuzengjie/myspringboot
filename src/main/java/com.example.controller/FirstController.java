package com.example.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.FirstService;

/***
 * FirstService
 * JONE
 * cccc
 * dddd
 */
@Controller
public class FirstController {

	@Autowired
	private FirstService firstService;
	
	@GetMapping("/toIndex")
	public String toIndex(Integer id) throws ClassNotFoundException, SQLException
	{
		System.out.println("===================="+id);
		System.out.println(firstService.queryAllEmp());
		return "index2";
	}
	
	@RequestMapping("toIndex2")
	public String toIndex2(Integer id)
	{
		System.out.println("aaa"+id);
		return "index2";
	}
}
