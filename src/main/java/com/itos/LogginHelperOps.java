package com.itos;

import org.apache.log4j.Logger;

 class LogginHelperOps{
	
	final static Logger logger = Logger.getLogger(LogginHelperOps.class);
	
	public static void main(String[] args) {
	
		LogginHelperOps obj = new LogginHelperOps();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){

			logger.error("Sorry, something wrong in your calculation!", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 10 /0;

	}
	
}