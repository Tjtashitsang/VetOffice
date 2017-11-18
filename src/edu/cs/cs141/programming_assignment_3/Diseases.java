package edu.cs.cs141.programming_assignment_3;

public class Diseases {
	private String name;//name of disease
	private boolean status; //true for current false for past
	
	public Diseases(String aname, boolean astatus)
	{
		setName(aname);
		setStatus(astatus);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
