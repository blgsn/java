public class Employee {
    public int id;
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    
    public double tax_rate = 0.03;
    public int the_current_year = 2021;
    
    //Constructor
    public Employee(int id, String name, double salary, int workHours, int hireYear) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
    
    //Overloading / Default Constructor
    public Employee() {
		id = 0;
		name = "empty";
		salary = 0.0;
		workHours = 0;
		hireYear = 0;
	}
    
    
    //Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getHours() {
		return workHours;
	}


	public void setHours(int hours) {
		this.workHours = workHours;
	}


	public int getHireYear() {
		return hireYear;
	}


	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}


	// Auixlary Methods
	public void show_the_Employee() {
        System.out.println("name:"+ this.name + "\nsalary:"+ this.salary + "\nwork hours:"+ this.workHours +
        		"\nhire year:"+ this.hireYear);
    }
	
	
	public void tax() 
	{
		if (this.salary > 1000) {
			System.out.println("The employe salary is over 1000, is Taxable");
			System.out.println("The Salary is : " + this.salary);
			System.out.println("The amount of Tax : " + (this.salary * this.tax_rate));
			this.salary  -= (this.salary * this.tax_rate);
			System.out.println("New Salary : " + this.salary);
		}
		else if (this.salary <= 1000 && this.salary >= 0) {
			System.out.println("The employe salary is under 1000, not Taxable");
			System.out.println("The Salary is : " + this.salary);
		}
		else {
			System.out.println("Negative Salary");
			System.out.println("The Salary is : " + this.salary);
		}
	}
	
	public void bonus() {
		
		if (this.workHours > 40) {
			int bonus_payment = 0;
			int hours = this.workHours-40;
			bonus_payment = hours*30;
			System.out.println("Old Salary : " + this.salary);
			System.out.println("Bonus : " + bonus_payment);
			this.salary += bonus_payment;
			System.out.println("New Salary : " + this.salary);
		}
		else {
			int bonus_payment = 0;
			this.salary += bonus_payment;
			System.out.println("New Salary : " + this.salary);
		}
	}
	public void raise_salary() {
		
		int working_experience = the_current_year - this.hireYear;
		int the_raise_percentage = 0;
		double the_raise = 0.0;
		if(working_experience < 0) {
			System.out.println("Negative Year");
			}
		else if(working_experience > 19) {
			the_raise_percentage = 15;
			System.out.println("Old Salary : " + this.salary);
			the_raise = (this.salary / 100 * the_raise_percentage); 
			System.out.println("The Raise Ratio : " + the_raise_percentage + "% / The amount of Raise : " + the_raise);
			this.salary += the_raise;
			System.out.println("New Salary : " + this.salary);
			}
		else if(working_experience > 9 && working_experience < 20) {
			the_raise_percentage = 10;
			System.out.println("Old Salary : " + this.salary);
			the_raise = (this.salary / 100 * the_raise_percentage); 
			System.out.println("The Raise Ratio : " + the_raise_percentage + "% / The amount of Raise : " + the_raise);
			this.salary += the_raise;
			System.out.println("New Salary : " + this.salary);
			}
		else if(working_experience < 10) {
			the_raise_percentage = 5;
			System.out.println("Old Salary : " + this.salary);
			the_raise = (this.salary / 100 * the_raise_percentage); 
			System.out.println("The Raise Ratio : " + the_raise_percentage + "% / The amount of Raise : " + the_raise);
			this.salary += the_raise;
			System.out.println("New Salary : " + this.salary);
			}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear="
				+ hireYear + ", tax_rate=" + tax_rate + "]";
	}
	
	
}