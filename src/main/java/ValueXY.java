public class ValueXY {

    double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        int intx = (int) (x*10);
        this.x = (double) intx / 10;
        valueY();
    }

    private void valueY() {
        double y = 10 + 5 * x + 3 * Math.sin(x);
        int inty = (int) (y*100);
        this.y = (double) inty/100;
    }

    public void setY(double y) {
        int inty = (int) (y*10);
        this.y = (double) inty / 10;
    }
}
