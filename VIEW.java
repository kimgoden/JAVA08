package project09;

import java.util.Scanner;

public class VIEW {
	public static int menu(){
		System.out.println("�׸� ����Ʈ�� ���� ���� ȯ���մϴ�.");
		System.out.println("�޴��� ������ �ּ���.");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ���α׷� ����");
		System.out.print("����>");
		int selectNum = MAIN03.scan.nextInt();
		return selectNum;

	}
	public static void userfault() {
		System.out.println("�߸� �Է��߽��ϴ�.");
		System.out.println("�ٽ� Ȯ�����ּ���.");
	}
	public static boolean exit() {
		System.out.println("���α׷��� �����Ͻðڽ��ϱ�? (y/n)");
		String exitAnswer = MAIN03.scan.next();
		
		if(exitAnswer.equals("Y") || exitAnswer.equals("y")) {
			System.out.println("���α׷��� �����մϴ�.");
			return true;
		}else if(exitAnswer.equals("N") || exitAnswer.equals("n")) {
			 System.out.println("���α׷��� �������� �ʽ��ϴ�.");
			return false;
		}else {
			userfault();
			return false;
		
	}
	}

	public static Member signUp() {
		Member m = null;
		System.out.println("ȸ�� ������ �����մϴ�.");
		System.out.println("ID�� �Է��ϼ���.");
		String id = MAIN03.scan.next();
		System.out.println("��ȣ�� �Է��ϼ���.");
		String pw = MAIN03.scan.next();
		System.out.println("�̸��� �Է��ϼ���.");
		String name = MAIN03.scan.next();
		
		System.out.println("1.������ | 2.�л�");
		int selectPosition = Integer.parseInt(MAIN03.scan.next());
		
		if(selectPosition == 1) {
			System.out.println("��� ������ �Է��ϼ���");
			String subject = MAIN03.scan.next();		
			m = new Teacher(name,id,pw,subject);
			
		}else if(selectPosition == 2) {
			System.out.println("������ �Է��ϼ���");
			String major = MAIN03.scan.next();
			m = new Student(name,id,pw,major);
		}
		return m;
	}
	public static String[] signIn() {
		String[] login = new String[2];
		System.out.println("�α��� ������ �����մϴ�.");
		System.out.println("ID�� �Է��ϼ���.");
		login[0] = MAIN03.scan.next();
		System.out.println("��ȣ�� �Է��ϼ���.");
		login[1] = MAIN03.scan.next();
		
		return login;
}
	public static void signInFail() {
		System.out.println("�α��ο� �����߽��ϴ�.");
		System.out.println("���̵� �Ǵ� ��ȣ�� �ٽ� Ȯ���� �ּ���.");
	}
}