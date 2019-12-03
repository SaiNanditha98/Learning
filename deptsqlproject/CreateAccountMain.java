package com.hcl.dept;

import java.util.List;

public class CreateAccountMain {

	public static void main(String[] args) {
		DepartmentDAO dao=new DepartmentDAO();
		List<Department> departmentList=dao.showDepartment();
		for (Department department : departmentList) {
			System.out.println("Department No " +department.getDeptno());
			System.out.println("Department Name " +department.getDname());
			System.out.println("Department " +department.getLoc());
			System.out.println("Designation " +department.getCity());
			System.out.println("Salary " +department.getHead());
			System.out.println("-------------------------------");
		}
				
	}
}
