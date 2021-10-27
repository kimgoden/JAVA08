package project09;

public abstract class Member implements TASK {
String name;
String id;
String pw;


public Member(String name, String id, String pw) {
	this.name = name;
	this.id = id;
	this.pw= pw;

			
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPw() {
	return pw;
}

public void setPw(String pw) {
	this.pw = pw;
}


}

class Student extends Member{
	private String major;
	public Student(String name, String id, String pw,String major) {
		super(name, id, pw);
		this.major = major;
}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("공부를 합니다");
	}
	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("시험을 봅니다");
	}
}
class Teacher extends Member{
	private String subject;
	public Teacher(String name, String id, String pw,String subject) {
		super(name, id, pw);
		this.subject = subject;
}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("강의를 합니다");
	}
	@Override
	public void text() {
		// TODO Auto-generated method stub
		System.out.println("채점을 합니다");
	}
}
