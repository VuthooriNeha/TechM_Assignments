package techm;

public class Employee {
	private int empId;
	private String empName;
	private double sal;
	private int experience;
	
	public void setEmployeeDetails(int empId,String empName,double sal,int experience) {
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
		this.experience=experience;
		}
	public void getEmployeeDetails() {
		System.out.println("Employee Id is: "+ empId);
		System.out.println("Employee Name is: "+ empName);
		System.out.println("Employee Salary is: "+ sal);
		System.out.println("Employee Experience is: "+ experience);
	}
	public String getLoanEligibility() {
		if(experience>5) {
			double annualsal=sal*12;
			if(annualsal==600000) {
				return "2 lakhs loan granted";
			}
			else if(annualsal>=1000000 && annualsal<1500000) {
				return "5 lakhs loan granted";
			}
			else if(annualsal>=1500000) {
				return "7 lakhs loan granted";
			}
			else {
				return "loan doesn't granted";
			}
				
		}
		else
			return "loan doesn't granted";
	}
	
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setEmployeeDetails(59,"Neha",100000,6);
		emp1.getEmployeeDetails();
		System.out.println(emp1.getLoanEligibility());
	}
}
