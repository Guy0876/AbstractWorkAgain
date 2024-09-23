
public class circle extends shape{

    private float Radius;

    public circle(float radius) {
        Radius = radius;
    }

    public float getRadius() {
        return Radius;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }

    @Override
    float calculateArea() {
        return getRadius()*getRadius()*(float)Math.PI;
    }

    @Override
    float calculatePerimiter() {
        return 2*getRadius()*(float)Math.PI;
    }
}
