package com.bizleap.candidate.service.saver;

import java.util.List;
import com.bizleap.candidate.domain.Position;

public interface PositionSaver {

	public void save() throws Exception;
	public void setPositionList(List<Position> positionList);
}
