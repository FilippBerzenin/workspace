package Lesson_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class frame_2_17 extends JPanel {

	boolean COLORDED_MODE = true;
	
	int tankX = 0;
	int tankY = 0;
	
	long speed = 225;
	
	
	 void moveRandom()  {
		
		long timeRandom = System.currentTimeMillis();
		String timeRandomString = String.valueOf(timeRandom);
		String moveToChar = timeRandomString.substring(timeRandomString.length()-1);
		int moveToI = (Integer.parseInt(moveToChar))/2;
	    
    	int moveTo = 4;
	    if (moveToI>=1 && moveToI <=9) {
	    	moveTo = moveToI;
	    	  if (tankX == 512 && moveTo == 4) {
	    		moveTo = 3;}
	    	  if (tankX == 0 && moveTo == 3) {
		    		moveTo = 4;}
	    	  if (tankY == 512 && moveTo == 2) {
		    		moveTo = 1;}
	    	  if (tankY == 0 && moveTo == 1) {
		    		moveTo = 2;}
	    	}
	    	
	    	System.out.print(moveTo+" "+timeRandomString.substring(timeRandomString.length()-2)+" ");
	    move(moveTo);
	}

	void runTheGame() throws Exception {
		while (true) {
		moveRandom();
		repaint();
		Thread.sleep(speed);
		System.out.println(" "+tankX+" X "+tankY+" Y");
		}
//		while (true) {
//			if ( tankX < 512) {
//				tankX +=32;
//			System.out.println(tankX+" X");
//			repaint();
//			Thread.sleep(speed);
//			}
//			if (tankX == 512) {
//					
//				while (true) {
//					if ( tankX <= 512) {
//						tankX -= 32;
//						
//					System.out.println(tankX+" X");
//					repaint();
//					Thread.sleep(speed);
//					}
//					if (tankX == 0) break;}
//			}
//			}
//		}
	}
		
	
	void move(int direction) {
		if (direction == 1 && tankY >=64) {
			tankY = tankY-64; 
		} if (direction == 2 && tankY <=512-64) {
			tankY = tankY+64;  
		} if (direction == 3 && tankX >=64) {
			tankX = tankX-64; 
		} if (direction == 4 && tankX <=512-64) {
			tankX = tankX+64;
		}

	}

	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	public static void main(String[] args) throws Exception {
		frame_2_17 bf = new frame_2_17();
		bf.runTheGame();
	}

	public frame_2_17() throws Exception {
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