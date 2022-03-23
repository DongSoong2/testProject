package com.human.java.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("reviewDAO")
public class ReviewDAOImpl implements ReviewDAO{
	
	@Autowired
	SqlSessionTemplate mybatis;
}
