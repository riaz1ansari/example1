package com.excercise.thread;

import java.io.File;
import java.io.FileWriter;

public class WriteTask implements Runnable{

	private FileWriter fileWriter;
	private File file;
	
	public WriteTask(File file) {
		try {
			this.file=file;
			fileWriter=new FileWriter(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		if(fileWriter!=null){
			System.out.println("Reading file ::"+file.getName());
		}
		
	}

}
