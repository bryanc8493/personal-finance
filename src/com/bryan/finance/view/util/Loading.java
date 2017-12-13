package com.bryan.finance.view.util;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.bryan.finance.literals.Literals;

public class Loading extends AppFrame {

	private static final long serialVersionUID = 756129410411763712L;

	public Loading() {
		JProgressBar pb = new JProgressBar();
		pb.setIndeterminate(true);

		JLabel title = new JLabel(Literals.LOAD_MESSAGE);
		title.setFont(new Font("sans serif", Font.BOLD, 16));

		JPanel content = new JPanel(new BorderLayout(0, 5));
		content.add(title, BorderLayout.NORTH);
		content.add(pb, BorderLayout.SOUTH);

		this.add(content);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	public void terminate() {
		dispose();
	}
}
