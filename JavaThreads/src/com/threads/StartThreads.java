package com.threads;

public class StartThreads {
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Data datObj=new Data();
		
		ConsumerThread t1=new ConsumerThread(datObj);
		ConsumerThread t2=new ConsumerThread(datObj);
		ConsumerThread t3=new ConsumerThread(datObj);
		ProducerThread t4=new ProducerThread(datObj);
		
		t1.setName("T1-Thread");
		t2.setName("T2-Thread");
		t3.setName("T3-Thread");
		t4.setName("T4-Thread");
		
		t1.start();
		t2.start();
		t3.start();
		try{
			Thread.sleep(15000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		t4.start();
		System.out.println("X value is: "+datObj.getX());
		System.out.println("Main method ended");
	}

}
