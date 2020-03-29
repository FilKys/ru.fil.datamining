import java.util.ArrayList;

public class Main {

    static ArrayList<ValueXY> data = new ArrayList<ValueXY>();

    public static void main(String[] args) {
        int inti;
        for(double i=1;i<=10;){
            ValueXY valueXY = new ValueXY();
            valueXY.setX(i);
            data.add(valueXY);
            System.out.println("x = "+  valueXY.getX()+" y = "+valueXY.getY());
            inti = (int) (i*10);
            inti+=1;
            i=(double) inti/10;
        }
    }
}
