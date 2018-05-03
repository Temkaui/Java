public class Project {
	private String name;
	private String description;
	private double cost;
	public Project() {
		this("","", 0);
	}

	public Project(String name) {
		this.name = name;
	}

	public Project (String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Project (String name, String description, double cost){
		this.name = name;
		this.description = description;
		this.cost = cost;
	}

	public void setName (String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return this.cost;
	}

	public void elevatorPitch(String name, String description, double cost) {
		System.out.println(this.name + " ("+ this.cost+"):" + this.description);
	}

}