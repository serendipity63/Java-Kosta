import emp.BusinessTrip;
import emp.Employee;

public class Company {
	Employee[] emps = new Employee[100];
	int empCnt = 0;

	public void enter(Employee emp) { // Employee emp=emp1// upcasting
		emps[empCnt++] = emp;
	}

	public void allEmployeeInfo() {
		for (int i = 0; i < empCnt; i++) {
			System.out.println(emps[i].info());
		}
	}

	public int getTotalPay() {
		int tot = 0;
		for (int i = 0; i < empCnt; i++) {
			tot += emps[i].getPay();
		}
		return tot;
	}

	public void regBusinessTrip(BusinessTrip emp, int days) { // 두개의 공통분모들 가져오는 개념
		emp.travel(days);
	}
}
