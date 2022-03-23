package com.human.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.java.dao.VideoDAO;
import com.human.java.dao.VideoDAOImpl;
import com.human.java.domain.VideoVO;

@Service("videoService")
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	VideoDAOImpl videoDAO;

	public List<VideoVO> getActionNadventure(){
		return videoDAO.getActionNAdventure();
	}

	public List<VideoVO> getAnimation(){
		return videoDAO.getAnimation();
	}

	public List<VideoVO> getFamily(){
		return videoDAO.getFamily();
	}
	
	public List<VideoVO> getDrama(){
		return videoDAO.getDrama();
	}

	public List<VideoVO> getDisney(){
		return videoDAO.getDisney();
	}

	public List<VideoVO> getMarvel(){
		return videoDAO.getMarvel();
	}

	public List<VideoVO> getPixar(){
		return videoDAO.getPixar();
	}

	public List<VideoVO> getAll(){
		return videoDAO.getAll();
	}

	public List<VideoVO> getKids(){
		return videoDAO.getKids();
	}

	public List<VideoVO> search(VideoVO vo){
		return videoDAO.search(vo);
	}
	
	
	public List<VideoVO> interested(){
		return videoDAO.interested();
	}
	 
}
