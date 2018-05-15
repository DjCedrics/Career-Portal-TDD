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
import javax.swing.JLabel;

/**
 * Application
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class Application {

	private JFrame frame;
	private JTextField passwordField;
	private JTextField loginField;
	private JTextField socialMediaPasswordField;
	private JTextField socialMediaEmailField;
	private JTextField jobTitleField;
	private JTextField jobSearchQuery;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel ownedJobPostsScreen = new JPanel();
		frame.getContentPane().add(ownedJobPostsScreen, "name_45599628724348");
		ownedJobPostsScreen.setLayout(null);
		
		JComboBox selectJobsPostedComboBox = new JComboBox();
		selectJobsPostedComboBox.setBounds(34, 42, 123, 27);
		ownedJobPostsScreen.add(selectJobsPostedComboBox);
		
		JComboBox viewApplicantsComboBox = new JComboBox();
		viewApplicantsComboBox.setBounds(241, 43, 134, 27);
		ownedJobPostsScreen.add(viewApplicantsComboBox);
		
		JLabel applicantNameLabel = new JLabel("Applicant name");
		applicantNameLabel.setBounds(241, 94, 173, 16);
		ownedJobPostsScreen.add(applicantNameLabel);
		
		JLabel applicantEducationLabel = new JLabel("Applicant education");
		applicantEducationLabel.setBounds(241, 122, 173, 16);
		ownedJobPostsScreen.add(applicantEducationLabel);
		
		JLabel applicantCityLabel = new JLabel("Applicant city");
		applicantCityLabel.setBounds(241, 150, 167, 16);
		ownedJobPostsScreen.add(applicantCityLabel);
		
		JLabel applicantGenderLabel = new JLabel("Applicant gender");
		applicantGenderLabel.setBounds(241, 176, 173, 16);
		ownedJobPostsScreen.add(applicantGenderLabel);
		
		JLabel applicantEmailLabel = new JLabel("Applicant email");
		applicantEmailLabel.setBounds(241, 201, 173, 16);
		ownedJobPostsScreen.add(applicantEmailLabel);
		
		JButton btnBackToHome = new JButton("Back to Home");
		btnBackToHome.setBounds(160, 229, 117, 29);
		ownedJobPostsScreen.add(btnBackToHome);
		
		JPanel jobApplicationsScreen = new JPanel();
		frame.getContentPane().add(jobApplicationsScreen, "name_45258806092038");
		jobApplicationsScreen.setLayout(null);
		
		JComboBox selectApplicationButton = new JComboBox();
		selectApplicationButton.setBounds(55, 44, 124, 27);
		jobApplicationsScreen.add(selectApplicationButton);
		
		JButton cancelJobApplicationButton = new JButton("Cancel Application");
		cancelJobApplicationButton.setBounds(215, 43, 196, 29);
		jobApplicationsScreen.add(cancelJobApplicationButton);
		
		JButton backFromApplicationsToHomeButton = new JButton("Back to Home");
		backFromApplicationsToHomeButton.setBounds(162, 216, 117, 29);
		jobApplicationsScreen.add(backFromApplicationsToHomeButton);
		
		JPanel JobSearchScreen = new JPanel();
		frame.getContentPane().add(JobSearchScreen, "name_44933932099250");
		JobSearchScreen.setLayout(null);
		
		jobSearchQuery = new JTextField();
		jobSearchQuery.setBounds(99, 6, 134, 28);
		jobSearchQuery.setText("Enter search query");
		JobSearchScreen.add(jobSearchQuery);
		jobSearchQuery.setColumns(10);
		
		JButton jobSearchButton = new JButton("Search");
		jobSearchButton.setBounds(239, 7, 117, 29);
		JobSearchScreen.add(jobSearchButton);
		
		JComboBox jobSearchResultComboBox = new JComboBox();
		jobSearchResultComboBox.setBounds(6, 62, 161, 27);
		JobSearchScreen.add(jobSearchResultComboBox);
		
		JLabel jobTitleDisplayLabel = new JLabel("Job Title");
		jobTitleDisplayLabel.setBounds(288, 64, 61, 16);
		JobSearchScreen.add(jobTitleDisplayLabel);
		
		JTextPane jobDescriptionDisplayField = new JTextPane();
		jobDescriptionDisplayField.setText("Job Description");
		jobDescriptionDisplayField.setBounds(216, 97, 217, 101);
		JobSearchScreen.add(jobDescriptionDisplayField);
		
		JLabel companyLabel = new JLabel("Company");
		companyLabel.setBounds(215, 210, 61, 16);
		JobSearchScreen.add(companyLabel);
		
		JButton applyToJobButton = new JButton("Apply");
		applyToJobButton.setBounds(316, 205, 117, 29);
		JobSearchScreen.add(applyToJobButton);
		
		JButton backFromJobSearchToHomeButton = new JButton("Back");
		backFromJobSearchToHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backFromJobSearchToHomeButton.setBounds(159, 232, 117, 29);
		JobSearchScreen.add(backFromJobSearchToHomeButton);
		
		JPanel HomeScreen = new JPanel();
		frame.getContentPane().add(HomeScreen, "name_44208384114847");
		HomeScreen.setLayout(null);
		
		JButton searchForJobsButton = new JButton("Search for Jobs");
		searchForJobsButton.setBounds(141, 74, 150, 29);
		HomeScreen.add(searchForJobsButton);
		
		JButton postNewJobButton = new JButton("Post new Job");
		postNewJobButton.setBounds(156, 114, 117, 29);
		HomeScreen.add(postNewJobButton);
		
		JButton appliedJobsButton = new JButton("View Applied Jobs");
		appliedJobsButton.setBounds(141, 159, 150, 29);
		HomeScreen.add(appliedJobsButton);
		
		JButton ownedJobPostsButton = new JButton("View Owned Job Posts");
		ownedJobPostsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ownedJobPostsButton.setBounds(120, 200, 182, 29);
		HomeScreen.add(ownedJobPostsButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(156, 243, 117, 29);
		HomeScreen.add(exitButton);
		
		JPanel SocialMediaLoginScreen = new JPanel();
		frame.getContentPane().add(SocialMediaLoginScreen, "name_43927209351366");
		SocialMediaLoginScreen.setLayout(null);
		
		JButton socialMediaLoginButton = new JButton("Login");
		socialMediaLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		socialMediaLoginButton.setBounds(162, 186, 117, 29);
		SocialMediaLoginScreen.add(socialMediaLoginButton);
		
		socialMediaPasswordField = new JTextField();
		socialMediaPasswordField.setText("Social media password");
		socialMediaPasswordField.setBounds(111, 123, 220, 28);
		SocialMediaLoginScreen.add(socialMediaPasswordField);
		socialMediaPasswordField.setColumns(10);
		
		JButton backFromSocialMediaToLoginButton = new JButton("Back to Normal Login");
		backFromSocialMediaToLoginButton.setBounds(130, 227, 179, 29);
		SocialMediaLoginScreen.add(backFromSocialMediaToLoginButton);
		
		socialMediaEmailField = new JTextField();
		socialMediaEmailField.setText("Social media email");
		socialMediaEmailField.setColumns(10);
		socialMediaEmailField.setBounds(111, 82, 220, 28);
		SocialMediaLoginScreen.add(socialMediaEmailField);
		
		JComboBox socialMediaComboBox = new JComboBox();
		socialMediaComboBox.setBounds(150, 26, 144, 27);
		SocialMediaLoginScreen.add(socialMediaComboBox);
		
		JPanel LoginScreen = new JPanel();
		frame.getContentPane().add(LoginScreen, "name_43874166817325");
		LoginScreen.setLayout(null);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(103, 165, 79, 29);
		LoginScreen.add(loginButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(252, 165, 95, 29);
		LoginScreen.add(registerButton);
		
		passwordField = new JTextField();
		passwordField.setBounds(150, 108, 134, 28);
		LoginScreen.add(passwordField);
		passwordField.setText("Password");
		passwordField.setColumns(10);
		
		JButton socialMediaLoginPageButton = new JButton("Social Media Login");
		socialMediaLoginPageButton.setBounds(143, 206, 161, 29);
		LoginScreen.add(socialMediaLoginPageButton);
		
		loginField = new JTextField();
		loginField.setBounds(150, 68, 134, 28);
		LoginScreen.add(loginField);
		loginField.setText("Login");
		loginField.setColumns(10);
		
		JPanel JobPostScreen = new JPanel();
		frame.getContentPane().add(JobPostScreen, "name_44308268472030");
		JobPostScreen.setLayout(null);
		
		jobTitleField = new JTextField();
		jobTitleField.setText("Job Title");
		jobTitleField.setBounds(143, 39, 134, 28);
		JobPostScreen.add(jobTitleField);
		jobTitleField.setColumns(10);
		
		JTextPane jobDescriptionField = new JTextPane();
		jobDescriptionField.setText("Job description");
		jobDescriptionField.setBounds(143, 79, 134, 68);
		JobPostScreen.add(jobDescriptionField);
		
		JComboBox companySelectComboBox = new JComboBox();
		companySelectComboBox.setBounds(143, 159, 134, 27);
		JobPostScreen.add(companySelectComboBox);
		
		JButton submitJobButton = new JButton("Submit Job");
		submitJobButton.setBounds(153, 198, 117, 29);
		JobPostScreen.add(submitJobButton);
		
		JButton backFromJobPostToHomePageButton = new JButton("Back");
		backFromJobPostToHomePageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backFromJobPostToHomePageButton.setBounds(160, 227, 117, 29);
		JobPostScreen.add(backFromJobPostToHomePageButton);
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
