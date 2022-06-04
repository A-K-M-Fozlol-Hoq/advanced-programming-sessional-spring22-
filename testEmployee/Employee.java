package testEmployee;
public class Employee {
	static String organization;
	private int eid;
	private String name;
	private String designation;
	private int age;
	Employee(){
		eid=0;
		name=null;
		designation=null;
		age=0;
	}
	Employee(String org,int id, String n, String d, int a){
		organization=org;
		eid=id;
		name=n;
		designation=d;
		age=a;
	}

	static void setOrganization(String o) {
		organization=o;
	}
	public static String getOrganization() {
		return organization;
	}
	public String getName() {
		return name;
	}
	public String getDesg() {
		return designation;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return eid;
	}
	public boolean findEmployee(Employee[]  findEmployeeArray, int findId) {
		for(int i=0; i<findEmployeeArray.length; i++) {
			if(findEmployeeArray[i].eid == findId) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findEmployee(Employee[]  findEmployeeArray, String findName) {
		for(int i=0; i<findEmployeeArray.length; i++) {
			if(findEmployeeArray[i].name.equals(findName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findEmployee(Employee[]  findEmployeeArray, String findDesg, int age) {
		for(int i=0; i<findEmployeeArray.length; i++) {
			if((findEmployeeArray[i].designation.equals(findDesg)) &&  (age == findEmployeeArray[i].age)) {
				return true;
			}
		}
		return false;
	}
}