package kubik_rubik;

import java.util.Arrays;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

public class main_page extends JPanel {
	
	final boolean COLORDED_MODE = false;
	
	final static int SQUARE_SIZE_HEIGHT = 64;
	final static int SQUARE_SIZE_WIDTH = 64;
	final static int SIZE_HEIGHT = 3;
	final static int SIZE_WIDTH = 3;
	
	final static int GREEN_COLOUR = 0;
	
	final static int GREEN = 0;
	final static int RED = 1;
	final static int YELLOW = 2;
	final static int LILAC = 3;
	final static int BLUE = 4;
	final static int PURPLE = 5;
	
	final static int LEFT = 0;
//	final static int CENTER = 1;
	final static int RIGHT  = 2;
								
	final static int TOP = 3;
	final static int MIDDLE = 4;
	final static int BOOTOM = 5;
	
	final static int UP_TURN = 1;
	final static int DOWN_TURN = 2;
	final static int LEFT_TURN = 3; 
	final static int RIGHT_TURN = 4;
	
		static String [][][] main = new String [][][] {
			{
				{ "green_red_purple", "green_red", "green_red_blue" },
				{ "green_purple", "green_center", "green_blue" },
				{ "green_lilac_purple", "green_lilac", "green__lilac_blue" }
			},
			
			{
				{ "red_yellow_purple", "red_yellow", "red_yellow_blue"},
				{ "red_purple", "red_centre", "red_blue"},
				{ "red_green_purple", "red_green", "red_green_blue"}
			},
			
			{
				{ "yellow_lilac_purple", "yellow_lilac", "yellow_lilac_blue"},
				{ "yellow_purple", "yellow_center", "yellow_blue"},
				{ "yellow_red_purple", "yellow_red", "yellow_red_blue"}
			},
			
			{
				{ "lilac_green_purple", "lilac_green", "lilac_green_blue"},
				{ "lilac_purple", "lilac_center", "lilac_blue"},
				{ "lilac_yellow_purple", "lilac_yellow", "lilac_yellow_blue"}
			},
			
			{
				{ "blue_lilac_yellow", "blue_lilac", "blue_lilac_green"},
				{ "blue_yellow", "blue_center", "blue_green"},
				{ "blue_red_yellow", "blue_red", "blue_red_green"}
			},
			
			{
				{ "purple_red_yellow", "purple_red", "purple_red_green"},
				{ "purple_yellow", "purple_center", "purple_green"},
				{ "purple_lilac_yellow", "purple_lilac", "purple_lilac_green"}
			}
		};

		
		
	public static void main(String[] args) {
		
//		left_right_top(GREEN, RIGHT, DOWN_TURN);

//		printColor(GREEN);
//		printColor(RED);
//		printColor(YELLOW);
//		printColor (LILAC);
//		printColor (BLUE);
//		printColor (PURPLE);
		
		frame ();
	
		String[][] colourArray = colourArrayFill (GREEN);		
//		static String[][] colourArrayRed = new String [3][3];
//		static String[][] colourArrayYellow = new String [3][3];
//		static String[][] colourArrayLilac = new String [3][3];
//		static String[][] colourArrayBlue = new String [3][3];
//		static String[][] colourArrayPurple = new String [3][3];

	}


