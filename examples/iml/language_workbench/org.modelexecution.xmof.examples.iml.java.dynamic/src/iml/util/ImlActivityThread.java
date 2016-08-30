package iml.util;

import iml.Activity;

public class ImlActivityThread extends Thread{

	private int d;
	private int sd;
	private int timeout;
	private Activity callingActivity;
	
	public ImlActivityThread(int d, int sd, int timeout, Activity callingActivity){
		this.d = d;
		this.sd = sd;
		this.timeout = timeout;
		this.callingActivity = callingActivity;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < sd; i++){
			if(i>=d){
				System.out.println("Activity '" + callingActivity.getName() + "' executed at time " + i);			
				try {
					Thread.sleep(timeout);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("Activity '" + callingActivity.getName() + "' waiting at time " + i);
				try {
					Thread.sleep(timeout);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		callingActivity.callback();
		
	}
}
