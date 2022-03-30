package salaryIncrement;

public class Employee {
	public int totalProjects;
	public int totalMonths;
	Employee(){
		
	}
	Employee(int totalProjects, int totalMonths){
		this.totalProjects = totalProjects;
		this.totalMonths = totalMonths;
	}
	public void setTotalProjects(int totalProjects) {
		this.totalProjects=totalProjects;
	}
	public int getTotalProjects() {
		return this.totalProjects;
	}
	
	public void setTotalMonths(int totalMonths) {
		this.totalMonths=totalMonths;
	}
	public int getTotalMonths() {
		return this.totalMonths;
	}
	
	
}
