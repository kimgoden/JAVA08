package project09;

public class MAINController {
	public MAINController() {
			init();
		programStart();
	}		
	
private void programStart() {//�α��� ������ �ۼ��� �ڵ� �ǰڴ�
	//�޴�  1. ��������, 2. �α׾ƿ�
	
}
private void init() {
	while (true) {
		int selectMenu = VIEW.menu();

		switch (selectMenu) {
		case 1:// ȸ�� ����
			Member m = VIEW.signUp();
			if (m == null) {
				VIEW.userfault();
			} else {
				for (int i = 0; i < MAIN03.members.length; i++) {
					if (MAIN03.members[i] == null) {
						MAIN03.members[i] = m;
						break;
					}
				}
			}
			break;
		case 2:// �α���
			String[] login = VIEW.signIn();

			int idx = -1;

			for (int i = 0; i < MAIN03.members.length; i++) {
				if (MAIN03.members[i] == null) {
					continue;
				} else if (MAIN03.members[i].getId().equals(login[0])
						&& MAIN03.members[i].getPw().equals(login[1])) {
					// �α��� ����
					task(MAIN03.members[i]);
					idx = i;
				}
			}
			if (idx == -1) {
				VIEW.signInFail();
			}
			break;
		case 3:// ���α׷� ����
			if (VIEW.exit()) {
				System.exit(0);
			}
			break;
		default:
			VIEW.userfault();
		}
	}
}

private void task(Member member) {
	member.work();
	member.text();
}
}
	