	static String[][] colourArrayFill (int colour) {
		String[][] newArray = main[colour];
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = squareColour(newArray[i][j]);
			}
			System.out.println(Arrays.toString(newArray[i]));
		}
		return newArray;
	}

	static void frame () {
	JFrame frame = new JFrame("KUBIK RUBIK FIELD");
	
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
//	JButton button9;
//	JButton button10;
//	JButton button11;
//	JButton button12;
//	JButton button13;
//	JButton button14;
//	JButton button15;
//	JButton button16;
//	JButton button17;
//	JButton button18;
//	JButton button19;
//	JButton button20;
//	JButton button21;
//	JButton button22;
//	JButton button23;
//	JButton button24;
//	JButton button25;
//	JButton button26;
//	JButton button27;
//	JButton button28;
//	JButton button29;
//	JButton button30;
//	JButton button31;
//	JButton button32;
//	JButton button33;
//	JButton button34;
//	JButton button35;
//	JButton button36;
//	JButton button37;
//	JButton button38;
//	JButton button39;
//	JButton button40;
//	JButton button41;
//	JButton button42;
//	JButton button43;
//	JButton button44;
//	JButton button45;
//	JButton button46;
//	JButton button47;
//	JButton button48;
//	JButton button49;
//	JButton button50;
//	JButton button51;
//	JButton button52;
//	JButton button53;


	JPanel p1;
	
	button0 = new JButton("0");
	button1 = new JButton("1");
	button2 = new JButton("2");
	button3 = new JButton("3");
	button4 = new JButton("4");
	button5 = new JButton("5");
	button6 = new JButton("6");
	button7 = new JButton("7");
	button8 = new JButton("8");
//	button9 = new JButton("9");
//	button10 = new JButton("10");
//	button11 = new JButton("11");
//	button12 = new JButton("12");
//	button13 = new JButton("13");
//	button14 = new JButton("14");
//	button15 = new JButton("15");
//	button16 = new JButton("16");
//	button17 = new JButton("17");
//	button18 = new JButton("18");
//	button19 = new JButton("19");
//	button20 = new JButton("20");
//	button21 = new JButton("21");
//	button22 = new JButton("22");
//	button23 = new JButton("23");
//	button24 = new JButton("24");
//	button25 = new JButton("25");
//	button26 = new JButton("26");
//	button27 = new JButton("27");
//	button28 = new JButton("28");
//	button29 = new JButton("29");
//	button30 = new JButton("30");
//	button31 = new JButton("31");
//	button32 = new JButton("32");
//	button33 = new JButton("33");
//	button34 = new JButton("34");
//	button35 = new JButton("35");
//	button36 = new JButton("36");
//	button37 = new JButton("37");
//	button38 = new JButton("38");
//	button39 = new JButton("39");
//	button40 = new JButton("40");
//	button41 = new JButton("41");
//	button42 = new JButton("42");
//	button43 = new JButton("43");
//	button44 = new JButton("44");
//	button45 = new JButton("45");
//	button46 = new JButton("46");
//	button47 = new JButton("47");
//	button48 = new JButton("48");
//	button49 = new JButton("49");
//	button50 = new JButton("50");
//	button51 = new JButton("51");
//	button52 = new JButton("52");
//	button53 = new JButton("53");

	
	JPanel windowContent;
	JTextField displayField;
	windowContent = new JPanel();
	BorderLayout b1 = new BorderLayout();
	windowContent.setLayout (b1);
	p1 = new JPanel();
	GridLayout g1 = new GridLayout(3,3);
	p1.setLayout (g1);
	
	button0 = new JButton(main[0][0][0]);
	button1 = new JButton(main[0][0][1]);
	button2 = new JButton(main[0][0][2]);
	button3 = new JButton(main[0][1][0]);
	button4 = new JButton(main[0][1][1]);
	button5 = new JButton(main[0][1][2]);
	button6 = new JButton(main[0][2][0]);
	button7 = new JButton(main[0][2][1]);
	button8 = new JButton(main[0][2][2]);
//	button9 = new JButton(main[1][0][0]);
//	button10 = new JButton(main[1][0][1]);
//	button11 = new JButton(main[1][0][2]);
//	button12 = new JButton(main[1][1][0]);
//	button13 = new JButton(main[1][1][1]);
//	button14 = new JButton(main[1][1][2]);
//	button15 = new JButton(main[1][2][0]);
//	button16 = new JButton(main[1][2][1]);
//	button17 = new JButton(main[1][2][2]);
//	button18 = new JButton(main[2][0][0]);	
//	button19 = new JButton(main[2][0][1]);
//	button20 = new JButton(main[2][0][2]);
//	button21 = new JButton(main[2][1][0]);
//	button22 = new JButton(main[2][1][1]);
//	button23 = new JButton(main[2][1][2]);
//	button24 = new JButton(main[2][2][0]);
//	button25 = new JButton(main[2][2][1]);
//	button26 = new JButton(main[2][2][2]);
//	button27 = new JButton(main[3][0][0]);	
//	button28 = new JButton(main[3][0][1]);
//	button29 = new JButton(main[3][0][2]);
//	button30 = new JButton(main[3][1][0]);
//	button31 = new JButton(main[3][1][1]);
//	button32 = new JButton(main[3][1][2]);
//	button33 = new JButton(main[3][2][0]);
//	button34 = new JButton(main[3][2][1]);
//	button35 = new JButton(main[3][2][2]);
//	button36 = new JButton(main[4][0][0]);	
//	button37 = new JButton(main[4][0][1]);
//	button38 = new JButton(main[4][0][2]);
//	button39 = new JButton(main[4][1][0]);
//	button40 = new JButton(main[4][1][1]);
//	button41 = new JButton(main[4][1][2]);
//	button42 = new JButton(main[4][2][0]);
//	button43 = new JButton(main[4][2][1]);
//	button44 = new JButton(main[4][2][2]);
//	button45 = new JButton(main[5][0][0]);	
//	button46 = new JButton(main[5][0][1]);
//	button47 = new JButton(main[5][0][2]);
//	button48 = new JButton(main[5][1][0]);
//	button49 = new JButton(main[5][1][1]);
//	button50 = new JButton(main[5][1][2]);
//	button51 = new JButton(main[5][2][0]);
//	button52 = new JButton(main[5][2][1]);
//	button53 = new JButton(main[5][2][2]);
		
	p1.add(button0);
	p1.add(button1);
	p1.add(button2);
	p1.add(button3);
	p1.add(button4);
	p1.add(button5);
	p1.add(button6);
	p1.add(button7);
	p1.add(button8);
	
	
	windowContent.add("Center", p1);
	
	frame.setContentPane(windowContent);
    p1.setBackground(Color.BLACK);
    p1.setForeground(Color.RED);
	
	frame.pack();
	frame.setVisible(true);
//	
//	frame.setSize(450, 450); 
	frame.setMinimumSize(new Dimension((SQUARE_SIZE_HEIGHT*SIZE_HEIGHT), (SQUARE_SIZE_WIDTH*SIZE_WIDTH)));
//	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//	JLabel lebel = new JLabel ("Test label");
//	frame.getContentPane().add(lebel);
//	frame.pack();
//	frame.setVisible(true);
	}
	
