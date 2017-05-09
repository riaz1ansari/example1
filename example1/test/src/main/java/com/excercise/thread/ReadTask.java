package com.excercise.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTask implements Runnable{

	private FileReader filereader;
	private File file;
	
	public ReadTask(File file,Mutex mutex) {
		try {
			this.file=file;
			filereader=new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		
		
		if(filereader!=null){
			System.out.println("Reading file ::"+file.getName());
		}
		
	}

}
