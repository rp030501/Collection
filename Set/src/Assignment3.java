import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee{
	private int empId;
	private String name;
	private float Salary;
	public Employee(int empId, String name, float Salary) {
		
		this.empId = empId;
		this.name = name;
		this.Salary = Salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
}
class NewComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		if(e1.getSalary()<e2.getSalary()) {
			return -1;
		}
		else{
			return 1;
		}
		
	}
}
public class Assignment3 {
	public static void main(String[] args) {
		Employee emp1=new Employee(1,"Rahul",4000F);
		Employee emp2=new Employee(2,"Rohit",50000F);
		Employee emp3=new Employee(3,"Prathmesh",10000F);
		TreeSet ts=new TreeSet(new NewComparator());
		
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		Iterator it=ts.iterator();
		System.out.println(ts);
		Employee check;
		while(it.hasNext()){
			check=(Employee) it.next();
			System.out.println("Employee Name: "+check.getName()+" Employee Id: "+check.getEmpId()+" Employee Salary: "+check.getSalary());
		}
		
	}
}
