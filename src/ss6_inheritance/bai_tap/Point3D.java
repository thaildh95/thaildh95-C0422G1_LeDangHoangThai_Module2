package ss6_inheritance.bai_tap;

public class Point3D extends Point2D {
    float z ;
    public Point3D(){

    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z){
        getX();
        getY();
        this.z = z;

    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

}
