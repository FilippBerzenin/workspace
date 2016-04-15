package lesson_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import lesson_4.frame_4_1;

public class frame_4_1 extends JPanel {

	boolean COLORDED_MODE = true;
	
	int tankX = 0;
	int tankY = 0;
	
	long speed = 225;
	

	
	void runTheGame() throws Exception {
		

		moveToQuadrant(9, 9);
		moveToQuadrant(3, 3);
		moveToQuadrant(7, 7);

	}
		
	void moveToQuadrant (int v, int h) throws Exception{
		int[] getQ = getQuadrant (v, h);
		int verInt = getQ[1];
		int horInt = getQ[0];
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
	
	static int[] getQuadrant (int v, int h){
		int[] rezult = new int[1];
		String error = "error";
		if ((v==1||v==2||v==3||v==4||v==5||v==6||v==7||v==8||v==9)&&
			(h==1||h==2||h==3||h==4||h==5||h==6||h==7||h==8||h==9)) {
		
		int vResult = 0;
		if (v==1) {vResult=0;}
		if (v==2) {vResult=64;}
		if (v==3) {vResult=128;}
		if (v==4) {vResult=192;}
		if (v==5) {vResult=256;}
		if (v==6) {vResult=320;}
		if (v==7) {vResult=384;}
		if (v==8) {vResult=448;}
		if (v==9) {vResult=512;}
		
		
		int hResult = 0;
		if (h==1) {hResult=0;}
		if (h==2) {hResult=64;}
		if (h==3) {hResult=128;}
		if (h==4) {hResult=192;}
		if (h==5) {hResult=256;}
		if (h==6) {hResult=320;}
		if (h==7) {hResult=384;}
		if (h==8) {hResult=448;}
		if (h==9) {hResult=512;}
		rezult = new int[] {hResult, vResult};
		 
		}
		return rezult;
	}

	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	public static void main(String[] args) throws Exception {
		frame_4_1 bf = new frame_4_1();
		bf.runTheGame();
	}

	public frame_4_1() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH+20, BF_HEIGHT + 22+20));
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
