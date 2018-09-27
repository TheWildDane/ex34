import java.util.Scanner;

public class ex34 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



    double x0, y0, x1, y1, x2, y2, condition;
        System.out.print("Enter the three pointers");
    x0 = input.nextDouble();
    y0 = input.nextDouble();
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();
    condition = (x1 - x0) * (y2 - y0) - (x2  - x0) * (y1 - y0);

        if ((condition < 0.01) && (x0 <= x2) && (x2 <= x1));
        System.out.print("its on the line segment");
        input.close();
}
}
