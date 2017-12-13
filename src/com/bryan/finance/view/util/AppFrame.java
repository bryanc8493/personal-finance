package com.bryan.finance.view.util;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

import com.bryan.finance.literals.Literals;
import com.bryan.finance.utility.IconFactory;

public class AppFrame extends JFrame {

	private static final long serialVersionUID = -1466165079940417215L;

	public AppFrame() {
		this.setTitle(Literals.APP_NAME);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setDefaults();
	}

	public AppFrame(String title, boolean enableClose) {
		this.setTitle(title);
		if (enableClose) {
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		} else {
			this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		}
		setDefaults();
	}

	private void setDefaults() {
		this.setIconImage(IconFactory.APP_ICON.getImage());
		JRootPane rp = SwingUtilities.getRootPane(this);
		rp.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.setResizable(false);
	}
}
