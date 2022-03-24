package com.human.java.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.java.domain.VideoVO;

@Repository("videoDAO")
public class VideoDAOImpl implements VideoDAO{

	@Autowired
	SqlSessionTemplate mybatis;
	
	public List<VideoVO> getActionNAdventure() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getActionNadventure");
		return vvo;
	}

	public List<VideoVO> getAnimation() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getAnimation");
		return vvo;
	}
	
	public List<VideoVO> getFamily() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getFamily");
		return vvo;
	}
	
	public List<VideoVO> getDrama() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getDrama");
		return vvo;
	}

	public List<VideoVO> getDisney() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getDisney");
		return vvo;
	}

	public List<VideoVO> getMarvel() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getMarvel");
		return vvo;
	}

	public List<VideoVO> getPixar() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getPixar");
		return vvo;
	}

	public List<VideoVO> getAll() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getAll");
		return vvo;
	}

	public List<VideoVO> getKids() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.getKids");
		System.out.println(vvo);
		return vvo;
	}
	
	public List<VideoVO> search(VideoVO vo) {
		System.out.println(vo.getSearch());
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.search", vo);
		System.out.println(vvo);
		return vvo;
	}
	
	public List<VideoVO> interested() {
		List<VideoVO> vvo = mybatis.selectList("VideoDAO.interested"); 
		System.out.println(vvo);
		return vvo;
	}
	
	
}
