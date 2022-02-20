package test;

import java.util.List;

public class SecondObjectForPOJO {
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private List<SecondSkills> skills;
	
	public SecondObjectForPOJO(int id, String first_name, String last_name, String email, String gender, List<SecondSkills> skills)
	{
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.skills = skills;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<SecondSkills> getSkills() {
		return skills;
	}
	public void setSkills(List<SecondSkills> skills) {
		this.skills = skills;
	}
	
	
}
