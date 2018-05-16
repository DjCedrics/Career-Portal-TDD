/**
 * 
 */
package model;

/**
 * UserTest
 *
 * @author Baris Poyraz, Efe Ulas Akay Seyitoglu, Firat Sivrikaya
 * @date May 12, 2018
 */
public class SocialMediaAccount {

	private enum SOCIAL_MEDIA_TYPE { Facebook, Twitter, Linkedin };
	
	private SocialMediaAccount SOCIAL_MEDIA_TYPE;
	
	private String name;
	private String surname;
	private int age;
	private String gender;
	private String education;
	private String city;
	// Credentials
	private String email;
	private String password;
	
	public SocialMediaAccount getSOCIAL_MEDIA_TYPE() {
		return SOCIAL_MEDIA_TYPE;
	}
	public void setSOCIAL_MEDIA_TYPE(SocialMediaAccount sOCIAL_MEDIA_TYPE) {
		SOCIAL_MEDIA_TYPE = sOCIAL_MEDIA_TYPE;
	}
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
	
	
	

}
