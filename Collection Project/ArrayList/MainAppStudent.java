package com.edu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	private int sid;
	private String sname;
	private float sfees;
	
	//1.generate constructor with no arg (super class constructor)
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//2.constructor with argument
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}

	
	//3.generate setter and getter method
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getSfees() {
		return sfees;
	}

	public void setSfees(float sfees) {
		this.sfees = sfees;
	}

	//4.  toString
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}

public class MainAppStudent {

	public static void main(String[] args) {
		Student s1=new Student(1211,"Swaraj",7685);
		Student s2=new Student(1112,"Priyanka",6685);
		Student s3=new Student(1113,"Samruddhi",1285);
		Student s4=new Student(7114,"Anurag",9685);
		Student s5=new Student(2115,"Bhakthi",17685);
		
		List<Student> stlist =new ArrayList<Student>();
		stlist.add(s1);
		stlist.add(s2);
		stlist.add(s3);
		stlist.add(s4);
		stlist.add(s5);
		
		Iterator<Student> stit = stlist.iterator();
		
		System.out.println("SID\tSNAM\tSFESS");
		System.out.println("------------------------");
		while(stit.hasNext()) {
		Student sobj=stit.next();
		//System.out.println(sobj);
		System.out.println(sobj.getSid()+"\t"+sobj.getSfees()+"\t"+sobj.getSname());
		}
		
		stlist.clear();
		System.out.println(stlist);

	}

}
