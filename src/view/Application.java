/**
 * 
 */
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import controller.LoginListener;
import controller.PanelChangeListener;
import controller.RegisterListener;
import model.User;

import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * Application
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class Application {

	private JFrame frame;
	public JTextField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JTextField passwordField) {
		this.passwordField = passwordField;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public void setLoginField(JTextField loginField) {
		this.loginField = loginField;
	}

	private JTextField passwordField;
	private JTextField loginField;
	private JTextField socialMediaPasswordField;
	private JTextField socialMediaEmailField;
	private JTextField jobTitleField;
	private JTextField jobSearchQuery;
	private JTextField nameField;
	private JTextField surnameField;
	private JTextField educationField;
	private JTextField cityField;
	private JTextField ageField;
	private JTextField emailField;
	private JTextField passwordRegisterField;
	private JPanel RegisterScreen;
	private JButton registerButton;
	private JButton registerSubmitButton;
	
	public void registerTheUser(User u) {
		//Not yet implemented, is called when register submit button is clicked
	}
	
	public boolean loginWithEmailAndPassword(String email, String password) {
		return false; //Not yet implemented, unable to register the user
	}

	public JButton getRegisterSubmitButton() {
		return registerSubmitButton;
	}

	public void setRegisterSubmitButton(JButton registerSubmitButton) {
		this.registerSubmitButton = registerSubmitButton;
	}

	public JButton getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(JButton registerButton) {
		this.registerButton = registerButton;
	}

	public JPanel getRegisterScreen() {
		return RegisterScreen;
	}

	public void setRegisterScreen(JPanel registerScreen) {
		RegisterScreen = registerScreen;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		// Initialize panels
		JPanel LoginScreen = new JPanel();
		JPanel ownedJobPostsScreen = new JPanel();
		JPanel jobApplicationsScreen = new JPanel();
		JPanel JobSearchScreen = new JPanel();
		JPanel SocialMediaLoginScreen = new JPanel();
		JPanel JobPostScreen = new JPanel();
		this.RegisterScreen = new JPanel();
		JPanel HomeScreen = new JPanel();
		
		
		
		// Initialize buttons
		JButton loginButton = new JButton("Login");
	    registerButton = new JButton("Register");
		JButton socialMediaLoginPageButton = new JButton("Social Media Login");
		JButton backFromOwnedJobPostsToHomeButton = new JButton("Back to Home");
		JButton cancelJobApplicationButton = new JButton("Cancel Application");
		JButton backFromApplicationsToHomeButton = new JButton("Back to Home");
		JButton applyToJobButton = new JButton("Apply");
		JButton backFromJobSearchToHomeButton = new JButton("Back");
		JButton socialMediaLoginButton = new JButton("Login");
		JButton backFromSocialMediaToLoginButton = new JButton("Back to Normal Login");
		JButton submitJobButton = new JButton("Submit Job");
		JButton backFromJobPostToHomePageButton = new JButton("Back");
		registerSubmitButton = new JButton("Register");
		JButton searchForJobsButton = new JButton("Search for Jobs");
		JButton postNewJobButton = new JButton("Post new Job");
		JButton appliedJobsButton = new JButton("View Applied Jobs");
		JButton ownedJobPostsButton = new JButton("View Owned Job Posts");
		JButton exitButton = new JButton("Exit");
		JButton backFromRegisterToLoginButton = new JButton("Back to Login");
		JButton jobSearchButton = new JButton("Search");
		
		// Listeners for buttons
		socialMediaLoginPageButton.addActionListener(new PanelChangeListener(LoginScreen, SocialMediaLoginScreen));
		backFromOwnedJobPostsToHomeButton.addActionListener(new PanelChangeListener(ownedJobPostsScreen, HomeScreen));
		backFromJobSearchToHomeButton.addActionListener(new PanelChangeListener(JobSearchScreen, HomeScreen));
		socialMediaLoginButton.addActionListener(new PanelChangeListener(SocialMediaLoginScreen, HomeScreen));
		backFromJobPostToHomePageButton.addActionListener(new PanelChangeListener(JobPostScreen, HomeScreen));
		backFromSocialMediaToLoginButton.addActionListener(new PanelChangeListener(SocialMediaLoginScreen, LoginScreen));
		appliedJobsButton.addActionListener(new PanelChangeListener(HomeScreen, jobApplicationsScreen));
		registerButton.addActionListener(new PanelChangeListener(LoginScreen, RegisterScreen));
		loginButton.addActionListener(new LoginListener(LoginScreen, HomeScreen));
		ownedJobPostsButton.addActionListener(new PanelChangeListener(HomeScreen, ownedJobPostsScreen));
		backFromRegisterToLoginButton.addActionListener(new PanelChangeListener(RegisterScreen, LoginScreen));
		registerSubmitButton.addActionListener(new RegisterListener(RegisterScreen, HomeScreen));
		searchForJobsButton.addActionListener(new PanelChangeListener(HomeScreen, JobSearchScreen));
		postNewJobButton.addActionListener(new PanelChangeListener(HomeScreen, JobPostScreen));
		backFromApplicationsToHomeButton.addActionListener(new PanelChangeListener(jobApplicationsScreen, HomeScreen));
		
		exitButton.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
		}});
		
		
		// Initialize combo boxes
		JComboBox selectJobsPostedComboBox = new JComboBox();
		JComboBox viewApplicantsComboBox = new JComboBox();
		JComboBox jobSearchResultComboBox = new JComboBox();
		JComboBox selectApplicationButton = new JComboBox();
		JComboBox socialMediaComboBox = new JComboBox();
		JComboBox companySelectComboBox = new JComboBox();
		JComboBox genderComboBox = new JComboBox();
		
		// Initialize labels
		JLabel applicantNameLabel = new JLabel("Applicant name");
		JLabel applicantEducationLabel = new JLabel("Applicant education");
		JLabel applicantCityLabel = new JLabel("Applicant city");
		JLabel applicantGenderLabel = new JLabel("Applicant gender");
		JLabel applicantEmailLabel = new JLabel("Applicant email");
		JLabel companyLabel = new JLabel("Company");
		JLabel jobTitleDisplayLabel = new JLabel("Job Title");
		
		// Initialize text panes
		JTextPane jobDescriptionDisplayField = new JTextPane();
		JTextPane jobDescriptionField = new JTextPane();

		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		frame.getContentPane().add(LoginScreen, "name_43874166817325");
		LoginScreen.setLayout(null);
		loginButton.setBounds(103, 165, 79, 29);
		LoginScreen.add(loginButton);
		
		registerButton.setBounds(252, 165, 95, 29);
		LoginScreen.add(registerButton);
		
		passwordField = new JTextField();
		passwordField.setBounds(150, 108, 134, 28);
		LoginScreen.add(passwordField);
		passwordField.setText("Password");
		passwordField.setColumns(10);
		
		
		socialMediaLoginPageButton.setBounds(143, 206, 161, 29);
		LoginScreen.add(socialMediaLoginPageButton);
		
		loginField = new JTextField();
		loginField.setBounds(150, 68, 134, 28);
		LoginScreen.add(loginField);
		loginField.setText("Login");
		loginField.setColumns(10);
		
		
		
		frame.getContentPane().add(HomeScreen, "name_44208384114847");
		HomeScreen.setLayout(null);
		
		
		searchForJobsButton.setBounds(141, 74, 150, 29);
		HomeScreen.add(searchForJobsButton);
		
		
		postNewJobButton.setBounds(156, 114, 117, 29);
		HomeScreen.add(postNewJobButton);
		
		
		appliedJobsButton.setBounds(141, 159, 150, 29);
		HomeScreen.add(appliedJobsButton);
		
		
		
		ownedJobPostsButton.setBounds(120, 200, 182, 29);
		HomeScreen.add(ownedJobPostsButton);
		
		
		exitButton.setBounds(156, 243, 117, 29);
		HomeScreen.add(exitButton);
		
		
		frame.getContentPane().add(ownedJobPostsScreen, "name_45599628724348");
		ownedJobPostsScreen.setLayout(null);
		
		
		selectJobsPostedComboBox.setBounds(34, 42, 123, 27);
		ownedJobPostsScreen.add(selectJobsPostedComboBox);
		
		
		viewApplicantsComboBox.setBounds(241, 43, 134, 27);
		ownedJobPostsScreen.add(viewApplicantsComboBox);
		
		
		applicantNameLabel.setBounds(241, 94, 173, 16);
		ownedJobPostsScreen.add(applicantNameLabel);
		
		
		applicantEducationLabel.setBounds(241, 122, 173, 16);
		ownedJobPostsScreen.add(applicantEducationLabel);
		
		
		applicantCityLabel.setBounds(241, 150, 167, 16);
		ownedJobPostsScreen.add(applicantCityLabel);
		
		
		applicantGenderLabel.setBounds(241, 176, 173, 16);
		ownedJobPostsScreen.add(applicantGenderLabel);
		
		
		applicantEmailLabel.setBounds(241, 201, 173, 16);
		ownedJobPostsScreen.add(applicantEmailLabel);
		
		
		backFromOwnedJobPostsToHomeButton.setBounds(160, 229, 117, 29);
		ownedJobPostsScreen.add(backFromOwnedJobPostsToHomeButton);
		
		
		frame.getContentPane().add(jobApplicationsScreen, "name_45258806092038");
		jobApplicationsScreen.setLayout(null);
		
		
		selectApplicationButton.setBounds(55, 44, 124, 27);
		jobApplicationsScreen.add(selectApplicationButton);
		
		
		cancelJobApplicationButton.setBounds(215, 43, 196, 29);
		jobApplicationsScreen.add(cancelJobApplicationButton);
		
		
		backFromApplicationsToHomeButton.setBounds(162, 216, 117, 29);
		jobApplicationsScreen.add(backFromApplicationsToHomeButton);
		
		
		frame.getContentPane().add(JobSearchScreen, "name_44933932099250");
		JobSearchScreen.setLayout(null);
		
		jobSearchQuery = new JTextField();
		jobSearchQuery.setBounds(99, 6, 134, 28);
		jobSearchQuery.setText("Enter search query");
		JobSearchScreen.add(jobSearchQuery);
		jobSearchQuery.setColumns(10);
		
		
		jobSearchButton.setBounds(239, 7, 117, 29);
		JobSearchScreen.add(jobSearchButton);
		
		
		jobSearchResultComboBox.setBounds(6, 62, 161, 27);
		JobSearchScreen.add(jobSearchResultComboBox);
		
		
		jobTitleDisplayLabel.setBounds(288, 64, 61, 16);
		JobSearchScreen.add(jobTitleDisplayLabel);
		
		
		jobDescriptionDisplayField.setText("Job Description");
		jobDescriptionDisplayField.setBounds(216, 97, 217, 101);
		JobSearchScreen.add(jobDescriptionDisplayField);
		
		
		companyLabel.setBounds(215, 210, 61, 16);
		JobSearchScreen.add(companyLabel);
		
		
		applyToJobButton.setBounds(316, 205, 117, 29);
		JobSearchScreen.add(applyToJobButton);
		
		
		
		backFromJobSearchToHomeButton.setBounds(159, 232, 117, 29);
		JobSearchScreen.add(backFromJobSearchToHomeButton);
		
		
		frame.getContentPane().add(SocialMediaLoginScreen, "name_43927209351366");
		SocialMediaLoginScreen.setLayout(null);
		
		
		
		socialMediaLoginButton.setBounds(162, 186, 117, 29);
		SocialMediaLoginScreen.add(socialMediaLoginButton);
		
		socialMediaPasswordField = new JTextField();
		socialMediaPasswordField.setText("Social media password");
		socialMediaPasswordField.setBounds(111, 123, 220, 28);
		SocialMediaLoginScreen.add(socialMediaPasswordField);
		socialMediaPasswordField.setColumns(10);
		
		
		backFromSocialMediaToLoginButton.setBounds(130, 227, 179, 29);
		SocialMediaLoginScreen.add(backFromSocialMediaToLoginButton);
		
		socialMediaEmailField = new JTextField();
		socialMediaEmailField.setText("Social media email");
		socialMediaEmailField.setColumns(10);
		socialMediaEmailField.setBounds(111, 82, 220, 28);
		SocialMediaLoginScreen.add(socialMediaEmailField);
		
		
		socialMediaComboBox.setBounds(150, 26, 144, 27);
		SocialMediaLoginScreen.add(socialMediaComboBox);
		
		
		frame.getContentPane().add(JobPostScreen, "name_44308268472030");
		JobPostScreen.setLayout(null);
		
		jobTitleField = new JTextField();
		jobTitleField.setText("Job Title");
		jobTitleField.setBounds(143, 39, 134, 28);
		JobPostScreen.add(jobTitleField);
		jobTitleField.setColumns(10);
		
		
		
		jobDescriptionField.setText("Job description");
		jobDescriptionField.setBounds(143, 79, 134, 68);
		JobPostScreen.add(jobDescriptionField);
		
		
		companySelectComboBox.setBounds(143, 159, 134, 27);
		JobPostScreen.add(companySelectComboBox);
		
		
		submitJobButton.setBounds(153, 198, 117, 29);
		JobPostScreen.add(submitJobButton);
		
		
		
		backFromJobPostToHomePageButton.setBounds(160, 227, 117, 29);
		JobPostScreen.add(backFromJobPostToHomePageButton);
		
		
		frame.getContentPane().add(RegisterScreen, "name_48222902012559");
		RegisterScreen.setLayout(null);
		
		nameField = new JTextField();
		nameField.setText("Name");
		nameField.setBounds(152, 20, 134, 28);
		RegisterScreen.add(nameField);
		nameField.setColumns(10);
		
		surnameField = new JTextField();
		surnameField.setText("Surname");
		surnameField.setColumns(10);
		surnameField.setBounds(152, 60, 134, 28);
		RegisterScreen.add(surnameField);
		
		educationField = new JTextField();
		educationField.setText("Education");
		educationField.setColumns(10);
		educationField.setBounds(152, 100, 134, 28);
		RegisterScreen.add(educationField);
		
		
		genderComboBox.setBounds(152, 218, 134, 27);
		RegisterScreen.add(genderComboBox);
		
		cityField = new JTextField();
		cityField.setText("City");
		cityField.setColumns(10);
		cityField.setBounds(152, 140, 134, 28);
		RegisterScreen.add(cityField);
		
		ageField = new JTextField();
		ageField.setText("Age");
		ageField.setBounds(152, 180, 134, 28);
		RegisterScreen.add(ageField);
		ageField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setText("Email");
		emailField.setBounds(6, 140, 134, 28);
		RegisterScreen.add(emailField);
		emailField.setColumns(10);
		
		passwordRegisterField = new JTextField();
		passwordRegisterField.setText("Password");
		passwordRegisterField.setToolTipText("password");
		passwordRegisterField.setBounds(6, 180, 134, 28);
		RegisterScreen.add(passwordRegisterField);
		passwordRegisterField.setColumns(10);
		
		
		registerSubmitButton.setBounds(312, 141, 117, 29);
		RegisterScreen.add(registerSubmitButton);
		
		
		backFromRegisterToLoginButton.setBounds(312, 181, 117, 29);
		RegisterScreen.add(backFromRegisterToLoginButton);
	}
}
