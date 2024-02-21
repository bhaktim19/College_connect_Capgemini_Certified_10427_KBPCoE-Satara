package com.edu;

class Student{
	
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}

class Classroom{
	
	public String registerStudent(Student student){
		if(!student.getName().toUpperCase().equals(student.getName()))
			return "Block letters needed";
		else if(student.getScore()<0 || student.getScore()>100)
			return "Invalid score";
		else
			return "Registered";
	}
	
	public String studentCard(String card) {
		
		if (card.matches("[0-9]+"))
			return "Valid Card";
		else
			return "Invalid Card";		
	}
}

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("A", 6);
		Classroom cm = new Classroom();
		System.out.println(cm.registerStudent(s1));;

	}

}
