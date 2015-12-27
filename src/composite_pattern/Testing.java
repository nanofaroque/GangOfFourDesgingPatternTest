package composite_pattern;

public class Testing {

	public static void main(String[] args) {
		Employee CEO=new Employee("Faroque", "CEO", 150000);
		
		Employee headMarketing=new Employee("X", "Head Marketing", 120000);
		Employee headSales=new Employee("X", "Head Sales", 120000);
		
		Employee clerk1 = new Employee("Laura","Marketing", 10000);
	    Employee clerk2 = new Employee("Bob","Marketing", 10000);

	    Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
	    Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

	    CEO.add(headSales);
	    CEO.add(headMarketing);

	    headSales.add(salesExecutive1);
	    headSales.add(salesExecutive2);

	    headMarketing.add(clerk1);
	    headMarketing.add(clerk2);
	    
	    System.out.println(CEO);
	    
	    for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }	
	}

}
