import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args){
        int r, pie, circumference;
        pie = (22/7);
        //object creation of scanner
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.print("Enter radius of circle: ");
        r = sc.nextInt();

        circumference = (2*pie*r);
        System.out.println("Circumference Of the Circle is: " + circumference);
        sc.close();

    }
}
