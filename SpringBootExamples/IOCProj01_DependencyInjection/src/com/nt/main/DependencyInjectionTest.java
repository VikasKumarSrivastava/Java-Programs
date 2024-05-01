package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String args[]) {
		System.out.println("DependencyInjectionTest.main()==> start");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
//		WishMessageGenerator generator1 = ctx.getBean("wmg",WishMessageGenerator.class);
//		WishMessageGenerator generator2 = ctx.getBean("wmg",WishMessageGenerator.class);
		
		String resultMsg = generator.showWishMessage("raja");
		
		System.out.println(resultMsg);
		
		ctx.close();
		System.out.println("DependencyInjectionTest.main()==>end");
	}

}
