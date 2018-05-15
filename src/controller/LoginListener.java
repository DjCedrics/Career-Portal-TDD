package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class LoginListener implements ActionListener {
	
	private JPanel login;
	private JPanel home;
	
	

	public LoginListener(JPanel login, JPanel home) {
		super();
		this.login = login;
		this.home = home;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		login.setVisible(false);
		home.setVisible(true);
		
	}

	
}
