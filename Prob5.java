public class Prob5 {

    public static void main(String[] args) {
        double length = 36;
        double breadth = 36;
        double radius = 36;

        // Calculate area and perimeter of the rectangle
        double areaRectangle = length * breadth;
        double perimeterRectangle = 2 * (length + breadth);

        // Calculate area and circumference of the circle
        double areaCircle = Math.PI * radius * radius;
        double circumferenceCircle = 2 * Math.PI * radius;

        // results
        System.out.println("Area of the rectangle: " + areaRectangle);
        System.out.println("Perimeter of the rectangle: " + perimeterRectangle);
        System.out.println("Area of the circle: " + areaCircle);
        System.out.println("Circumference of the circle: " + circumferenceCircle);
    }
}
