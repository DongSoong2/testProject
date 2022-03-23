package com.human.java.domain;

import lombok.Data;

@Data
public class ReviewVO {
	private String userEmail;
	private String videoTitle;
	private String reviewContent;
	private int reviewPoint;
}
