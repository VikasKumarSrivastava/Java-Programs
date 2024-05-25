package com.nt.sbeans;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	//@Autowired
	private LocalDateTime dateTime;
	//@Autowired
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
//	@Autowired
//	public WishMessageGenerator(LocalDateTime dateTime) {
//		System.out.println("WMG 1 paramter constructor called");
//		this.dateTime =dateTime;
//	}
	
//	@Autowired
//	public void assignDate(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator.assignDate()");
//		this.dateTime = dateTime;
//	}
//	@Autowired
//	public void setDateTime(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator.setDateTime()");
//		this.dateTime = dateTime;
//	}
	
	public String showWishMessage(String user) {
		int hour = dateTime.getHour();
		System.out.println(hour);
		if (hour<12) 
			return "Good Morning:"+user;
		else if(hour < 16)
			return "Good Afternoon:"+user;
		else if(hour <20)
			return "Good Evening:"+user;
		else
			return "Good Night:"+user;
		
	}


	

}



