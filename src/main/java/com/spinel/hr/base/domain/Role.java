package com.spinel.hr.base.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="ROLES")
public class Role  extends AbstractDomain{

	public Role(String name){
		this.name = name;
	}
	
	private String name;
	
}
