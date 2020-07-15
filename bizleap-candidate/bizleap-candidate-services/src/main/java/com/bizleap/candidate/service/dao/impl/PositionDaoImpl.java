package com.bizleap.candidate.service.dao.impl;

import org.springframework.stereotype.Repository;

import com.bizleap.candidate.domain.Position;
import com.bizleap.candidate.service.dao.PositionDao;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;

@Repository
public class PositionDaoImpl extends AbstractDaoImpl<Position, String> implements PositionDao {

	protected PositionDaoImpl() {
		super(Position.class);
	}
	
	public void save(Position position) throws ServiceUnavailableException {
		saveOrUpdate(position);
	}	
}
