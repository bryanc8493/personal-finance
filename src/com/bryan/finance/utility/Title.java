package com.bryan.finance.utility;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import com.bryan.finance.literals.Literals;

public class Title extends JLabel {

	private static final long serialVersionUID = -988525455660182558L;

	public Title(String text) {
		super(text, JLabel.CENTER);
		setFont(new Font("sans serif", Font.BOLD, 18));
		setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
		setForeground(Literals.APP_COLOR);
	}
}
