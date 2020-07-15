package com.bizleap.candidate.service.loader;

public interface FileLoader {
	public void start(String filePath) throws Exception;
	public void finish() throws Exception;
	public String getLine() throws Exception;
	public boolean hasMore() throws Exception;
	public int getLineNumber();
}
