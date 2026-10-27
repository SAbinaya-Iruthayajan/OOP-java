class Emloyee{
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	void setEmloyee(int id, String name, double basicSalary){
			this.id = id;
			this.name = name;
			this.basicSalary = basicSalary;
			
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
		
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Basic Salary: " + this.basicSalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Net Salary: " + netSalary);
		
	}
	
}
		
			