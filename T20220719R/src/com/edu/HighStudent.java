package com.edu;

public class HighStudent extends Student {
//	고등학생정보 : 담임교사, 학년 정보 추가.
	private String teacher;
	private String grade;

	public HighStudent() {
	}

	public HighStudent(String teacher, String grade) {
		super();
		this.teacher = teacher;
		this.grade = grade;
	}
	// 생성자.

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	

	// toString()
	@Override
		public String toString() {
			return "HighStudent [studNo=" + getStudNo() + ", studName=" + getStudName() + ", score=" + getScore() + ", teacher=" + teacher + ", grade=" + grade +"]";
		}

}
