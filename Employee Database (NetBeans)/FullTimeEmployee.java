public class FullTimeEmployee extends EmployeeInfo 
{ 
	private double annualSalary;

	public FullTimeEmployee(int empNo, String fName, String lName, double deduct, int location, double salary)
	{
		super (empNo, fName, lName, deduct, location);
		if (salary > 0){
                annualSalary = salary;
                } else {
                    throw new RuntimeException();
                }
	}

	public double calcAnnualPay()
	{
		return (annualSalary*(1-getDeductionsRate())); 
	}
        
        public double getAnnualSalary()
        {
            return(annualSalary);
        }        
        
        public void setAnnualSalary(double salary)
        {
            if (salary>0)
                annualSalary = salary;
            else{
                throw new RuntimeException();
            } 
        }

}
