import java.util.Scanner;
import java.text.DecimalFormat;
public class intersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter xl , yl , x 2 , y 2 , x 3 , y 3 , x 4 , y 4 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a1 = (y1 - y2);
        double a2 = (y3 - y4);
        double b1 = -(x1 - x2);
        double b2 = -(x3 - x4);
        double c1 = (y1 - y2) * x1 -(x1 - x2) * y1;
        double c2 = (y3 - y4) * x3 -(x3 - x4) * y3;
        if(a1 * b2 - a2 * b1 == 0){
            System.out.println("The two lines are parallel");
        }else{
            double x = (c1 * b2 - c2 * b1) / (a1 * b2 - a2 * b1);
            double y = (c2 * a1 - c1 * a2) / (a1 * b2 - a2 * b1);
            DecimalFormat df1 = new DecimalFormat("#.00000");
            DecimalFormat df2 = new DecimalFormat("#.0000");
            System.out.println("The intersecting point is at ( "+df1.format(x)+" , "+df2.format(y)+" )");
        }
        input.close();
    }
}

