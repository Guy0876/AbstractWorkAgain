public class rectangle extends shape{

    private float width;
    private float length;

    public rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    float calculateArea() {
        return getLength()*getWidth();
    }

    @Override
    float calculatePerimiter() {
        return 2*(getLength()+getWidth());
    }
}
