package com.edu;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.
	private String prof;
	private String major;

	public CollegeStudent() {
	}

	public CollegeStudent(String prof, String major) {
		super();
		this.prof = prof;
		this.major = major;
	}
	// 생성자.

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	// toString()
	@Override
	public String toString() {
		return "CollegeStudent [studNo=" + getStudNo() + ", studName=" + getStudName() + ", score=" + getScore() + ", prof=" + prof + ", major=" + major +"]";
	}
}
