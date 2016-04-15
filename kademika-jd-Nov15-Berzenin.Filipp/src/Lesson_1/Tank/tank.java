package Lesson_1.Tank;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * @version 3.0
 */
public class tank extends JPanel {

	final boolean COLORDED_MODE = false;
	
	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	// 1 - top, 2 - bottom, 3 - left, 4 - right
	int tankDirection = 1;

	int tankX = 64*4;
	int tankY = 64*6;
	
	int bulletX = -100;
	int bulletY = -100;
	
	int speed = 10;
	int bulletSpeed = 5;

	String[][] battleField = {
			{" ", " ", " ", " ", "B", " ", " ", " ", " "},
			{" ", " ", " ", " ", "B", " ", " ", " ", " "},
			{" ", " ", " ", "B", "B", "B", " ", " ", " "},
			{"B", " ", "B", "B", "B", "B", "B", " ", "B"},
			{" ", " ", " ", "B", "B", "B", " ", " ", " "},
			{" ", "B", " ", "B", "B", "B", " ", "B", " "},
			{" ", "B", " ", " ", " ", " ", " ", "B", " "},
			{" ", "B", " ", "B", "B", "B", " ", "B", " "},
			{" ", "B", " ", "B", "B", "B", " ", "B", " "}
			};

	/**
	 * Write your code here.
	 */
	void runTheGame() throws Exception {
		
		moveToQuadrant(5, 5);
		moveToQuadrant(9, 5);
		moveToQuadrant(1, 8);
		moveToQuadrant(5, 5);
		moveToQuadrant(4, 6);
		moveToQuadrant(4, 5);
		moveToQuadrant(4, 4);
		moveToQuadrant(4, 5);
		moveToQuadrant(3, 5);
		moveToQuadrant(4, 5);
	}
	
	boolean processInterception() {
		String position = getQuadrant(bulletX, bulletY);
			int indexVertikal =  new Integer(position.substring(0, position.indexOf("_")));
			int indexHorizontal = new Integer(position.substring(position.indexOf("_")+1, position.length()));
//			System.out.println(indexHorizontal);
//			System.out.println(indexVertikal);
			if (indexHorizontal<9 && indexHorizontal>=0 && indexVertikal<9 && indexVertikal>=0) {
				for (int i=0; i<bulletX || i<bulletY; i++) {
					if (battleField[indexVertikal][indexHorizontal] == "B") {
						battleField[indexVertikal][indexHorizontal] = " ";
						return true;}
				}       
			}	return false;	   
	}
	
	
	String getQuadrant(int x, int y) {
		int xQuadrant = x/64;
		int yQuadrant = y/64;
		String rezult = Integer.toString(yQuadrant) + "_" + Integer.toString(xQuadrant);
		return rezult;
	}
	
