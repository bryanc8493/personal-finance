package com.bryan.finance.utility;

import java.util.Arrays;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.bryan.finance.literals.Literals;
import com.bryan.finance.program.PersonalFinance;

public class AppException extends RuntimeException {

	private static final long serialVersionUID = -5372718122579774824L;
	private static final Logger logger = Logger.getLogger(AppException.class);

	public AppException(Exception e) {
		super(e);
		String msgAndStacktrace = e.toString()
				+ Literals.NEW_LINE
				+ Arrays.toString(e.getStackTrace()).replace(Literals.COMMA,
						Literals.LOG_NEW_LINE);
		logger.fatal("Application Exception: " + msgAndStacktrace);
		PersonalFinance.appLogger.logFooter();
		JOptionPane.showMessageDialog(null, e.toString() + Literals.NEW_LINE
				+ Literals.NEW_LINE + "Check logs for more info",
				"Application Exception", JOptionPane.ERROR_MESSAGE);
		System.exit(1);
	}
}
