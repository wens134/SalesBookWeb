package com.spinel.hr.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spinel.hr.base.domain.AbstractDomain;

public interface AbstractRepo<T extends AbstractDomain> extends JpaRepository<T,Long>{

}
