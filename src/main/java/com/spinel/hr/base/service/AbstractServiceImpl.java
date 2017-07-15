package com.spinel.hr.base.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.spinel.hr.base.domain.AbstractDomain;
import com.spinel.hr.base.domain.User;
import com.spinel.hr.base.repository.AbstractRepo;

public abstract class AbstractServiceImpl<T extends AbstractDomain> implements AbstractService<T> {
	
	public abstract AbstractRepo<T> getRepo();
	
	@Override
	public List<T> findAll(){
		return getRepo().findAll();
	}
	@Override
	public List<T> findAll(Sort sort){
		return getRepo().findAll(sort);
	}
	@Override
	public List<T> findAll(Iterable<Long> ids){
		return getRepo().findAll(ids);
	}
	@Override
	public <S extends T> List<S> save(Iterable<S> entities){
		return getRepo().save(entities);
	}
	@Override
	public void flush(){
		getRepo().flush();
	}

	@Override
	public <S extends T> S saveAndFlush(S entity) {
		return getRepo().saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<T> entities) {
		getRepo().deleteInBatch(entities);		
	}

	@Override
	public void deleteAllInBatch() {
		getRepo().deleteAllInBatch();		
	}

	@Override
	public T getOne(Long id) {
		return getRepo().getOne(id);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example) {
		return getRepo().findAll(example);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
		return getRepo().findAll(example,sort);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return getRepo().findAll(pageable);
	}

	@Override
	public <S extends T> S save(S entity) {
		return getRepo().save(entity);
	}

	@Override
	public T findOne(Long id) {
		return getRepo().findOne(id);
	}

	@Override
	public boolean exists(Long id) {
		return getRepo().exists(id);
	}

	@Override
	public long count() {
		return getRepo().count();
	}

	@Override
	public void delete(Long id) {
		getRepo().delete(id);
	}

	@Override
	public void delete(T entity) {
		getRepo().delete(entity);
	}

	@Override
	public void delete(Iterable<? extends T> entities) {
		getRepo().delete(entities);	
	}

	@Override
	public void deleteAll() {
		getRepo().deleteAll();		
	}
	
	@Override
	public Authentication getAuthentication(){
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
