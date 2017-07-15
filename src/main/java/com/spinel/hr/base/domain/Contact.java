package com.spinel.hr.base.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Contact {

	private String phoneNumber;
	
	private String mobileNumber;
	
	private String email;
	
}
