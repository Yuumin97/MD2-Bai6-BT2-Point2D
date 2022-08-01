import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,4);
        System.out.println("in 2D" + point2D);
        Point3D point3D = new Point3D(point2D.getX(),point2D.getY(),3);
        System.out.println(Arrays.toString(point3D.getXyz()));

    }
}