package Tank;

public class main {

    public static void main(String[] args) {
        TankInfo();
      //  printTank(myTank[0]);
    }

    static void TankInfo() {
        tank[] myTank = new tank[5];
//          myTank[1].setColor("red");
//          myTank[1].setMaxSpeed(120);
//          myTank[1].setCrew(4);

        System.out.println(myTank[1].getColor() + myTank[1].getMaxSpeed() + myTank[1].getCrew());


//        myTank[0] = new tank("green", 120, 4);
//        myTank[1] = new tank("red", 80, 6);
//        myTank[2] = new tank("blue", 160, 3);
//        myTank[3] = new tank("white", 200, 2);
//        myTank[4] = new tank("black", 150, 5);

    }
    //	tank myTank = new tank(color, maxSpeed, crew);

//    static void printTank(tank) {
//        System.out.println("myTank.color :" + Arrays.toString(tank));
//		System.out.println("myTank.maxSpeed :"+myTank.maxSpeed);
//		System.out.println("myTank.crew :"+myTank.crew);
//    }
//}

}
