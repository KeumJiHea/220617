package quiz01;

import java.util.ArrayList;
import java.util.Scanner;


public class CompanyServiceImpl implements CompanyService {
	Scanner input = new Scanner(System.in);
	ArrayList<CompanyDTO> arr;
	String name, grade;
	
	public CompanyServiceImpl() {
		arr = new ArrayList<CompanyDTO>();
	}
	
	public void saveWorker(CompanyDTO dto) {
		System.out.println("직원을 등록합니다.");
		System.out.print("이름: ");
		name = input.next();
		System.out.print("직급: ");
		grade = input.next();
		
		dto.setName(name);
		dto.setGrade(grade);
		
		switch(grade) {
		case "인턴": 
			dto.setSalary(300);
			dto.setTariff(0.01);
			break;
		case "선임": 
			dto.setSalary(400);
			dto.setTariff(0.02);
			break;
		case "책임": 
			dto.setSalary(600);
			dto.setTariff(0.03);
			break;
		}
		
		arr.add(dto);
	}


	public void modify(CompanyDTO dto) {
		System.out.println("이름: " + dto.getName());
		System.out.println("직급: " + dto.getGrade());
		System.out.println("월급: " + dto.getSalary());
		System.out.println("세율: " + dto.getTariff());
		System.out.println("--------------------------");
		System.out.println("수정할 값을 입력해주세요.");
		System.out.print("직급: ");
		grade = input.next();
	}


	public CompanyDTO search(String name) {
		int i=0;
		CompanyDTO dto = new CompanyDTO();
		for(; i<arr.size() ; i++) {
			dto = arr.get(i);
			if(dto.getName().equals(name)) {
				break;
			}
		}
		return dto;
	}


	public void output() {
		System.out.println("모든 사원을 출력합니다.");
		System.out.println("--------------------------");
		for(CompanyDTO dto : arr) {
			System.out.println("이름: " + dto.getName());
			System.out.println("직급: " + dto.getGrade());
			System.out.println("월급: " + dto.getSalary());
			System.out.println("세율: " + dto.getTariff());
			System.out.println("--------------------------");
		}
		
	}
}
