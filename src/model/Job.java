/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Job
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class Job {
	
	private String jobTitle;
	private String description;
	private String company;
	private User owner;
	private List<User> applicants;
	
	
	
	/** Job constructor
	 * @param jobTitle
	 * @param description
	 * @param company
	 * @param owner
	 * @param applicants
	 */
	public Job(String jobTitle, String description, String company, User owner) {
		super();
		this.jobTitle = jobTitle;
		this.description = description;
		this.company = company;
		this.owner = owner;
		applicants = new ArrayList<User>();
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public List<User> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<User> applicants) {
		this.applicants = applicants;
	}
	
	// Methods
	
	

}
