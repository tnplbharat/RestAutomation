package test;

public class Users {
	private String firstname;
	private int id;
	private String lastname;

	public Users(String firstname, int id, String lastname)
	{
		this.firstname = firstname;
		this.id = id;
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
