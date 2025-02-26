package com.learning.Hibernate.CRUD;

public class Main {

	public static void main(String[] args) {
		//Employee e1 = new Employee("Hars","dev");
		//System.out.println(EmployeeUtil.addEmployee(e1));
		
		//Employee e = EmployeeUtil.getEmployeeById(1);
		//System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getDeptName());
		
//		Employee newEmp = new Employee();
//		newEmp.setEmpName("Vivek");
//		newEmp.setDeptName("testing");
//		System.out.println(EmployeeUtil.updateEmployee(1, newEmp));
		
		System.out.println(EmployeeUtil.deleteEmployee(1));
		
	}

}
