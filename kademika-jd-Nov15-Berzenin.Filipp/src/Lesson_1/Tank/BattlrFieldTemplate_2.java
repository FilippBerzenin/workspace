package Lesson_1.Tank;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattlrFieldTemplate_2 extends JPanel {

	

		boolean COLORDED_MODE = true;
		
		int tankX = 0;
		int tankY = 0;
		
		long speed = 15;
		
		int intDirection = 1;
		/* intDirection 1 - forward
		 * intDirection 2 - back
		 * intDirection 3 - left
		 * intDirection 4 - right
		 * TankX = 0, tankY = 0 (move to the right)*/
				
		void runTheGame() throws Exception {
			
			move(intDirection);
			System.out.println(tankX+"X"+" "+tankY+"Y");
			Thread.sleep(1000);
			intDirection = 4;
			move(intDirection);
			System.out.println(tankX+"X"+" "+tankY+"Y");
			Thread.sleep(1000);
			intDirection = 4;
			move(intDirection);
			System.out.println(tankX+"X"+" "+tankY+"Y");
			Thread.sleep(1000);
			intDirection = 2;
			move(intDirection);
			System.out.println(tankX+"X"+" "+tankY+"Y");
			Thread.sleep(1000);
			
			moveToQuadrant(9, 9);
			System.out.println(tankX+"X"+" "+tankY+"Y");
			Thread.sleep(1000);			
			moveToQuadrant(3, 3);
			System.out.println(tankX+"X"+" "+tankY+"Y");
			Thread.sleep(1000);			
			moveToQuadrant(7, 7);
			System.out.println(tankX+"X"+" "+tankY+"Y");
			Thread.sleep(1000);			

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
			
			turn(direction);
			
			if (direction == 1 && tankY >=64) {
				for (int i=0; i<64;i++) {
				tankY = tankY-1; 
				repaint();
				Thread.sleep(speed);}
			} if (direction == 2 && tankY <=512-64) {
				for (int i=0; i<64;i++){
				tankY = tankY+1;
				repaint();
				Thread.sleep(speed);}
			} if (direction == 3 && tankX >=64) {
				for (int i=0; i<64;i++){
				tankX = tankX-1;
				repaint();
				Thread.sleep(speed);}
			} if (direction == 4 && tankX <=512-64) {
				for (int i=0; i<64;i++){
				tankX = tankX+1;
				repaint();
				Thread.sleep(speed);}
			}

		}
		
		void turn (int direction) {
			if (intDirection != direction) {
		intDirection = direction;
		}
		}
		static int[] getQuadrant (int v, int h){
			int[] rezult = new int[1];
			String error = "error";
			if ((v==1||v==2||v==3||v==4||v==5||v==6||v==7||v==8||v==9)&&
				(h==1||h==2||h==3||h==4||h==5||h==6||h==7||h==8||h==9)) {
			
			int vResult = (v-1)*64;
			int hResult = (h-1)*64;
			rezult = new int[] {hResult, vResult};
			}
			return rezult;
		}

		// Magic bellow. Do not worry about this now, you will understand everything in this course.
		// Please concentrate on your tasks only.

		final int BF_WIDTH = 576;
		final int BF_HEIGHT = 576;
		
		public static void main(String[] args) throws Exception {
			BattlrFieldTemplate_2 bf = new BattlrFieldTemplate_2();
			bf.runTheGame();
		}

		public BattlrFieldTemplate_2() throws Exception {
			JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
			frame.setLocation(500, 50);
			frame.setMinimumSize(new Dimension(BF_WIDTH+18, BF_HEIGHT + 22+18));
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
