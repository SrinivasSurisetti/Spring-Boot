package JavaBased.BeansCreation;

public class Constructor {
	private String roll;
	private String name;
	private String branch;
	@Override
	public String toString() {
		return "Constructor [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
	}
	public Constructor(String roll, String name, String branch) {
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
	}
	
}
