package quiz01;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		CompanyServiceImpl com = new CompanyServiceImpl();
		Scanner input = new Scanner(System.in);
		String name, grade;
		int user;
		
		while(true) {
			System.out.println("<CARE LAB 직원 관리 프로그램>");
			System.out.println("1. 특정 사원 등록");
			System.out.println("2. 모든 사원 출력");
			System.out.println("3. 특정 사원 수정");
			System.out.println("4. 특정 사원 검색");
			System.out.println("5. 종료");
			System.out.print(">>>");
			user = input.nextInt();
			
			switch(user) {
				case 1: 
					CompanyDTO dto = new CompanyDTO();
					com.saveWorker(dto);
					break;
				case 2: com.output(); break;
				case 3: 
					System.out.print("수정할 이름 입력: ");
					name = input.next();
					dto = com.search(name);
					com.modify(dto);
					break;
				case 4: 
					System.out.print("찾을 이름 입력: ");
					name = input.next();
					dto = com.search(name);
					System.out.println("이름: " + dto.getName());
					System.out.println("직급: " + dto.getGrade());
					System.out.println("월급: " + dto.getSalary());
					System.out.println("세율: " + dto.getTariff());
					break;
				case 5: System.out.println("프로그램을 종료합니다.");
						System.exit(0);
			}
			
		}
	}
}
