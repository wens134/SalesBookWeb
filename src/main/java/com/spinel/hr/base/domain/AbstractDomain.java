package com.spinel.hr.base.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class AbstractDomain {

	@Id @GeneratedValue
	private Long id;
	@Version
	private Long version;
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date lastModifiedDate;
	
	private String createdBy;
	
	private String lastModifiedBy;
	
}
