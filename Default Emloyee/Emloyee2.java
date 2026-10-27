class Emloyee2{
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	void setEmloyee2(){
			id = 2002;
			name = "Sara";
			basicSalary = 60000;
			
	}
	void Calcbonus(){
		if(basicSalary > 100000){
			bonus = basicSalary * 0.10;
		}
		else{
			bonus = basicSalary * 0.05;
			}
	}
	
	void Display(){
		double netSalary = basicSalary  + bonus;
		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Net Salary: " + netSalary);
		
	}
}