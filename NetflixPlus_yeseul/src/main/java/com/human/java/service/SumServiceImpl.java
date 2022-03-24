package com.human.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.java.dao.SumDAO;

@Service("sumService")
public class SumServiceImpl implements SumService{
	
	@Autowired
	SumDAO sumDAO;
}