//	@Override
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		System.out.println("Start");
//		int i = 0;
//		Color cc;
//		for (int v = 0; v < SIZE_HEIGHT; v++) {
//			for (int h = 0; h < SIZE_WIDTH; h++) {
//				if (COLORDED_MODE) {
//					if (i % 2 == 0) {
//						cc = new Color(252, 241, 177);
//					} else {
//						cc = new Color(233, 243, 255);
//					}
//				} else {
//					cc = new Color(180, 180, 180);
//				}
//				i++;
//				g.setColor(cc);
//				g.fillRect(h * 64, v * 64, 64, 64);
//			}
//		}
//		String[][] colourArray = colourArrayFill (GREEN);
//		int x = 0;
//		int y = 0;
//		for (int j = 0; j < colourArray.length; j++) {
//			for (int k = 0; k < colourArray[j].length; k++) {
//				x = j*64;
//				y = k*64;
//				if (colourArray[j][k].equals("G")) {
//					g.setColor(new Color(144, 77, 48));
//					g.fillRect(x, y, SQUARE_SIZE_HEIGHT, SQUARE_SIZE_WIDTH);
//				}
//			}
//		}
//	}
	
	static String squareColour (String square) {
		int endFind = square.indexOf("_");
		String colour = square.substring(0,endFind);
		switch (colour) {
		case "green":
			colour = "G";
			break;
		case "red":
			colour = "R";
			break;
		case "yellow":
			colour = "Y";
			break;
		case "lilac":
			colour = "L";
			break;
		case "blue":
			colour = "B";
			break;
		case "purple":
			colour = "P";
			break;
		default:
		}
		return colour;
		
	}

	static void printColor(int color) {
		printSide(color, TOP);
		printSide(color, MIDDLE);
		printSide(color, BOOTOM);
		System.out.println();
	}

	static void left_right_top(int colour, int side, int direction) {
		if (errorTurn(side, direction) == false) {
			System.out.println("Error of direction");
			System.exit(0);
		}
		side = changeSide(side);
		int[] nextColours = sequenceColour(colour);
		if (direction == 1) {
			for (int i = 0; i < 3; i++) {
				String memFirst = main[colour][i][side];
				main[colour][i][side] = main[nextColours[0]][i][side];
				main[nextColours[0]][i][side] = main[nextColours[1]][i][side];
				main[nextColours[1]][i][side] = main[nextColours[2]][i][side];
				main[nextColours[2]][i][side] = memFirst;
			}
			String mem = main[nextColours[5]][0][0];
			main[nextColours[BLUE]][0][0] = main[nextColours[BLUE]][2][0];
			main[nextColours[BLUE]][2][0] = main[nextColours[BLUE]][2][2];
			main[nextColours[BLUE]][2][2] = main[nextColours[BLUE]][0][2];
			main[nextColours[BLUE]][0][2] = mem;
			String memCenter = main[nextColours[BLUE]][1][2];
			main[nextColours[BLUE]][1][2] = main[nextColours[BLUE]][0][1];
			main[nextColours[BLUE]][0][1] = main[nextColours[BLUE]][1][0];
			main[nextColours[BLUE]][1][0] = main[nextColours[BLUE]][2][1];
			main[nextColours[BLUE]][2][1] = memCenter;
		}

		if (direction == 2) {
			for (int i = 0; i < 3; i++) {
				String memFirst = main[colour][i][side];
				main[colour][i][side] = main[nextColours[2]][i][side];
				main[nextColours[2]][i][side] = main[nextColours[1]][i][side];
				main[nextColours[1]][i][side] = main[nextColours[0]][i][side];
				main[nextColours[0]][i][side] = memFirst;
			}
			String mem = main[nextColours[5]][0][0];
			main[nextColours[PURPLE]][0][0] = main[nextColours[PURPLE]][2][0];
			main[nextColours[PURPLE]][2][0] = main[nextColours[PURPLE]][2][2];
			main[nextColours[PURPLE]][2][2] = main[nextColours[PURPLE]][0][2];
			main[nextColours[PURPLE]][0][2] = mem;
			String memCenter = main[nextColours[PURPLE]][1][2];
			main[nextColours[PURPLE]][1][2] = main[nextColours[PURPLE]][0][1];
			main[nextColours[PURPLE]][0][1] = main[nextColours[PURPLE]][1][0];
			main[nextColours[PURPLE]][1][0] = main[nextColours[PURPLE]][2][1];
			main[nextColours[PURPLE]][2][1] = memCenter;
		}

		if (direction == 3) {
			for (int i = 0; i < 3; i++) {
				String memFirst = main[colour][side][i];
				main[colour][side][i] = main[nextColours[4]][side][i];
				main[nextColours[4]][side][i] = main[nextColours[1]][side][i];
				main[nextColours[1]][side][i] = main[nextColours[5]][side][i];
				main[nextColours[5]][side][i] = memFirst;
			}

			int nextColour = nextColours[2];
			String mem = main[nextColours[2]][0][0];
			main[nextColours[2]][0][0] = main[nextColours[2]][2][0];
			main[nextColours[2]][2][0] = main[nextColours[2]][2][2];
			main[nextColours[2]][2][2] = main[nextColours[2]][0][2];
			main[nextColours[2]][0][2] = mem;
			String memCenter = main[nextColours[2]][1][2];
			main[nextColours[2]][1][2] = main[nextColours[2]][0][1];
			main[nextColours[2]][0][1] = main[nextColours[2]][1][0];
			main[nextColours[2]][1][0] = main[nextColours[2]][2][1];
			main[nextColours[2]][2][1] = memCenter;
		}

		if (direction == 4) {
			for (int i = 0; i < 3; i++) {
				String memFirst = main[colour][side][i];
				main[colour][side][i] = main[nextColours[5]][side][i];
				main[nextColours[5]][side][i] = main[nextColours[1]][side][i];
				main[nextColours[1]][side][i] = main[nextColours[4]][side][i];
				main[nextColours[4]][side][i] = memFirst;
			}

			int nextColour = nextColours[2];
			String mem = main[nextColours[2]][0][0];
			main[nextColours[2]][0][0] = main[nextColours[2]][0][2];
			main[nextColours[2]][0][2] = main[nextColours[2]][2][2];
			main[nextColours[2]][2][2] = main[nextColours[2]][2][0];
			main[nextColours[2]][2][0] = mem;
			String memCenter = main[nextColours[2]][1][2];
			main[nextColours[2]][1][2] = main[nextColours[2]][2][1];
			main[nextColours[2]][2][1] = main[nextColours[2]][1][0];
			main[nextColours[2]][1][0] = main[nextColours[2]][0][1];
			main[nextColours[2]][0][1] = memCenter;
		}

	}

	static int[] sequenceColour(int colour) {
		int[] nextColours = null;
		switch (colour) {
		case GREEN:
			nextColours = new int[] { LILAC, YELLOW, RED, GREEN, BLUE, PURPLE };
			break;
		case RED:
			nextColours = new int[] { GREEN, LILAC, YELLOW, RED, BLUE, PURPLE };
			break;
		case YELLOW:
			nextColours = new int[] { RED, GREEN, LILAC, YELLOW, BLUE, PURPLE };
			break;
		case LILAC:
			nextColours = new int[] { YELLOW, RED, GREEN, LILAC, BLUE, PURPLE };
			break;
		case BLUE:
			nextColours = new int[] { LILAC, PURPLE, RED, BLUE, YELLOW, GREEN };
			break;
		case PURPLE:
			nextColours = new int[] {};
			break;
		default:
			break;
		}
		return nextColours;
	}

	static void printSide(int colour, int side) {
		side = changeSide(side);
		for (int i = 0; i < 3; i++) {
			System.out.print(main[colour][side][i] + ", ");
		}
		System.out.println();
	}

	static boolean errorTurn(int side, int direction) {
		if (side == LEFT || side == RIGHT) {
			if (direction == UP_TURN || direction == DOWN_TURN) {
				return true;
			}
		}
		if (side == TOP || side == BOOTOM) {
			if (direction == LEFT_TURN || direction == RIGHT_TURN) {
				return true;
			}
		}
		return false;
	}

	static int changeSide(int side) {
		switch (side) {
		case 3:
			side = 0;
			break;
		case 4:
			side = 1;
			break;
		case 5:
			side = 2;
		default:
			break;
		}
		return side;
	}
}


