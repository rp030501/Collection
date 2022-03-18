package com.wipro.main;

import java.util.List;

import com.wipro.bean.EmployeeBean;
import com.wipro.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService ES=new EmployeeService();
		EmployeeBean EB1=new EmployeeBean(1,"A",1200F,"Mech");
		EmployeeBean EB2=new EmployeeBean(2,"B",1400F,"IT");
		EmployeeBean EB3=new EmployeeBean(3,"C",1600F,"Elec");
		
		ES.insertEmployee(EB1);
		ES.insertEmployee(EB2);
		ES.insertEmployee(EB3);
		
		ES.updateEmployeeByEmpID(new EmployeeBean(1,"B",1400F,"Comp"));
		ES.deleteEmployeeByEmpID(3);
		List<EmployeeBean> employee=ES.fetchAllEmployee();
		for(int i=0;i<employee.size();i++) {
			System.out.print(employee.get(i).getEmpId()+" ");
			System.out.print(employee.get(i).getName()+" ");
			System.out.print(employee.get(i).getSalary()+" ");
			System.out.print(employee.get(i).getDesignation()+" ");
			System.out.println();
		}

	}

}
