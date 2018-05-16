package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PanelChangeListener implements ActionListener {
	
	private JPanel panelFrom;
	private JPanel panelTo;
	
	
	public PanelChangeListener(JPanel from, JPanel to) {
		super();
		this.panelFrom = from;
		this.panelTo = to;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panelFrom.setVisible(false);
		panelTo.setVisible(true);
	}

}
