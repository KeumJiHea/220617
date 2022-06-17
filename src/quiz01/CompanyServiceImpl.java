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
		System.out.println("������ ����մϴ�.");
		System.out.print("�̸�: ");
		name = input.next();
		System.out.print("����: ");
		grade = input.next();
		
		dto.setName(name);
		dto.setGrade(grade);
		
		switch(grade) {
		case "����": 
			dto.setSalary(300);
			dto.setTariff(0.01);
			break;
		case "����": 
			dto.setSalary(400);
			dto.setTariff(0.02);
			break;
		case "å��": 
			dto.setSalary(600);
			dto.setTariff(0.03);
			break;
		}
		
		arr.add(dto);
	}


	public void modify(CompanyDTO dto) {
		System.out.println("�̸�: " + dto.getName());
		System.out.println("����: " + dto.getGrade());
		System.out.println("����: " + dto.getSalary());
		System.out.println("����: " + dto.getTariff());
		System.out.println("--------------------------");
		System.out.println("������ ���� �Է����ּ���.");
		System.out.print("����: ");
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
		System.out.println("��� ����� ����մϴ�.");
		System.out.println("--------------------------");
		for(CompanyDTO dto : arr) {
			System.out.println("�̸�: " + dto.getName());
			System.out.println("����: " + dto.getGrade());
			System.out.println("����: " + dto.getSalary());
			System.out.println("����: " + dto.getTariff());
			System.out.println("--------------------------");
		}
		
	}
}
