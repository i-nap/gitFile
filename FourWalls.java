import java.util.Scanner;

class FourWalls {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of room");
       double length = sc.nextDouble();
       System.out.println("Enter the breadth of room");
       double breadth = sc.nextDouble();
       System.out.println("Enter the height of room");
       double height = sc.nextDouble();
       System.out.println("Enter the rate");
       int rate = sc.nextInt();
       double cost = ((length * breadth * height) / 500)*rate;
       System.out.println("Cost of painting the four walls of a room is " + cost);

   }
}