package com.bryan.finance.view;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bryan.finance.literals.Literals;
import com.bryan.finance.program.PersonalFinance;
import com.bryan.finance.utility.Title;
import com.bryan.finance.view.util.AppFrame;
import com.bryan.finance.view.util.Loading;

public class Authentication {

	private int attempts;
	public AppFrame frame;

	public Authentication(Loading load) {
		frame = new AppFrame("Authentication", false);

		JLabel title = new Title(Literals.APP_NAME);

		JPanel panel = new JPanel(new BorderLayout(0, 10));
		panel.add(title, BorderLayout.NORTH);

		if (load != null)
			PersonalFinance.closeLoader();

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
