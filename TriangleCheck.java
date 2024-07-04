
public class TriangleClassifier {

    public static void classifyTriangle(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    public static void main(String[] args) {
        int side1 = 4, side2 = 7, side3 = 7;
        classifyTriangle(side1, side2, side3);
    }
}
