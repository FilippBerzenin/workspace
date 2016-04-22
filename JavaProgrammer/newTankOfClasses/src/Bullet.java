
public class Bullet {

    private final int speed = 5;
    private int x = 0;
    private int y = 0;
    private int dirction = 1;
    private int STEP = 1;
    private int BULLET_SIZE = 14;
    private int BULLET_BORDER = 26;
    private int BULLET_IPHEAVAL = 25;


    public Bullet (int x, int y, int dirction) {
        this.x = x;
        this.y = y;
        this.dirction = dirction;
    }

    public void updateX (int x) {
        this.x += x;
    }

    public void updateY (int y) {
        this.y += y;
    }

    public void destroy () {
        x = -100;
        y = -100;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirction() {
        return dirction;
    }

    public int getSTEP() {
        return STEP;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBULLET_SIZE() {
        return BULLET_SIZE;
    }

    public int getBULLET_BORDER() {
        return BULLET_BORDER;
    }

    public int getBULLET_IPHEAVAL() {
        return BULLET_IPHEAVAL;
    }
}
