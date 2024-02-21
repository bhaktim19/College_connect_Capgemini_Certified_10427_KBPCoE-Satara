package com.edu.pattern;

class Student{
	private String rollno;
	private String name;
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class StudentView{
	public void printStudentDetails(String sname,String srollno) {
		System.out.println("Student: ");
		System.out.println("Name: " + sname);
		System.out.println("Roll no: " + srollno);
	}
}

class StudentController{
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}

	 public void setStudentName(String name){
	      model.setName(name);		
	   }

	   public String getStudentName(){
	      return model.getName();		
	   }

	   public void setStudentRollNo(String rollNo){
	      model.setRollno(rollNo);		
	   }

	   public String getStudentRollNo(){
	      return model.getRollno();		
	   }
	
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollno());
	}
	
	
}
public class MVCPatternMain {

	public static void main(String[] args) {
		//fetch student record based on his roll no from the database
	      Student model  = retriveStudentFromDatabase();

	      //Create a view : to write student details on console
	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setStudentName("John");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Robert");
	      student.setRollno("10");
	      return student;

	}

}
