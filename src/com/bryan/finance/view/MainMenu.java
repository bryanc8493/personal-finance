package com.bryan.finance.view;

import javax.swing.JFrame;

public class MainMenu extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainMenu() {
		final JFrame frame = new JFrame("Personal Finance");
	}

	public void showMenu() {
		this.setVisible(true);
	}

	public void teardown() {
		this.dispose();
	}

}
