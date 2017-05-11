package com.example.push;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class DfcSuborderPush {

	static String url = "http://172.16.0.70:9014/api/1/fc/pushsuborder?id=";

	public static void main(String[] args) throws IOException {
		PrintStream out=new PrintStream(new File("logs.txt"));
		System.setOut(out);
		System.setErr(out);
		
		String[] suborders = readFile(
				"/home/riaz/Project/workspace/test-project/src/main/java/com/example/push/suborders.txt")
				.split(",");
		
		ThreadPool pool=new ThreadPool(10);
		
		for (int i = 0; i < suborders.length; i++) {
		/*	System.out.println(suborders[i]);
			//HttpClient client = HttpClientBuilder.create().build();
			DefaultHttpClient client = new DefaultHttpClient();
			
			HttpGet request = new HttpGet(url + suborders[i]);
			HttpResponse response = client.execute(request);
			System.out.println("Response Code : "
					+ response.getStatusLine().getStatusCode());
		 */
			
			pool.submitTask(new Task(suborders[i]));
		}
		

	}

	private static String readFile(String path) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded);
	}

	
	/*@Scheduled(cron = "0 0/50 * * * *")
	public void fetchAndPush(){
		
	}
	*/
	
	public static void push(String suborder) throws Exception{
		System.out.println(suborder);
		//HttpClient client = HttpClientBuilder.create().build();
		DefaultHttpClient client = new DefaultHttpClient();
		
		HttpGet request = new HttpGet(url + suborder);
		HttpResponse response = client.execute(request);
		System.out.println("Response Code : "
				+ response.getStatusLine().getStatusCode() +" suborder::"+suborder);
	}
	
}

class Executor implements Runnable{
	
	BlockingQueue<Runnable> tasks;
	
	public Executor(BlockingQueue<Runnable> tasks) {
		this.tasks=tasks;
	}


	public void run() {
		while (true) {
			try {
				//System.out.println("Executing thread with task"+ Thread.currentThread());
				Runnable runnable=tasks.take();
				runnable.run();
				//Thread.sleep(2000);
				//System.out.println("Finished Executing thread with task"+ Thread.currentThread());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
}

class Task implements Runnable{

	String suborder;
	
	public Task(String suborder) {
		this.suborder=suborder;
	}

	public void run() {
		try {
			DfcSuborderPush.push(suborder);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getSuborder() {
		return suborder;
	}
	public void setSuborder(String suborder) {
		this.suborder = suborder;
	}
	
}


class ThreadPool{
	
	BlockingQueue<Runnable> tasks= new ArrayBlockingQueue<Runnable>(11000);
	
	public ThreadPool(int poolsize) {
		for (int i = 0; i < poolsize; i++){
			Executor exec=new Executor(tasks);
			Thread t=new Thread(exec,"Thread::"+(i+1));
			t.start();
		}
	}
	
	public void submitTask(Runnable task){
		try {
			this.tasks.put(task);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
