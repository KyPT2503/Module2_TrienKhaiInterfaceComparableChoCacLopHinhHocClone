import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles=new Circle[5];
        circles[0]=new Circle(33);
        circles[1]=new Circle(11);
        circles[2]=new Circle(12);
        circles[3]=new Circle(1);
        circles[4]=new Circle(9);
        System.out.println(circles[0].compareTo(circles[1]));
        Arrays.sort(circles);
        for (Shape circle:circles) {
            System.out.println(circle.toString());
        }
    }
}
