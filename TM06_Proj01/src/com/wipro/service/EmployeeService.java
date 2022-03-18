package com.wipro.service;

import java.util.*;

import com.wipro.bean.EmployeeBean;

public class EmployeeService {
	private List<EmployeeBean>listEmp=new ArrayList<>();
	public boolean insertEmployee(EmployeeBean bean) {
		return listEmp.add(bean);
	}
	public List<EmployeeBean> fetchAllEmployee(){
		return listEmp;
	}
	public boolean deleteEmployeeByEmpID(int empId) {
		for(int i=0;i<listEmp.size();i++) {
			if(listEmp.get(i).getEmpId()==empId) {
				listEmp.remove(i);
				return true;
			}
		}
		return false;
	}
	public EmployeeBean findEmployeeByEmpID(int empID) {
		for(int i=0;i<listEmp.size();i++) {
			if(listEmp.get(i).getEmpId()==empID) {
				return listEmp.get(i);
			}
		}
		return null;
	}
	public boolean updateEmployeeByEmpID(EmployeeBean bean) {
		for(int i=0;i<listEmp.size();i++) {
			if(listEmp.get(i).getEmpId()==bean.getEmpId()) {
				listEmp.get(i).setEmpId(bean.getEmpId());
				listEmp.get(i).setName(bean.getName());
				listEmp.get(i).setDesignation(bean.getDesignation());
				listEmp.get(i).setSalary(bean.getSalary());
				return true;
			}
		}
		return false;
	}
}
