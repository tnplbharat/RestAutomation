package test;

import java.util.List;

public class SecondSkills {
	
	private String name;
	private String proficiency;
	private List<String> certifications;
	
	public SecondSkills(String name, String proficiency)
	{
		this.name = name;
		this.proficiency = proficiency;
	}
	
	public SecondSkills(String name, String proficiency,List<String> certifications)
	{
		this.name = name;
		this.proficiency = proficiency;
		this.certifications = certifications;
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

	public List<String> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}
	
	
}
