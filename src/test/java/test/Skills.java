package test;

public class Skills {
	private String name;
	private String proficiency;

	public Skills(String name, String proficiency) {
		this.name = name;
		this.proficiency = proficiency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

}
