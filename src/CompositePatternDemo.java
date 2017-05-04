
public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee CEO = new Employee("Paulo", "CEO", 50000);
		
		Employee HeadSales = new Employee("Nary","Head Sales",30000);
		Employee HeadMarketing = new Employee("Lyza", "HeadMarketing", 30000);
		
		Employee Clerk1 = new Employee("Gilberto","Marketing", 2000);
		Employee Clerk2 = new Employee("Italo", "Marketing", 2000);
		Employee Clerk3 = new Employee("Matheus", "Marketing", 2000);
		
		Employee SalesExecutive1 = new Employee("Charles","Sales", 2500);
		Employee SalesExecutive2 = new Employee("Vinícius", "Sales", 2500);
		Employee SalesExecutive3 = new Employee("Celina", "Sales", 2500);
		
		
		CEO.add(HeadSales);     //add Nary
		CEO.add(HeadMarketing); //Add Lyza
		
		HeadSales.add(SalesExecutive1); //add Charles
		HeadSales.add(SalesExecutive2); //add Vinicius
		HeadSales.add(SalesExecutive3); //add Celina
		
		HeadMarketing.add(Clerk1); //add Gilberto
		HeadMarketing.add(Clerk2); //add Italo
		HeadMarketing.add(Clerk3); //add Matheus
		
		System.out.println(CEO);
		
		for(Employee headEmployee: CEO.getSubordinates()){
			System.out.println(headEmployee);
			
			for(Employee employee: headEmployee.getSubordinates()){
				System.out.println(employee);
			}
		}
		

		
		
	}

}
