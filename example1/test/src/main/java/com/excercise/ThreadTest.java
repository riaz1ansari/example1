package com.excercise;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadPool pool=new ThreadPool(20);
		
		for (int i=0;i<100;i++){
			final int k=i;
			pool.submitTask(new Runnable(){
				public void run(){
					System.out.println("Task processing:"+ k);
				}
			});			
		}
		
	}
}


class ThreadPool{
	
	BlockingQueue<Runnable> tasks= new ArrayBlockingQueue<Runnable>(10);
	
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

class Executor implements Runnable{
	
	BlockingQueue<Runnable> tasks;
	
	public Executor(BlockingQueue<Runnable> tasks) {
		this.tasks=tasks;
	}


	public void run() {
		while (true) {
			try {
				System.out.println("Executing thread with task"+ Thread.currentThread());
				Runnable runnable=tasks.take();
				runnable.run();
				Thread.sleep(2000);
				System.out.println("Finished Executing thread with task"+ Thread.currentThread());
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
}

