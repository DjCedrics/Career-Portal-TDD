/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import model.Job;
import model.SocialMediaAccount;
import model.SocialMediaAccountList;
import model.User;
import model.UserList;
import view.Application;
import org.junit.Test;

/**
 * UserTest
 *
 * @author Baris Poyraz, Efe Ulas Akay Seyitoglu, Firat Sivrikaya
 * @date May 12, 2018
 */
public class UserTest {
	
	@Test
	public void testRegisterUser() {
		Application testApplication = new Application();
		JPanel registerScreen = testApplication.getRegisterScreen(); //Gets the registration screen from the Application view
		assertNotNull(registerScreen); //Check if registration screen is initialized
		User u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123"); //Create a user
		testApplication.registerTheUser(u1); //Should Register a given user. In other words, should update the UserListArray in UserList class
		assertEquals(1,UserList.getUsers().size()); //Having added a new user the userlist should be one
	}
	@Test
	public void testLoginUserwithEmailAndPassword() {
		//Firstly register a user to be able to check for login
		Application testApplication = new Application();
		JPanel registerScreen = testApplication.getRegisterScreen();
		if(registerScreen == null) {
			fail("Cannot test login since there are problems with registering");
			return;
		}
		User u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123");
		testApplication.registerTheUser(u1); //Should Register a given user. In other words, should update the UserListArray in UserList class
		if(UserList.getUsers().size() != 1) { //Having added a new user the userlist should be one
			fail("Cannot test login since there are problems with registering");
			return;
		}
		//If the  - is successfull continue with testing the login with email and password feature
		assertTrue(testApplication.loginWithEmailAndPassword("johndoe@mail.com", "johndoe123")); //Should return true in case of successfull login
	}
	
	@Test //This method is present in UserTest class
	public void testLoginwithSocialMedia() {
		//Firstly register a user to be able to check for login
		Application testApplication = new Application();
		JPanel socialMediaScreen = testApplication.getSocialMediaLoginScreen();
		
		if(socialMediaScreen == null) {
			fail("Cannot test social media feature since there are problems with registering");
			return;
		}
		testApplication.registerUsingSocialMedia(new SocialMediaAccount()); //Should Register a given user. In other words, 
		//should update the socialMediaAccounts List in SocialMediaAccountList.java
		assertEquals(1,SocialMediaAccountList.getSocialMediaAccounts().size());
	}
	

	/**
	 * Test method for {@link model.User#applyToJob(model.Job)}.
	 */
	@Test
	public void testApplyToJob() {
		Application testApplication = new Application();
		JPanel jobApplicationScreen = testApplication.getJobApplicationsScreen();
		
		assertNotNull("Job application screen has not been initialized", jobApplicationScreen);
		
		User u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123");
		User u2 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j = new Job("Software Developer", "5+ years experience", "SimSoft", u2);
		
		u1.applyToJob(j);

		assertEquals("Applied jobs list size should be 1", u1.getAppliedJobs().size(), 1);
		assertEquals("The job applied should be in applied jobs list", u1.getAppliedJobs().get(u1.getAppliedJobs().size() - 1), j);
	}
	

	

	/**
	 * Test method for {@link model.User#cancelApplicationToJob(model.Job)}.
	 */
	@Test
	public void testCancelApplicationToJob() {
		
		Application testApplication = new Application();
		JPanel jobApplicationScreen = testApplication.getJobApplicationsScreen();
		
		assertNotNull("Job application screen has not been initialized", jobApplicationScreen);
		
		User u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123");
		User u2 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j = new Job("Software Developer", "5+ years experience", "SimSoft", u2);
		
		u1.getAppliedJobs().add(j);
		
		u1.cancelApplicationToJob(j);
		
		assertEquals("Cancellation of the job application failed.", 0, u1.getAppliedJobs().size());
		
	}

	/**
	 * Test method for {@link model.User#postJob(model.Job)}.
	 */
	@Test
	public void testPostJob() {
		
		Application testApplication = new Application();
		JPanel jobPostScreen = testApplication.getJobPostScreen();
		
		assertNotNull("Job application screen has not been initialized", jobPostScreen);
		
		User u2 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j = new Job("Software Developer", "5+ years experience", "SimSoft", u2);
		
		u2.postJob(j);
		
		assertEquals("Owned job posts list size should be 1", u2.getOwnedJobPosts().size(), 1);
		assertEquals("Job posted could not be found in owned job posts list of the user", u2.getOwnedJobPosts().get(u2.getOwnedJobPosts().size() - 1), j);
		
	}
	
	

}
