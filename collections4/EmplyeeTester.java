package com.ey.collections4;

public class EmplyeeTester {
	public static void main(String[] args) {
		Emplyeevalidator ev= new Emplyeevalidator();
		Employee e1=new Employee(1,"Rushil","Deshwar");
		Employee e2=new Employee(2,"Yugank","Ahuja");
		Employee e3=new Employee(3,"Siddhant","Sinha");
		Employee e4=new Employee(4,"Saksham","Dubey");
		Employee e5=new Employee(5,"Harshil","Bhatt");
		ev.addemployee(e1);
		ev.addemployee(e2);
		ev.addemployee(e3);
		ev.addemployee(e4);
		ev.addemployee(e5);
		
		ev.list();
		
		ev.fnamesort();
		
	}

}
