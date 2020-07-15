package com.bizleap.candidate.service.loader.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.util.StringUtils;

import org.springframework.stereotype.Service;

import com.bizleap.candidate.service.loader.FileLoader;

@Service
public class FileLoaderImpl implements FileLoader {
	private BufferedReader dataReader;
	private String dataLine = "";
	private int lineNumber;
	
	public FileLoaderImpl() {	
	}
	
	public void start(String filePath) throws Exception {
		lineNumber = 0;
		dataReader = new BufferedReader(new FileReader(filePath));
	}

	public void finish() throws Exception {
		if(dataReader != null)
			dataReader.close();
	}

	public boolean hasMore() throws IOException {
		if(dataReader == null)
			return false;
		 dataLine = dataReader.readLine();
		 lineNumber++;
		 return !StringUtils.isEmpty(dataLine);
	}
	
	public String getLine() {
		return dataLine;
	}

	public int getLineNumber() {
		return lineNumber;
	}
}
