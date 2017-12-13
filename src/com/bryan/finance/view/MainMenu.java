package com.bryan.finance.view;

import javax.swing.JFrame;

import com.bryan.finance.view.util.AppFrame;

public class MainMenu extends AppFrame {

	private static final long serialVersionUID = 1L;

	public MainMenu() {
		final JFrame frame = new AppFrame();
	}

	public void showMenu() {
		this.setVisible(true);
	}

	public void teardown() {
		this.dispose();
	}

}
