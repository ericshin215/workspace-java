package kr.co.himedia.object02;

public class Student {
	
	private int studentId;
	private String studentName;
	
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.studentId==stu.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
	

}
