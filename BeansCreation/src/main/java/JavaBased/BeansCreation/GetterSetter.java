package JavaBased.BeansCreation;

public class GetterSetter {
	private String roll;
	private String name;
	private String branch;
	@Override
	public String toString() {
		return "GetterSetter [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
