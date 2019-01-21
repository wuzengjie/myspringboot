package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Emp;
import com.example.mapper.FirstMapper;

@Service
public class FirstService {

	@Autowired
	private FirstMapper firstMapper;
	
	public List<Emp> queryAllEmp()
	{
		return firstMapper.queryAllEmp();
	}
}
