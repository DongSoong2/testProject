package com.human.java.domain;

import lombok.Data;

@Data
public class UserVO {
	private String userEmail;
	private String userPassword;
	private String userName;
	private String userCardNum;
	private String userCardExpi;
	private String userCardPass;
	private String userBirth;
	private boolean userInterested;

}
