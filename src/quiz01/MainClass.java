package quiz01;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		CompanyServiceImpl com = new CompanyServiceImpl();
		Scanner input = new Scanner(System.in);
		String name, grade;
		int user;
		
		while(true) {
			System.out.println("<CARE LAB ���� ���� ���α׷�>");
			System.out.println("1. Ư�� ��� ���");
			System.out.println("2. ��� ��� ���");
			System.out.println("3. Ư�� ��� ����");
			System.out.println("4. Ư�� ��� �˻�");
			System.out.println("5. ����");
			System.out.print(">>>");
			user = input.nextInt();
			
			switch(user) {
				case 1: 
					CompanyDTO dto = new CompanyDTO();
					com.saveWorker(dto);
					break;
				case 2: com.output(); break;
				case 3: 
					System.out.print("������ �̸� �Է�: ");
					name = input.next();
					dto = com.search(name);
					com.modify(dto);
					break;
				case 4: 
					System.out.print("ã�� �̸� �Է�: ");
					name = input.next();
					dto = com.search(name);
					System.out.println("�̸�: " + dto.getName());
					System.out.println("����: " + dto.getGrade());
					System.out.println("����: " + dto.getSalary());
					System.out.println("����: " + dto.getTariff());
					break;
				case 5: System.out.println("���α׷��� �����մϴ�.");
						System.exit(0);
			}
			
		}
	}
}
