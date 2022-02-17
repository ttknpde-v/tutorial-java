package Lab_geometry_math_square_triangle_cricle;

public class Main_cricle {
    public static void main(String[] args) {
        int $radius = 6;
        double $area,$diameter,$perimeter;
        Calculate_cricle $NEWOOP = new Calculate_cricle();
        /*

        เก็บค่า Return ลงตัวแปร $area,$diameter,$perimeter

         */
        $area = $NEWOOP.set_area($radius);
        $diameter = $NEWOOP.set_diameter($radius);
        $perimeter = $NEWOOP.set_perimeter($radius);
        System.out.println("วงกลมรัศมี "+$radius+" เมตร"+" |=| พื้นที่วงกลม "+$area+" ตารางเมตร");

    }
}
class Calculate_cricle {
    private double area;
    private double diameter;
    private double perimeter;
    final double $PI = 3.14f;
    protected double set_area (int radius) {
        area = (radius*radius)*$PI;
        return area;
    }
    protected double set_diameter (int radius) {
        diameter = 2*radius;
        return diameter;
    }
    protected double set_perimeter (int radius) {
        perimeter = (radius*$PI)*2;
        return perimeter;
    }
}
