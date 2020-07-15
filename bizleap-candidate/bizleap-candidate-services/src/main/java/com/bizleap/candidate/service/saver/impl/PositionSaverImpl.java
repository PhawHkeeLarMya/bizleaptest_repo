package com.bizleap.candidate.service.saver.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bizleap.candidate.domain.JobVacancy;

public class PositionSaverImpl implements PositionSaver {
	
	@Autowired
	private PositionService positionService;

	private PositionServiceJdbc positionServiceJdbc;

	private List<Position> positionList;

	public PositionSaverImpl() {
		if (PositionServiceJdbc == null)
			PositionServiceJdbc = new PositionServiceJdbcImpl();
	}

	public List<Position> getPositionList() {
		if (positionList == null)
			positionList = new ArrayList<Position>();
		return positionList;
	}

	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}
	
	@Override
	public void save() throws Exception {
		if (positionList != null) {
			for (Position position : positionList) {
				positionService.saveJob(position);
			}
		}
	}

}
