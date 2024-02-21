package com.edu.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student1{
	private int sid;
	private String sname;
	private float sfees;
	
	//1.generate constructor with no arg (super class constructor)
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	//2.constructor with argument
	public Student1(int sid, String sname, float sfees) {
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

// sort based on ID
class StudentIdSort implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if (s1.getSid()>s2.getSid())
			return 1;
		if (s1.getSid()<s2.getSid())
			return -1;
		else
			return 0;
	}
	
}

//sort based on fees

class StudentFeesSort implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if(s1.getSfees()>s2.getSfees()) 
			return 1;
		else if(s1.getSfees()<s2.getSfees())
			return -1;
		else 
			return 0;
	}
}

//sort based on name

class StudentSortName implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		return s1.getSname().compareTo(s2.getSname());
	}
	
}

public class SortStudent {

	public static void main(String[] args) {
		Student1 s1=new Student1(5,"Swaraj",7685);
		Student1 s2=new Student1(3,"Priyanka",6685);
		Student1 s3=new Student1(4,"Samruddhi",1285);
		Student1 s4=new Student1(1,"Anurag",9685);
		Student1 s5=new Student1(2,"Bhakthi",17685);
		
		List<Student1> stlist = new ArrayList<Student1>();
		stlist.add(s1);
		stlist.add(s2);
		stlist.add(s3);
		stlist.add(s4);
		stlist.add(s5);
		
		Iterator<Student1> stit = stlist.iterator();
		
		System.out.println("SID\tSFEES\tSNAME");
		System.out.println("------------------------");
		while(stit.hasNext()) {
			Student1 sobj=stit.next();
			//System.out.println(sobj);
			System.out.println(sobj.getSid()+"\t"+sobj.getSfees()+"\t"+sobj.getSname());
		}
		
		// sort based on ID
		Collections.sort(stlist, new StudentIdSort());
		System.out.println("After sorting student details based on id");
		
		Iterator<Student1> sit=stlist.iterator();
		
		System.out.println("ID\tSFEES\tSNAME");
		while(sit.hasNext()) {
			Student1 sob = sit.next();
			System.out.println(sob.getSid()+"\t"+sob.getSfees()+"\t"+sob.getSname());
		}
		
		
		//sort based on fees
		Collections.sort(stlist,new StudentFeesSort());
		System.out.println("After sorting student details based fees");
		
		Iterator<Student1> sit1=stlist.iterator();
		
		System.out.println("ID\tSFEES\tSNAME");
		while(sit1.hasNext()) {
			Student1 sob = sit1.next();
			System.out.println(sob.getSid()+"\t"+sob.getSfees()+"\t"+sob.getSname());
		}
		
		//based on name
		Collections.sort(stlist, new StudentSortName());
		System.out.println("Sort Student details based on name");
		
		Iterator<Student1> sitname = stlist.iterator();
		
		System.out.println("ID\tFees\tName");
		
		while(sitname.hasNext()) {
			Student1 sob = sitname.next();
			System.out.println(sob.getSid()+"\t"+sob.getSfees()+"\t"+sob.getSname());
		}
		
		
	}

}
