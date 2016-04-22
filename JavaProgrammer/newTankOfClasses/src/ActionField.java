import javax.swing.*;
import java.awt.*;

public class ActionField extends JPanel {

    final boolean COLORDED_MODE = false;

    private BattelField battelField;
    private Tank tank;
    private Bullet bullet;

    void runTheGame() throws Exception {
       tank.fire();
       tank.fire();
       tank.fire();
       tank.move();
       tank.turn(3);
       tank.fire();
       tank.move();
    }

    public void processTurn (Tank tank) throws Exception {
        repaint();
    }

    public void processMove (Tank tank) throws Exception {
        this.tank = tank;
        int direction = tank.getDirection();
        int step = tank.getSTEP();
        int covered = 0;
//        errorBorders(direction);
        // check limits x: 0, 513; y: 0, 513
        //       processTurn(direction);
        if ((direction == 1 && tank.getY() == 0) || (direction == 2 && tank.getY() >= 512)
            || (direction == 3 && tank.getX() == 0) || (direction == 4 && tank.getX() == 512)){
            System.out.print("Error of way");
            return;
        }

        tank.turn(direction);

        while (covered < 64) {
            if (direction == tank.getTOP()) {
//                scanTargetTop();
                tank.updateY(-tank.getSTEP());
            } else if (direction == tank.getBOTTOM()) {
//                scanTargetBottom();
                tank.updateY(+tank.getSTEP());
            } else if (direction == tank.getLEFT()) {
//                scanTargetLeft();
                tank.updateX(-tank.getSTEP());
            } else {
                //               scanTargetRight();
                tank.updateX(+tank.getSTEP());
            }
            covered += tank.getSTEP();
            repaint();
            Thread.sleep(tank.getSpeed());
        }
    }

    public void processFire (Bullet bullet) throws Exception {
        this.bullet = bullet;
        int step = 1;
        while (bullet.getX() > -bullet.getBULLET_SIZE() && bullet.getX() < (bullet.getBULLET_SIZE() + battelField.getBF_WIDTH())
                && bullet.getY() > -bullet.getBULLET_SIZE() && bullet.getY() < (bullet.getBULLET_SIZE() + battelField.getBF_HEIGHT())) {
            if (bullet.getDirction() == tank.getTOP()) {
                bullet.updateY(-step);
            } else if (bullet.getDirction() == tank.getBOTTOM()) {
                bullet.updateY(+step);
            } else if (bullet.getDirction() == tank.getLEFT()) {
                bullet.updateX(-step);
            } else {
                bullet.updateX(+step);
            }
            if (processInterception()) {
                bullet.destroy();
            }
            repaint();
            Thread.sleep(bullet.getSpeed());
        }
    }

//    int bulletBorder(int direction) {
//        int bulletBorder = 0;
//        if (direction == tank.getTOP()) {
//            bulletBorder = tank.getY() + bullet.getBULLET_IPHEAVAL() + bullet.getBULLET_SIZE();
//        } else if (direction == tank.getBOTTOM()) {
//            bulletBorder = battelField.getBF_HEIGHT() - tank.getY() - bullet.getBULLET_IPHEAVAL() + bullet.getBULLET_SIZE();
//        } else if (direction == tank.getLEFT()) {
//            bulletBorder = tank.getX() + bullet.getBULLET_IPHEAVAL() + bullet.getBULLET_SIZE();
//        } else if (direction == tank.getRIGHT()) {
//            bulletBorder = battelField.getBF_WIDTH() - tank.getX() - bullet.getBULLET_IPHEAVAL() + bullet.getBULLET_SIZE();
//        }
//        return bulletBorder;
//    }

    private boolean processInterception() {
        String coordinates = getQuadrant(bullet.getX(), bullet.getY());
        int y = Integer.parseInt(coordinates.split("_")[0]);
        int x = Integer.parseInt(coordinates.split("_")[1]);

        if(y >= 0 && y < 9 && x >=0 && x < 9) {
            if (!battelField.scanquadrant(y, x).trim().isEmpty()) {
                battelField.updateQuadrant(y, x, "");
                return true;
            }
        }
        return false;
    }

    public String getQuadrant(int x, int y) {
        return y/64 + "_" +x/64;
    }

    public String getQuadrantXY(int v, int h) {
        return (v - 1) * 64 + "_" + (h - 1) * 64;
    }
    public static void mainActionField () throws Exception {
        ActionField bf = new ActionField();
        bf.runTheGame();
    }

    public ActionField() throws Exception {
        battelField = new BattelField();
        tank = new Tank(this, battelField);
        bullet = new Bullet(-100, -100, -1);

        JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(battelField.getBF_WIDTH(), battelField.getBF_HEIGHT() + 22+48));
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

        for (int j = 0; j < battelField.getDimentionY(); j++) {
            for (int k = 0; k < battelField.getDimentionX(); k++) {
                if (battelField.scanquadrant(j,k).equals("B")) {
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
        g.fillRect(tank.getX(), tank.getY(), 64, 64);

        g.setColor(new Color(0, 255, 0));
        if (tank.getDirection() == 1) {
            g.fillRect(tank.getX() + 20, tank.getY(), 24, 34);
        } else if (tank.getDirection() == 2) {
            g.fillRect(tank.getX() + 20, tank.getY() + 30, 24, 34);
        } else if (tank.getDirection() == 3) {
            g.fillRect(tank.getX(), tank.getY() + 20, 34, 24);
        } else {
            g.fillRect(tank.getX() + 30, tank.getY() + 20, 34, 24);
        }

        g.setColor(new Color(255, 255, 0));
        g.fillRect(bullet.getX(), bullet.getY(), 14, 14);
    }
}
