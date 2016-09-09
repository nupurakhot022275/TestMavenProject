package com.psl.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
  public void audienceTakeSeats(){
	  System.out.println("Audience take seats");
  }
  
  public void switchOffPhones(){
	  System.out.println("Audience switch off phones");
  }
  public void demandRefund(){
	  System.out.println("Audience demand refuncnd");
  }
  public void applaud(){
	  System.out.println("Audience appluad ..clap clap");
  }
  public void goHome(){
	  System.out.println("Audience go home");
  }
  public void watchPerformance(ProceedingJoinPoint jp){
	  System.out.println("Audience take seats");
	  System.out.println("Audience switch off phones");
	  
	  //start the stop watch
	  try {
		jp.proceed();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		System.out.println("Audience demand refuncnd");	}//give control to point cut method
	  
	  
	  //stop the stop watch
	  System.out.println("Audience appluad ..clap clap");
	  System.out.println("Audience go home");
  }
}
