package com.bank.coconut.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO {
	private String name;
	private Date birth;
	private String phone;
	private String email;
	private String password;
	private String id;
	private String gender;
	private int memberCode;
}
