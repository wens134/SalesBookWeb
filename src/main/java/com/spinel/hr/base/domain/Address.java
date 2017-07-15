package com.spinel.hr.base.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {
	
	private String country;
	
	private String city;
	
	private String state;
	
	private String postCode;
	
	private String street1;
	
	private String street2;
	
}
