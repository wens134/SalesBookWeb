package com.spinel.hr.base.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Location {

	private Long longitude;
	
	private Long latitude;
	
}
