package com.practice.oop.Day5;

public class SMSService {
	static int cnt;

		public void sendSMS(String to, String message) {
	        // Simulated API call
	    	
	    	
	        if (to == null || message == null || to.length() != 10) {
	            System.out.println("❌ Invalid mobile number or message!");
	            return;
	        }
	        cnt+=1;
	        System.out.println("✅ SMS sent to " + to + ": " + message);
	        System.out.println("Total message= "+  cnt);
	    }
	
}
 