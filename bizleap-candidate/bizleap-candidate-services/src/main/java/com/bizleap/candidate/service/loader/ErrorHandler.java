package com.bizleap.candidate.service.loader;

import java.util.Map;

import com.bizleap.candidate.domain.Error;

public interface ErrorHandler {
	public void handleLoadingError(int lineNumber, String message, Object source);
	public void handleLinkageError(String message, Object source);
	public Map<Integer,Error> getErrorMap();
	public boolean hasError();
}