	void fire() throws Exception {
		System.out.println("Shooter, fire!!!");
		
		int direction = tankDirection;
		
		turn(direction);
		
		bulletX = tankX+25;
		bulletY = tankY+25;
		int step = 1;
		int covered = 0;
		int bulletBorder = 0;
		
		if(direction == 1) {
			bulletBorder=tankY+25+14;
		} else if (direction == 2) {
			bulletBorder=576-tankY-25+14;
		} else if (direction == 3) {
				bulletBorder=tankX+25+14;
		} else if (direction == 4) {
			bulletBorder=576-tankX-25+14;
		}
		
		while (covered < bulletBorder) {
			if (direction == 1) {
				bulletY -= step;
				if (processInterception() == true) {
					bulletBorder = 26;
					}
	//			System.out.println("[fire up] direction: " + direction + " bulletX: " + bulletX + ", bulletY: " + bulletY);
			} else if (direction == 2) {
				bulletY += step;
				if (processInterception() == true) {
					bulletBorder = 26;
				}
	//			System.out.println("[fire down] direction: " + direction + " bulletX: " + bulletX + ", bulletY: " + bulletY);
			} else if (direction == 3) {
				bulletX -= step;
				if (processInterception() == true) {
					bulletBorder = 26;
				}
	//			System.out.println("[fire left] direction: " + direction + " bulletX: " + bulletX + ", bulletY: " + bulletY);
			} else {
				bulletX += step;
				if (processInterception() == true) {
					bulletBorder = 26;
				}
	//			System.out.println("[fire right] direction: " + direction + " bulletX: " + bulletX + ", bulletY: " + bulletY);
			}
			covered += step;
			repaint();
			Thread.sleep(bulletSpeed);
		}
		
		bulletY = -100;
		bulletX = -100;
		repaint();
		
	}  


	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	void move(int direction) throws Exception {
		int step = 1;
		int covered = 0;

		// check limits x: 0, 513; y: 0, 513
		if ((direction == 1 && tankY == 0) || (direction == 2 && tankY >= 512)
				|| (direction == 3 && tankX == 0) || (direction == 4 && tankX >= 512)) {
//			System.out.println("[illegal move] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			return;
		}
		
		turn(direction);
		if (clearing(direction)==true) {
		while (covered < 64) {
			if (direction == 1) {
				tankY -= step;
//				System.out.println("[move up] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			} else if (direction == 2) {
				tankY += step;
//				System.out.println("[move down] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			} else if (direction == 3) {
				tankX -= step;
//				System.out.println("[move left] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			} else {
				tankX += step;
//				System.out.println("[move right] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			}
			covered += step;

			repaint();
			Thread.sleep(speed);
		}
		}
	}
	
	boolean clearing (int direction) throws Exception {
		int indexVertikal = tankY/64;
		int indexHorizontal = tankX/64;
		if (direction == 1) {
			for (int i = tankY; i>-64; i-=64) {
//				System.out.println(tankX+" "+tankY);
//				System.out.println(indexVertikal + " " + indexHorizontal);
				if (battleField[(i/64)][indexHorizontal].equals("B")) {
					System.out.println("We have target! Coordinates " + "Vertikal "+((i/64)+1)+" "+
							"Horizontal "+(indexHorizontal+1));
					fire();
					return false;
					
				}
			}
		}
		else if (direction == 2) {
//			System.out.println("!!!!!!");
			for (int i = tankY; i<512+64; i+=64) {
//				System.out.println(tankX+" "+tankY);
//				System.out.println(indexVertikal + " " + indexHorizontal);
				if (battleField[(i/64)][indexHorizontal].equals("B")) {
					System.out.println("We have target! Coordinates " + "Vertikal "+((i/64)+1)+" "+
							"Horizontal "+(indexHorizontal+1));
					fire();
					return false;
					
				}
			}
		}
		else if (direction == 3) {
//			System.out.println("!!!!!!");
			for (int i = tankX; i>-64; i-=64) {
//				System.out.println(tankX+" "+tankY);
//				System.out.println(indexVertikal + " " + indexHorizontal);
				if (battleField[indexVertikal][i/64].equals("B")) {
					System.out.println("We have target! Coordinates " + "Vertikal "+(indexVertikal+1)+
							" "+"Horizontal "+((i/64)+1) );
					fire();
					return false;
					
				}
			}
		}
		else if (direction == 4) {
//			System.out.println("!!!!!!");
			for (int i = tankX; i<512+64; i+=64) {
//				System.out.println(tankX+" "+tankY);
//				System.out.println(indexVertikal + " " + indexHorizontal);
				if (battleField[indexVertikal][i/64].equals("B")) {
					System.out.println("We have target! Coordinates " + "Vertikal "+
							(indexVertikal+1)+" "+"Horizontal "+((i/64)+1) );
					fire();
					return false;
					
				}
			}
		}
		return true;
	}
	
	void turn(int direction) {
		if (tankDirection != direction) {
			tankDirection = direction;
		}
	}
	
	void moveRandom() throws Exception { 
		Random r = new Random();
		int i;
		while (true) {
			i = r.nextInt(5);
			if (i > 0) {
				move(i);
			}
		}
	}
	
	void moveToQuadrant(int v, int h) throws Exception {
		String coordinates = getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y = Integer.parseInt(coordinates.substring(0, separator));
		int x = Integer.parseInt(coordinates.substring(separator + 1));
		System.out.println("Driver! We have a route! Coordinates " + "Vertikal "+((y/64)+1)+" "+"Horizontal "+
		((x/64)+1)+" Go, go, go!");
		if (tankX < x) {
			while (tankX != x) {
				move(4);
			}
		} else {
			while (tankX != x) {
				move(3);
			}
		}

		if (tankY < y) {
			while (tankY != y) {
				move(2);
			}
		} else {
			while (tankY != y) {
				move(1);
			}
		}
	}

	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.
	
	
	public static void main(String[] args) throws Exception {
		tank bf = new tank();
		bf.runTheGame();
	}

	public tank() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
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
		
		for (int j = 0; j < battleField.length; j++) {
			for (int k = 0; k < battleField.length; k++) {
				if (battleField[j][k].equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates.substring(0, separator));
					int x = Integer.parseInt(coordinates.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
		
		g.setColor(new Color(0, 255, 0));
		if (tankDirection == 1) {
			g.fillRect(tankX + 20, tankY, 24, 34);
		} else if (tankDirection == 2) {
			g.fillRect(tankX + 20, tankY + 30, 24, 34);
		} else if (tankDirection == 3) {
			g.fillRect(tankX, tankY + 20, 34, 24);
		} else {
			g.fillRect(tankX + 30, tankY + 20, 34, 24);
		}
		
		g.setColor(new Color(255, 255, 0));
		g.fillRect(bulletX, bulletY, 14, 14);
	}

}