package prototype_pattern;

import java.util.List;

public class PrototypeTesting {

	public static void main(String[] args) throws CloneNotSupportedException {
		//creating emp object and load some dummy data
		Employees emp=new Employees();
		emp.loadData();
		System.out.println("emp: "+emp.getEmpList());

		
		//creating two objects by cloning the emp object run time
		//creating object by using new operator happened at compile time
		Employees emp1=(Employees) emp.clone();
		Employees emp2=(Employees) emp.clone();
		
		List<String> emp1List=emp1.getEmpList();
		emp1List.add("Faroque");
		System.out.println("emp1: "+emp1List);
		
		List<String> emp2List=emp2.getEmpList();
		emp2List.remove("1");
		System.out.println("emp2: "+emp2List);
		
		
	}

}