//static String[][] green = new String[][] {
//{ "green_red_purple", "green_red", "green_red_blue" },
//{ "green_purple", "green_center", "green_blue" },
//{ "green_lilac_purple", "green_lilac", "green__lilac_blue" } };
//
//static String[][] red = new String[][] {
//{ "red_yellow_purple", "red_yellow", "red_yellow_blue"},
//{ "red_purple", "red_centre", "red_blue"},
//{ "red_green_purple", "red_green", "red_green_blue"}
//};
//
//static String [][] yellow = new String [][] {
//{ "yellow_lilac_purple", "yellow_lilac", "yellow_lilac_blue"},
//{ "yellow_purple", "yellow_center", "yellow_blue"},
//{ "yellow_red_purple", "yellow_red", "yellow_red_blue"}
//};
//
//static String [][] lilac = new String [][] {
//{ "lilac_green_purple", "lilac_green", "lilac_green_blue"},
//{ "lilac_purple", "lilac_center", "lilac_blue"},
//{ "lilac_yellow_purple", "lilac_yellow", "lilac_yellow_blue"}
//};
//
//static String [][] blue = new String [][] {
//{ "blue_lilac_yellow", "blue_lilac", "blue_lilac_green"},
//{ "blue_yellow", "blue_center", "blue_green"},
//{ "blue_red_yellow", "blue_red", "blue_red_green"}
//};
//
//static String [][] purple = new String [][] {
//{ "purple_red_yellow", "purple_red", "purple_red_green"},
//{ "purple_yellow", "purple_center", "purple_green"},
//{ "purple_lilac_yellow", "purple_lilac", "purple_lilac_green"}
//};







