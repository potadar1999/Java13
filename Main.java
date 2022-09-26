package com.student;

public class Main {
	
	public static Object[] changeArray(Object[] obj) {
		
		for(Object ob:obj) {
			
			int index=0;
			
			if(ob instanceof Student) {
				Student s1=(Student)ob;
				s1.setMarks(s1.getMarks()+10);
			}
			else if(ob instanceof Employee) {
				Employee e1=(Employee)ob;
				e1.setSalary(e1.getSalary()+1000);
			}
			else if(ob instanceof String) {
				String string=(String)ob;
				StringBuilder sb=new StringBuilder(string);
				sb.reverse();
				obj[index]=sb;
	
			}
			index++;
				
		}
		return obj;

	}
	

	public static void main(String[] args) {
		

		Object[] obj= {new Student(23, "rakesh", 450),new Employee(12, "Lokesh", 84000),"String",50};
		
		
		for(Object ob:obj) {
			System.out.println(ob);
		}
		
		System.out.println("======================");
		
		Object[] object=changeArray(obj);
		
		for(Object ob: object) {
			System.out.println(ob);
		}
		}
		

}
