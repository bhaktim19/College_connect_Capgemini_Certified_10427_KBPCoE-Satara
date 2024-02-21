package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	private int sid;
	private String sname;
	private int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
}

public class StudentFilter {

	public static void main(String[] args) {
		
		Stream <Student> sm =  getStudents().stream();
		List<Student> fillist = sm.filter(s->s.getMarks()>75).collect(Collectors.toList());
		
		System.out.println("Using Stream API:");
		System.out.println("List of students with marks above 75:");
		System.out.println(fillist);
		
	}
	
	public static List<Student> getStudents(){
		
		List<Student> slist1=new ArrayList<Student>();
		slist1.add(new Student(1,"Bhakti",98));
		Student s1=new Student(2,"Samruddhi",78);
		slist1.add(s1);
		slist1.add(new Student(3,"Anurag",80));
		slist1.add(new Student(4,"Priyanka",60));
		slist1.add(new Student(5,"Swaraj",45));
		
		return slist1;
		
	}

}
