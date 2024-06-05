package com.ey.exception;
class OperationException extends RuntimeException{
	OperationException(String msg){
		super(msg);
	}
}


public class Source {
	public boolean validate(Activity a) {
		if(a.getString1().equals(null) && a.getString2().equals(null) && a.getString3() != "+" && a.getString3() != "-") {
			return false;
		}
		else
			return true;
	}
	public String doOperation(Activity a) {
		if(a.getString3()=="+") {
			return a.getString1().concat(a.getString2());
		}
		else {
			String x=a.getString1();
			String y=a.getString2();
			for(int i=0;i<a.getString2().length();i++) {
				char i1=y.charAt(i);
				while(x.contains(i1+"")){
					int itr=x.indexOf(i1);
					x= x.replace((i1+""),"");
				}
				
			}
			return x;
		}
	}

	public static void main(String[] args) {
		Activity a=new Activity("rushil","l","-");
		Source s= new Source();
		try{
		 	if(!s.validate(a)){
				throw new OperationException("Invalid parameters");
		 	}
		 	
			String result=s.doOperation(a);
			System.out.println(result);
			
		}catch(OperationException e){
			e.printStackTrace();
		}
	
	}
}
	