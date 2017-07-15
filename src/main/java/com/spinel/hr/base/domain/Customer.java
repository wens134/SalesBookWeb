package com.spinel.hr.base.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="Customers")
public class Customer extends AbstractDomain {

	private String name;
	
	private Address address;
	
	private Location location;
	
	private Contact contact;
	
}
