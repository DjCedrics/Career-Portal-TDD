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
public class JobList {
	
	// Properties
	public static List<Job> jobsPosted = new ArrayList<Job>();
	
	/** JobList Constructor
	 * @param jobsPosted
	 */
	public JobList(List<Job> jobsPosted) {
		this.jobsPosted = jobsPosted;
	}

	public List<Job> getJobsPosted() {
		return jobsPosted;
	}

	public void setJobsPosted(List<Job> jobsPosted) {
		this.jobsPosted = jobsPosted;
	}
	
	public static Job searchJob(Job j)
	{
		if ( jobsPosted.contains(j) )
		{
			return jobsPosted.get(jobsPosted.indexOf(j));
		}
		
		return null;
	}
	
	
	
	
	

}
