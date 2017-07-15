package com.spinel.hr.base.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class User extends AbstractDomain{
	
	@NotNull
	@Size(max=50)
	@Column(unique=true)
	private String username;
	
	@NotNull
	@Size(min=8,max=60)
	@JsonIgnore
	private String password;
	
	@NotNull
	@Size(max=50)
	private String firstName;
	
	@Size(max=50)
	private String lastName;
	
	private Address address;
	
	private Contact contact;
	
	@ManyToMany
	@JoinTable(
            name = "USER_ROLES",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_Id")
    )
	private List<Role> roles;
	
	
}
