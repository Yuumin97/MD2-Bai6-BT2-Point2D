import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;
    private float[] xyz = new float[3];
    public  Point3D(){}


    public Point3D(float x, float y, int i) {
    super(x,y);
    this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
        return xyz;
    }

    public void setXyz(float[] xyz) {
        this.xyz = xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", xyz=" + Arrays.toString(xyz) +
                '}';
    }
}
