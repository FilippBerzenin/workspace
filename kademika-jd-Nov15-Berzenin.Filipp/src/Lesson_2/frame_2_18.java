package Lesson_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class frame_2_18 extends JPanel {

	boolean COLORDED_MODE = true;
	
	int tankX = 0;
	int tankY = 0;
	
	long speed = 225;
	

	
	void runTheGame() throws Exception {
		

		moveToQuadrant("i", "9");
		moveToQuadrant("c", "3");
		moveToQuadrant("h", "7");

	}
		
	void moveToQuadrant (String v, String h) throws Exception{
		String getQ = getQuadrant (v, h);
		String verFoInt = getQ.substring(getQ.indexOf("_")+1, getQ.length());
		String horFoInt = getQ.substring(0, getQ.indexOf("_"));
		int verInt = Integer.parseInt(verFoInt);
		int horInt = Integer.parseInt(horFoInt);
		System.out.println(verInt);
		System.out.println(horInt);

		while (true) {
			if (tankX != horInt) {
				if (tankX < horInt) {
					move(4);}
				else move(3);}
			if (tankX == horInt) {break;}
				}
		while (true) {
			if (tankY != verInt) {
				if (tankY < verInt) {
					move(2);}
				else move(1);}
			if (tankY == verInt) {break;}
		}
	
	}
		
	void move(int direction) throws Exception {
		if (direction == 1 && tankY >=64) {
			tankY = tankY-64; 
			repaint();
			Thread.sleep(speed);
		} if (direction == 2 && tankY <=512-64) {
			tankY = tankY+64;
			repaint();
			Thread.sleep(speed);
		} if (direction == 3 && tankX >=64) {
			tankX = tankX-64;
			repaint();
			Thread.sleep(speed);
		} if (direction == 4 && tankX <=512-64) {
			tankX = tankX+64;
			repaint();
			Thread.sleep(speed);
		}

	}
	
	static String getQuadrant (String v, String h){
		String error = "error";
		if ((v=="a"||v=="b"||v=="c"||v=="d"||v=="e"||v=="f"||v=="g"||v=="h"||v=="i")&&
			(h=="1"||h=="2"||h=="3"||h=="4"||h=="5"||h=="6"||h=="7"||h=="8"||h=="9")) {
		
		String vResult = null;
		if (v=="a") {vResult="0";}
		if (v=="b") {vResult="64";}
		if (v=="c") {vResult="128";}
		if (v=="d") {vResult="192";}
		if (v=="e") {vResult="256";}
		if (v=="f") {vResult="320";}
		if (v=="g") {vResult="384";}
		if (v=="h") {vResult="448";}
		if (v=="i") {vResult="512";}
		
		
		String hResult = null;
		if (h=="1") {hResult="0";}
		if (h=="2") {hResult="64";}
		if (h=="3") {hResult="128";}
		if (h=="4") {hResult="192";}
		if (h=="5") {hResult="256";}
		if (h=="6") {hResult="320";}
		if (h=="7") {hResult="384";}
		if (h=="8") {hResult="448";}
		if (h=="9") {hResult="512";}
		String result = hResult+"_"+vResult; 
		return result;}
		
		else return error;
	}

	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	public static void main(String[] args) throws Exception {
		frame_2_18 bf = new frame_2_18();
		bf.runTheGame();
	}

	public frame_2_18() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
	}

}