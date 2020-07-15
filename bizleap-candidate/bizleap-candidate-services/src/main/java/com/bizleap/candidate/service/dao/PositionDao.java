package com.bizleap.candidate.service.dao;

import java.util.List;
import com.bizleap.candidate.domain.Position;
import com.bizleap.commons.domain.exception.ServiceUnavailableException;

public interface PositionDao extends AbstractDao<Position, String> {

	public List<Position> getAll(String string);
	public void save(Position position) throws ServiceUnavailableException;
}
