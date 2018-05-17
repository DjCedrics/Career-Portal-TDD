/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * UserTest
 *
 * @author Baris Poyraz, Efe Ulas Akay Seyitoglu, Firat Sivrikaya
 * @date May 12, 2018
 */
public class Job {
	
	private String jobTitle;
	private String description;
	private String company;
	private Registrable owner;
	private List<User> applicants;
	
	
	
	/** Job constructor
	 * @param jobTitle
	 * @param description
	 * @param company
	 * @param owner
	 * @param applicants
	 */
	public Job(String jobTitle, String description, String company, Registrable owner) {
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
	public Registrable getOwner() {
		return owner;
	}
	public void setOwner(Registrable owner) {
		this.owner = owner;
	}
	public List<User> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<User> applicants) {
		this.applicants = applicants;
	}
	
	// Methods
	
	/**
	 * Get Applicant
	 * Get the applicant who has an application to a job
	 * 
	 * @param User u
	 * @return User who applied for the job
	 */
	
	public Registrable getApplicant(Registrable u)
	{
		if ( applicants.contains(u) )
		{
			return u;
		}
		return null;
	}
	
	/**
	 * Has Applications
	 * Return if the given user has an application to the job
	 * 
	 * @param User u
	 * @return True, if user has an application to the job. False, otherwise.
	 */
	
	public boolean hasApplication(Registrable u)
	{
		return applicants.contains(u);
	}

}
