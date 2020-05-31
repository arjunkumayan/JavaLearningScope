package OOP2;

public class Company {

	public String name;
	public int empNumbers;
	
	public String branchName;
	// encapsulation at variable level
	// hiding the data
	private String projectName;
	private int budget;
	private int stocks;
	private boolean isListed;
	
	
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
	
	//getter and setter
	// for public variable and private variable
	// getter and setter for private variable 
	/*public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getProjectName()
	{
		return projectName;
	}
	
	public void setProjectName(String project )
	{
		this.projectName=project;
	}
	*/
	
	
	
}
