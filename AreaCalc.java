import java.util.Scanner;

public class AreaCalc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter shape. Choose from Square, Rectangle, Triangle, Circle " +
                        " and Parallelogram: ");
        String shapeInput = scan.nextLine().toLowerCase();
        System.out.print("Perimeter or Area? ");
        String calculateWhat = scan.nextLine();

        double length, width, height, radius;
        switch (shapeInput) {
            case "square":
                System.out.print("Enter a positive measurement for the side of this square: ");
                length = Double.parseDouble(scan.nextLine());
                if (calculateWhat.equalsIgnoreCase("perimeter")) {
                    System.out.println("The perimeter of this square is " + 4 * length);
                } else {
                    System.out.println("The area of this square is " + Math.pow(length,2));
                }

		// Do the same if-else for all other shapes!
			
                break;
            case "rectangle":
                System.out.print("Enter a positive measurement for the length of this rectangle: ");
                length = Double.parseDouble(scan.nextLine());
                System.out.print("Enter a positive measurement for the width of this rectangle: ");
                width = Double.parseDouble(scan.nextLine());
                System.out.printf("The area of this rectangle is %.2f\n", length * width);
                break;
            case "triangle":
                System.out.print("Enter a positive measurement for the base of this triangle: ");
                length = Double.parseDouble(scan.nextLine());
                System.out.print("Enter a positive measurement for the height of this triangle: ");
                height = Double.parseDouble(scan.nextLine());
                System.out.printf("The area of this triangle is %.2f\n", (length * height) / 2);
                break;
            case "circle":
                System.out.print("Enter a positive measurement for the radius of this circle: ");
                radius = Double.parseDouble(scan.nextLine());
                System.out.printf("The area of this circle is %.2f\n", Math.PI * Math.pow(radius,
                        2));
                break;
            case "parallelogram":
                System.out.print("Enter a positive measurement for the base of this " +
                        "parallelogram: ");
                length = Double.parseDouble(scan.nextLine());
                System.out.print("Enter a positive measurement for the height of this parallelogram: ");
                height = Double.parseDouble(scan.nextLine());
                System.out.printf("The area of this parallelogram is %.2f\n", length * height);
                break;
            default:
                System.out.println("Invalid shape entered.");
        } // end switch
    }
}
