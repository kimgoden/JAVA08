package project09;

import java.util.Scanner;

public class VIEW {
	public static int menu(){
		System.out.println("그린 사이트에 오신 것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택>");
		int selectNum = MAIN03.scan.nextInt();
		return selectNum;

	}
	public static void userfault() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해주세요.");
	}
	public static boolean exit() {
		System.out.println("프로그램을 종료하시겠습니까? (y/n)");
		String exitAnswer = MAIN03.scan.next();
		
		if(exitAnswer.equals("Y") || exitAnswer.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			return true;
		}else if(exitAnswer.equals("N") || exitAnswer.equals("n")) {
			 System.out.println("프로그램을 종료하지 않습니다.");
			return false;
		}else {
			userfault();
			return false;
		
	}
	}

	public static Member signUp() {
		Member m = null;
		System.out.println("회원 가입을 진행합니다.");
		System.out.println("ID를 입력하세요.");
		String id = MAIN03.scan.next();
		System.out.println("암호를 입력하세요.");
		String pw = MAIN03.scan.next();
		System.out.println("이름을 입력하세요.");
		String name = MAIN03.scan.next();
		
		System.out.println("1.선생님 | 2.학생");
		int selectPosition = Integer.parseInt(MAIN03.scan.next());
		
		if(selectPosition == 1) {
			System.out.println("담당 과목을 입력하세요");
			String subject = MAIN03.scan.next();		
			m = new Teacher(name,id,pw,subject);
			
		}else if(selectPosition == 2) {
			System.out.println("전공을 입력하세요");
			String major = MAIN03.scan.next();
			m = new Student(name,id,pw,major);
		}
		return m;
	}
	public static String[] signIn() {
		String[] login = new String[2];
		System.out.println("로그인 절차를 진행합니다.");
		System.out.println("ID를 입력하세요.");
		login[0] = MAIN03.scan.next();
		System.out.println("암호를 입력하세요.");
		login[1] = MAIN03.scan.next();
		
		return login;
}
	public static void signInFail() {
		System.out.println("로그인에 실패했습니다.");
		System.out.println("아이디 또는 암호를 다시 확인해 주세요.");
	}
}