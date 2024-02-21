package com.edu.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee{
	private int eid;
	private String ename;
	private float salary;
	private String dname;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, float salary, String dname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dname = dname;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dname=" + dname + "]";
	}
	
}

class EmpIdSort implements Comparator<Employee> {

	@Override
	public int compare(Employee E1, Employee E2) {
		if(E1.getEid()>E2.getEid())
			return 1;
		if(E1.getEid()< E2.getEid())
			return -1;
		else
			return 0;
	}
	
}

public class MainAppEmployee {

	public static void main(String[] args) {
		Employee E1 = new Employee(2, "John" ,1000, "Development" );
		Employee E2 = new Employee(1, "Max" ,2000, "Research" );
		Employee E3 = new Employee(3, "Ayan" ,5000, "Markrting" );
		Employee E4 = new Employee(5, "Sam" ,4000, "Loan" );
		Employee E5 = new Employee(4, "Plank" ,3000, "Planning" );
		
		List<Employee> elist =new ArrayList<Employee>();
		
		elist.add(E1);
		elist.add(E2);
		elist.add(E3);
		elist.add(E4);
		elist.add(E5);
		
		Iterator<Employee> eit = elist.iterator();
		
		System.out.println("EID\tENAME\tSALARY\tDEPT");
		System.out.println("----------------------------------");
		while(eit.hasNext()) {
		Employee eobj=eit.next();
		System.out.println(eobj.getEid()+"\t"+eobj.getSalary()+"\t"+eobj.getEname()+"\t"+ eobj.getDname());
		}
		
		Collections.sort(elist, new EmpIdSort());
		System.out.println("After Sorting with EID");
		
		Iterator<Employee> eitr = elist.iterator();
		System.out.println("EID\tENAME\tSALARY\tDEPT");
		System.out.println("----------------------------------");
		while(eitr.hasNext()) {
			Employee eob = eitr.next();
			System.out.println(eob.getEid()+"\t"+eob.getEname()+"\t"+eob.getSalary()+"\t"+eob.getDname());
					
		}

	}

}
