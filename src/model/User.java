/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;
public class User implements Registrable {
	// Properties
	private String name;
	private String surname;
	private int age;
	private String gender;
	private String education;
	private String city;
	
	private List<Job> appliedJobs;
	private List<Job> ownedJobPosts;
	// Credentials
	private String email;
	private String password;
	private SocialMediaAccount socialMediaAccount;
	
	/**
	 * User constructor
	 * @param name
	 * @param surname
	 * @param age
	 * @param gender
	 * @param education
	 * @param city
	 */
	public User(String name, String surname, int age, String gender,
			String education, String city, String email, String password) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.education = education;
		this.city = city;
		this.email = email;
		this.password = password;
		appliedJobs = new ArrayList<Job>();
		ownedJobPosts = new ArrayList<Job>();
	}
	
	public User(String email, String password) {
		this.name = "";
		this.surname = "";
		this.age = 0;
		this.gender = "";
		this.education = "";
		this.city = "";
		this.email = email;
		this.password = password;
		appliedJobs = new ArrayList<Job>();
		ownedJobPosts = new ArrayList<Job>();
	}
	
	
	// Methods
	/* (non-Javadoc)
	 * @see model.Registrable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/* (non-Javadoc)
	 * @see model.Registrable#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#getSurname()
	 */
	@Override
	public String getSurname() {
		return surname;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#setSurname(java.lang.String)
	 */
	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#getAge()
	 */
	@Override
	public int getAge() {
		return age;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#setAge(int)
	 */
	@Override
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#getGender()
	 */
	@Override
	public String getGender() {
		return gender;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#setGender(java.lang.String)
	 */
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#getEducation()
	 */
	@Override
	public String getEducation() {
		return education;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#setEducation(java.lang.String)
	 */
	@Override
	public void setEducation(String education) {
		this.education = education;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#getCity()
	 */
	@Override
	public String getCity() {
		return city;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#setCity(java.lang.String)
	 */
	@Override
	public void setCity(String city) {
		this.city = city;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}
	/* (non-Javadoc)
	 * @see model.Registrable#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	public SocialMediaAccount getSocialMediaAccount() {
		return socialMediaAccount;
	}
	public void setSocialMediaAccount(SocialMediaAccount socialMediaAccount) {
		this.socialMediaAccount = socialMediaAccount;
	}
	public List<Job> getAppliedJobs() {
		return appliedJobs;
	}
	public void setAppliedJobs(List<Job> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}
	public List<Job> getOwnedJobPosts() {
		return ownedJobPosts;
	}
	public void setOwnedJobPosts(List<Job> ownedJobPosts) {
		this.ownedJobPosts = ownedJobPosts;
	}
	
	// Methods
	
	public Job applyToJob(Job j)
	{
		appliedJobs.add(j);
		
		return j;
	}
	
	public Job cancelApplicationToJob(Job j)
	{
		appliedJobs.remove(j);
		
		return j;
	}
	
	public Job postJob(Job j)
	{
		JobList.jobsPosted.add(j);
		ownedJobPosts.add(j);
		
		return j;
	}
}
