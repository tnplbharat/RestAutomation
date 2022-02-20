package test;

import java.util.List;

public class Payload {

	private List<Users> users;
	private List<Subjects> subjects;
	
	public Payload(List<Users> users, List<Subjects> subjects)
	{
		this.users = users;
		this.subjects = subjects;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	
}
