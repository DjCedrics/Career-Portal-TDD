/**
 * 
 */
package model;

/**
 * User
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class User {
	
	private enum ACCOUNT_TYPE { Personal, Corporate };
	
	// Properties
	private String name;
	private String surname;
	private int age;
	private String gender;
	private String education;
	private String city;
	// Credentials
	private String email;
	private String password;
	private SocialMediaAccount socialMediaAccount;
	private ACCOUNT_TYPE type;
	
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
			String education, String city, String email, String password, SocialMediaAccount socialMediaAcccount, ACCOUNT_TYPE type) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.education = education;
		this.city = city;
		this.email = email;
		this.password = password;
		this.socialMediaAccount = socialMediaAccount;
		this.type = type;
	}
	
	
	// Methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public SocialMediaAccount getSocialMediaAccount() {
		return socialMediaAccount;
	}


	public void setSocialMediaAccount(SocialMediaAccount socialMediaAccount) {
		this.socialMediaAccount = socialMediaAccount;
	}


	public ACCOUNT_TYPE getType() {
		return type;
	}


	public void setType(ACCOUNT_TYPE type) {
		this.type = type;
	}
	
	
	
	

}
