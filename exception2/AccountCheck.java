package com.ey.exception2;
import java.util.*;
class AccountErrorException extends RuntimeException{
	AccountErrorException(String msg){
		super(msg);
	}
}
public class AccountCheck {
	boolean isvalidaccount(Set keys,int a) {
		if(keys.contains(a))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Map<Integer, String> m =new HashMap<Integer, String>();
		m.put(101, "rushil");
		m.put(102, "max");
		m.put(103, "aditya");
		m.put(104, "rajkumar");
		m.put(105, "harshil");
		Set keys=m.keySet();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the acc number");
		int acc=sc.nextInt();
		AccountCheck ac=new AccountCheck();
		boolean b=ac.isvalidaccount(keys,acc);
		if(b) {
			System.out.println(m.get(acc));
		}
		else
			throw new AccountErrorException("There is no user with this account");

		
		
	}

}
