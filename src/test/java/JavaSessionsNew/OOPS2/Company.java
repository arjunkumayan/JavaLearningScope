package JavaSessionsNew.OOPS2;

public class Company {
	
	public String name;
	public int empNumbers;
	public String branchName;
	
	//data hiding:
	private String projectName;
	private int budget;
	private int stocks;
	private boolean isListed;
	
	
	//getter and setter:

	public boolean isListed() {
		return isListed;
	}
	public void setListed(boolean isListed) {
		this.isListed = isListed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNumbers() {
		return empNumbers;
	}
	public void setEmpNumbers(int empNumbers) {
		this.empNumbers = empNumbers;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	
	
	
	
	

}
