package co.kiran;

public class MyThread implements Runnable {
	private Thread t;
	private String threadName;
	public MyThread(String name){
		threadName = name;
	}

	@Override
	public void run() {
		System.out.println(threadName +": is first Thread is running");
	
	for(int i =3; i>0;i--) {
		System.out.println("Thread "+threadName+","+i);
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}System.out.println
		("Thread "+ threadName + " exiting");
	}
	}
	public void go() {
		t = new Thread(this,threadName);
		t.start();
	}
	

}
//1.Implement Runnable interface
//2.Extend Thread class
