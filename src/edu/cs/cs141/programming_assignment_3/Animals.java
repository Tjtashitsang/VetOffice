/**
 * 
 */
package edu.cs.cs141.programming_assignment_3;
import java.util.ArrayList;
/**
 * @author ttash
 *
 */
public class Animals {
	private String owner;
	private String name;
	private int age;
	private ArrayList<Diseases> diseases;
	private ArrayList<String> vaccinations;
	
	public Animals(String aowner, String aname, int aage, ArrayList<Diseases> adiseases, ArrayList<String> avaccines)
	{
		owner = aowner;
		name = aname;
		age = aage;
		diseases = adiseases;
		vaccinations = avaccines;
	}
}
