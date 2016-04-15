package kalkulytor;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class main {
	
	JPanel windowContent;
	JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	
	JButton buttonEqual;
	JPanel p1;
	
	void Calculator () {
		windowContent = new JPanel();
		BorderLayout b1 = new BorderLayout();
		windowContent.setLayout (b1);
		
		JTextField txtDisplay  = new JTextField(30);
		windowContent.add ("North", txtDisplay);
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonPoint = new JButton (".");
		buttonEqual = new JButton ("=");
		
		p1 = new JPanel();
		GridLayout g1 = new GridLayout(4,2);
		p1.setLayout (g1);
		
		p1.add(button0);
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
		p1.add(button6);
		p1.add(button7);
		p1.add(button8);
		p1.add(button9);
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		windowContent.add("Center", p1);
		
		JFrame frame = new JFrame("My first Calculator");
		frame.setContentPane(windowContent);
		
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		main calc = new main ();

	}

}
