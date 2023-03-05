package _17_GetterAndSetter;

public class Employee {
	
	private String Employee_Name;
	private int Employee_ID;
	
	
	public void display() {
		System.out.println(this.getEmployee_Name());
		System.out.println(this.getEmployee_ID());
	}


	public int getEmployee_ID() {
		return Employee_ID;
	}


	public void setEmployee_ID(int employee_ID) {
		if(employee_ID<=0){
			throw new IllegalArgumentException("illegal args");
		}
		else {
		Employee_ID = employee_ID;
		}
	}


	public String getEmployee_Name() {
		return Employee_Name;
	}


	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}

}
