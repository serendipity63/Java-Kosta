package com.test05;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
		Employee employee1 = new Secretary("홍길동", 1, "Secretary", 800);
		Employee employee2 = new Sales("이순신", 2, "Sales", 1200);
		map.put(employee1.getNumber(), employee1);
		map.put(employee2.getNumber(), employee2);

		System.out.println("name department salary");
		System.out.println("----------------------");
		for (Integer key : map.keySet()) {
			Employee employee = map.get(key);
			System.out.println(employee.getName() + " " + employee.getDepartment() + " " + employee.getSalary());

			if (employee instanceof Bonus) {
				((Bonus) employee).incentive(100);
			}

		}
		// 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다.
		// HashMap에 저장시 키 값은 각 객체의 Number로 한다.
		// 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 )
		// 모든 객체의 인센티브 100씩 지급한다.
		// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
		System.out.println("");
		System.out.println("name department salary tax");
		System.out.println("---------------------------");
		for (Integer key : map.keySet()) {
			Employee employee = map.get(key);
			System.out.println(employee.getName() + " " + employee.getDepartment() + " " + employee.getSalary() + " "
					+ employee.tax());

		}

	}

}
